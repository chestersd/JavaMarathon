package org.chester_sd.day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2022);
        car.setModel("Hyundai Santa Fe ");
        car.setColor("White ");

        System.out.println("My car: " + car.getColor() + car.getModel() + car.getYear());

    }
}
