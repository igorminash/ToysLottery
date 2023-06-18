package org.example;

public class Toys {
    private int id;
    private String name;
    private int count;
    public double frequency;

    public Toys(int id, String name, int count, double frequency) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.frequency = frequency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
}
