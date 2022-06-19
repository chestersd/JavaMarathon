package org.chester_sd.day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);

        int maxSum = 0;
        int indexMaxSum = 0;
        for (int i = 0; i < array.length - 2; i++){
            if((array[i] + (array[i + 1]) + (array[i + 2])) > maxSum) {
                maxSum = array[i] + (array[i + 1]) + (array[i + 2]);
                indexMaxSum = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(indexMaxSum);
    }
}
