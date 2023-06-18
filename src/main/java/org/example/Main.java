package org.example;

public class Main {
    public static void main(String[] args) {
        ToysStore store = new ToysStore();

        Toys toy1 = new Toys(1, "Умные часы", 5, 20);
        Toys toy2 = new Toys(2, "Мягкая игрушка", 20, 60);
        Toys toy3 = new Toys(3, "Наушники", 10, 40);
        Toys toy4 = new Toys(4, "Водный пистолет", 20, 70);
        Toys toy5 = new Toys(5, "Конструктор", 7, 25);

        store.addToys(toy1);
        store.addToys(toy2);
        store.addToys(toy3);
        store.addToys(toy4);
        store.addToys(toy5);

        store.GetFrequency(1,5);

        store.getLottery();

        Toys prizeToy = store.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Поздравляем! Ваш выйгрыш: " + prizeToy.getName());
        }
    }
}
