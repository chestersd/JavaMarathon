package org.chester_sd.day9.task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Ivan Ivanov", "RE-127");
        Teacher teacher = new Teacher("Petr Evdokimov", "Math");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubject());
        student.printInfo();
        teacher.printInfo();
    }
}
