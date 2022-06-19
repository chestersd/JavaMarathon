package org.chester_sd.day6;

public class Aircraft {
    String model;
    int year;
    int mass;
    int length;
    int fuel = 0;

    public void fillUp(int addedFuel){
        fuel += addedFuel;
    }

    public void info(){
        System.out.println("model " + model + ", year " + year + ", mass " + mass + ", length " + length + ", fuel " + fuel);
    }

    public Aircraft(String model, int year, int mass, int length, int fuel) {
        this.model = model;
        this.year = year;
        this.mass = mass;
        this.length = length;
        this.fuel = fuel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
