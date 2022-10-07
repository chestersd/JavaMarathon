package org.chester_sd.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File numbers = new File("src/main/java/org/chester_sd/file.txt");
        printResult(numbers);

    }

    public static void printResult(File numbers) {
        try {
            Scanner scanner = new Scanner(numbers);
            String line = scanner.nextLine();
            String[] nums = line.split(" ");
            int sum = 0;
            for (String num : nums) {
                sum += Integer.parseInt(num);
            }

            double result = sum / (double)nums.length;
            System.out.println(result);
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

    }
}
