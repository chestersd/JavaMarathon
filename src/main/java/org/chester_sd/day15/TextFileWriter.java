package org.chester_sd.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextFileWriter {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(transferCsvToTxt());
        }
    public static List<Shoe> transferCsvToTxt() {

        File file = new File("src/main/resources/shoes.csv");
//        PrintWriter printWriter = new PrintWriter(file);
//
//        printWriter.close();

        try {
            Scanner scanner = new Scanner(file);
            List<Shoe> listShoes = new ArrayList<>();

            while (scanner.hasNextLine())  {
                String line = scanner.nextLine();
                String[] shoes = line.split(";");
                if (Integer.parseInt(shoes[1]) < 33)
                    throw new IllegalArgumentException();

                Shoe currentShoe = new Shoe(shoes[0], Integer.parseInt(shoes[1]), Integer.parseInt(shoes[2]));
                listShoes.add(currentShoe);
            }
            scanner.close();
            return listShoes;
        } catch (FileNotFoundException e) {
            System.out.println("shoes.csv not found");
        } catch (IllegalArgumentException e) {
            System.out.println("shoes.csv is not valid");
        }
        return null;
    }

}
