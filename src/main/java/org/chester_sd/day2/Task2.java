package org.chester_sd.day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();

        if (numA >= numB){
            System.out.println("Некорректный ввод");
        }else{
            for (int i = numA + 1; i < numB; i++){
                if(i % 5 == 0 && i % 10 > 0){
                    System.out.print(i + " ");
                }

            }

        }

    }
}
