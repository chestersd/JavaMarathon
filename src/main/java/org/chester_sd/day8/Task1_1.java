package org.chester_sd.day8;

public class Task1_1 {
    public static void main(String[] args) {

        long before = System.currentTimeMillis();

        String bigLine = "";
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i <= 20000; i++) {
            stringBuilder.append(i).append(" ");

        }
        long after = System.currentTimeMillis();

        System.out.println(stringBuilder);
        System.out.println("Время выполнения с классом StringBuilder: " + (after - before));

    }
}
