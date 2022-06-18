package org.chester_sd.day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numA = scanner.nextInt();
        int numB = scanner.nextInt();

        int counter = numA +1;
        while (counter < numB) {
            if (numA >= numB) {
                System.out.println("Некорректный ввод");
            } else if (counter % 5 == 0 && counter % 10 != 0) {
                System.out.print(counter + " ");
            }
            counter++;

        }
    }
}
