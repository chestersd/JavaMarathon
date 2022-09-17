package org.chester_sd.day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {


    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Kia");
        cars.add("Hyundai");
        cars.add("Mitsubishi");
        cars.add("Mazda");
        cars.add("Nissan");
        System.out.println(cars);

        cars.add(3, "Porsche");
        cars.remove(0);
        System.out.println(cars);

    }
}
