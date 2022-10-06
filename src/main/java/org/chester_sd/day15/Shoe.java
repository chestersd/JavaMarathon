package org.chester_sd.day15;

public class Shoe {
    private String name;
    private int size;
    private int amount;

    @Override
    public String toString() {
        return "Shoe{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", amount=" + amount +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Shoe(String name, int size, int amount) {
        this.name = name;
        this.size = size;
        this.amount = amount;
    }
}
