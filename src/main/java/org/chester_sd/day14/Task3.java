package org.chester_sd.day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList());

    }

    public static List<Person> parseFileToObjList() {
        File file = new File("src/main/java/org/chester_sd/\u200Bpeople.txt");

        try {
            Scanner scanner = new Scanner(file);
            List<Person> people = new ArrayList<>();

            while (scanner.hasNextLine())  {
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                if (Integer.parseInt(person[1]) < 0)
                    throw new IllegalArgumentException();

                Person currentPerson = new Person(person[0], Integer.parseInt(person[1]));
                people.add(currentPerson);
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
