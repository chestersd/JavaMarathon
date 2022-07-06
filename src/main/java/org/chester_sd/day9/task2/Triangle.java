package org.chester_sd.day9.task2;

public class Triangle extends Figure{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String color, double sideA, double sideB, double sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double demiPerimeter = (sideA + sideB + sideC) / 2;
        double number = demiPerimeter * (demiPerimeter - sideA) * (demiPerimeter - sideB) * (demiPerimeter - sideC);
        return Math.sqrt(number);
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}
