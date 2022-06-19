package org.chester_sd.day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[100];

        
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);

        int max = 0;
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println("Max: " + max);

        int min = 10000;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        System.out.println("Min: " + min);

        int zero = 0;
        int sum0 = 0;
        for (int element : array) {
            if (element % 10 == 0) {
                zero++;
                sum0 += element;
            }
        }
        System.out.println("Zero: " + zero);
        System.out.println("Sum 0: " + sum0);



    }
}
