package org.chester_sd.day9.task1;

public class Teacher extends Human{
    private String subject;

    public void printInfo(){
        super.printInfo();
        System.out.println("This teacher has name " + name);
    }

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
