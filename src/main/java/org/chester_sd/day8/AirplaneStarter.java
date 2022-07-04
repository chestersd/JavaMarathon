package org.chester_sd.day8;

public class AirplaneStarter {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("Boeing", 2000, 150, 38, 1000);
        System.out.println(aircraft.toString());
    }
}
