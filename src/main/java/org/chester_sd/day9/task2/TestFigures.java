package org.chester_sd.day9.task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 10, 20, 30),
                new Triangle("Red", 10, 20, 15),
                new Rectangle("Red", 5, 10),
                new Rectangle("Orange", 40, 15),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5)
        };

        System.out.println("Perimeter of red is " + calculateRedPerimeter(figures));
        System.out.println("Area of red is " + calculateRedArea(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double perimeter = 0.0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                perimeter += figure.calculatePerimeter();
            }
        }
        return perimeter;
    }

    public static double calculateRedArea(Figure[] figures){
        double area = 0.0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                area += figure.calculateArea();
            }
        }
        return area;
    }
}
