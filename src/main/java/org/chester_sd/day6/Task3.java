package org.chester_sd.day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Алла Ивановна", "Математика");
        Student student = new Student("Иван Петров");

        teacher.evaluate(student);
    }

}
