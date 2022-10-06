package org.chester_sd.day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList());

    }

    public static List<String> parseFileToStringList() {
        File file = new File("src/main/java/org/chester_sd/\u200Bpeople.txt");
        try {
            Scanner scanner = new Scanner(file);
            List<String> people = new ArrayList<>();

            while (scanner.hasNextLine())  {
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                if (Integer.parseInt(person[1]) < 0)
                    throw new IllegalArgumentException();
                people.add(line);
            }
            scanner.close();
            return people;


        } catch (FileNotFoundException e) {
            System.out.println("people file not found");
        } catch (IllegalArgumentException e) {
            System.out.println("people file not valid");
        }
        return null;
    }
}
