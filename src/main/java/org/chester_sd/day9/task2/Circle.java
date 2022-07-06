package org.chester_sd.day9.task2;

public class Circle extends Figure {
    private double radiusCircle;

    public Circle(String color, double radiusCircle) {
        super(color);
        this.radiusCircle = radiusCircle;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radiusCircle * radiusCircle;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radiusCircle;
    }
}
