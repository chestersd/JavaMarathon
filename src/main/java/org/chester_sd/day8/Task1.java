package org.chester_sd.day8;

public class Task1 {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        String bigLine = "";
        String string = "";
        int number = 0;
        for (int i = 0; i <= 20000; i++){
            number = i;
            string = Integer.toString(number) + " ";
            bigLine += string;
        }
        long after = System.currentTimeMillis();
        System.out.println(bigLine);
        System.out.println("Время выполнения с классом String: " + (after - before));

    }


}
