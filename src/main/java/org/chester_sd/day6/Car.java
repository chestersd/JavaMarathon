package org.chester_sd.day6;

public class Car {
    private int year;
    private String model;
    private String color;

    public void info(){
        System.out.println("This is Car ");
    }

    public int yearDifference(int inputYear) {
        return inputYear - year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
