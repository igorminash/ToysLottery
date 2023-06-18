package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ToysStore {


    private ArrayList <Toys> toys = new ArrayList<Toys>();;
    private ArrayList <Toys> prizeToys = new ArrayList<Toys>();;
    private String FileWithPrizeToys = "prizeList.txt";

    public void addToys(Toys toy) {
        toys.add(toy);
    }

    public void GetFrequency(int id, double newFrequency){
        for (Toys toy: toys){
            if (toy.getId() == id){
                toy.setFrequency(newFrequency);
            }
        }
    }
    public Toys getPrizeToy() {
        if (!prizeToys.isEmpty()) {
            Toys prizeToy = prizeToys.remove(0);
            prizeToy.setCount(prizeToy.getCount() - 1);
            try {
                FileWriter writer = new FileWriter(FileWithPrizeToys, true);
                writer.write(prizeToy.getName() + "\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Ошибка при записи");
            }
            return prizeToy;
        } else {
            System.out.println("Все призы разыграны");
            return null;
        }
    }

    public void getLottery() {
        prizeToys.clear();
        for (Toys toy : toys) {
            double random = Math.random() * 100;
            if (random < toy.getFrequency()) {
                prizeToys.add(toy);
            }
        }
    }
}

