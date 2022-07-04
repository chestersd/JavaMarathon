package org.chester_sd.day7;

public class Aircraft {
    String model;
    int year;
    int mass;
    int length;
    int fuel = 0;


    public String getModel() {
        return model;
    }

    public static void compareAirplanes(Aircraft B738, Aircraft A321){
        if(B738.getLength() > A321.getLength()) {
            System.out.println("Первый сомолет длинее");
        } else if (B738.getLength() < A321.getLength()) {
            System.out.println("Второй сомолет длинее");
        } else {
            System.out.println("Самолеты равны по длине");
        }
    }

    public int getYear() {
        return year;
    }

    public int getMass() {
        return mass;
    }

    public int getLength() {
        return length;
    }

    public int getFuel() {
        return fuel;
    }


    public void fillUp(int addedFuel){
        fuel += addedFuel;
    }

    public void info(){
        System.out.println("model " + model + ", year " + year + ", mass " + mass + ", length " + length + ", fuel " + fuel);
    }

    public Aircraft(String model, int year, int mass, int length, int fuel) {
        this.model = model;
        this.year = year;
        this.mass = mass;
        this.length = length;
        this.fuel = fuel;
    }


}
