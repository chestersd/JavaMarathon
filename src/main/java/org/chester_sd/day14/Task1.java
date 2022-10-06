package org.chester_sd.day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/java/org/chester_sd/file.txt");
        printSumDigits(file);
    }

    public static void printSumDigits(File file){

        try {
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            if (numbers.length != 10)
                throw new IllegalArgumentException();

            int sum = 0;

            for (String number : numbers)
                sum += Integer.parseInt(number);
            System.out.println(sum);

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IllegalArgumentException e) {
            System.out.println("File is not valid");
        }
    }
}
