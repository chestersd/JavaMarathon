package org.chester_sd.day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike moto = new Motorbike(2022, "M1nsk X250 ", " Blue ");

        System.out.println("My motorbike:  " + moto.getColor() + moto.getModel() + moto.getYear());
    }
}
