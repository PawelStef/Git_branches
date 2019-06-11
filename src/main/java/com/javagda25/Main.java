package com.javagda25;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int howMuch = 0;

        File plik = new File("data.txt");
        if (plik.exists()) {
            try(Scanner scanner = new Scanner(new FileReader("data.txt"))) {


                if (!scanner.hasNextLine()) {
                    System.out.println("brak treeści");
                }

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    howMuch++;
                }

            } catch (FileNotFoundException e) {
                e.getLocalizedMessage();
            }

        }
        System.out.println("linie: " + howMuch);
    }
}
