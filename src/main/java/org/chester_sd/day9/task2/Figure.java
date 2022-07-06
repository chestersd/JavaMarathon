package org.chester_sd.day9.task2;

public abstract class Figure {
    private String color;

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
