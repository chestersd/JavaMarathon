package org.chester_sd.day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество этажей: ");
        int numFloor = scanner.nextInt();
        if (numFloor > 0 && numFloor < 5){
            System.out.println("Малоэтажный дом");
        } else if (numFloor > 4 && numFloor < 9){
            System.out.println("Среднеэтажный дом");
        } else if (numFloor > 8){
            System.out.println("Многоэтажный дом");
        } else if (numFloor < 0 ){
            System.out.println("Ошибка ввода");
        }

    }
}
