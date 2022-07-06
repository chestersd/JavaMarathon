package org.chester_sd.day9.task1;

public class Human {
    protected String name;

    public void printInfo(){
        System.out.println("This man has name " + name);
    }

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
