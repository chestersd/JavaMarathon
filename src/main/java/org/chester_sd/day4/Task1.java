package org.chester_sd.day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();

        Random random = new Random();

        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(array));

        System.out.println("Длина массива " + array.length);

        int counter8 = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8) {
                counter8++;
            }
        }

        System.out.println("> 8: " + counter8);

        int numOf1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                numOf1++;
            }
        }

        System.out.println("1 : " + numOf1);

        int even = 0;
        int odd = 0;

        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2 ) == 0) {
                even++;
            } else if ((array[i] % 2 ) != 0)
                odd++;
        }

        System.out.println("Четных " + even);
        System.out.println("Нечетных " + odd);

        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ = summ + array[i];
            }

        System.out.println("Summ : " + summ);
    }


}
