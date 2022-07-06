package org.chester_sd.day9.task1;

public class Student extends Human{
    private String groupName;

    public void printInfo(){
        super.printInfo();
        System.out.println("This student has name" + name);
    }

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
