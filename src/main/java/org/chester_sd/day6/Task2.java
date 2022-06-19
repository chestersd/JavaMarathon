package org.chester_sd.day6;

public class Task2 {
    public static void main(String[] args) {
        Aircraft B737 = new Aircraft("Boeing 737-800", 2018, 26, 34,60);

        B737.setLength(36);
        B737.setFuel(10);
        B737.fillUp(5);
        B737.fillUp(15);
        B737.info();
    }
}
