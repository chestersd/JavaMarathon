package org.chester_sd.day6;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setYear(2019);
        car.setModel("Hyundai Santa Fe ");
        car.setColor("White ");

        Motorbike moto = new Motorbike(2014, "M1nsk X250 ", " Blue ");

        car.info();
        moto.info();

        System.out.println(car.yearDifference(2022));
        System.out.println(moto.yearDifference(2022));
    }
}
