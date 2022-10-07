package org.chester_sd.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextFileWriter {
    public static void main(String[] args) throws FileNotFoundException {
        transferCsvToTxt();
        }
    public static List<Shoe> transferCsvToTxt() {

        File file = new File("src/main/resources/shoes.csv");
        File tFile = new File("src/main/resources/textFile.txt");

        try {
            Scanner scanner = new Scanner(file);
            List<Shoe> listShoes = new ArrayList<>();

            PrintWriter printWriter = new PrintWriter(tFile);


            while (scanner.hasNextLine())  {
                String line = scanner.nextLine();

                if (line.contains("#")) {
                    continue;
                }

//                printWriter.println(line);
                String[] shoes = line.split(";");
                if (Integer.parseInt(shoes[1]) < 33)
                    throw new IllegalArgumentException();

                Shoe currentShoe = new Shoe(shoes[0], Integer.parseInt(shoes[1]), Integer.parseInt(shoes[2]));
                listShoes.add(currentShoe);

                printWriter.println(shoes[0] + ", " + shoes[1] + ", " + shoes[2]);

            }
            scanner.close();
            printWriter.close();

            return listShoes;
        } catch (FileNotFoundException e) {
            System.out.println("shoes.csv not found");
        } catch (IllegalArgumentException e) {
            System.out.println("shoes.csv is not valid");
        }
        return null;
    }

}
