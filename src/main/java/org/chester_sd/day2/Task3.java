package org.chester_sd.day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
//        int counter = 0;
        if (numA >= numB){
            System.out.println("Некорректный ввод");
        }else{

            while (numA < numB){
                if(numA % 5 == 0 && numA % 10 > 0){
                    numA++;
                    System.out.print(numA + " ");
                }
            }
        }
    }
}
