package org.chester_sd.day7;

public class Task1 {
    public static void main(String[] args) {
        Aircraft B738 = new Aircraft("737-800", 2014, 28, 31, 15);
        Aircraft A321 = new Aircraft("320-100", 2018, 41, 38, 17);

        Aircraft.compareAirplanes(B738, A321);

    }
}
