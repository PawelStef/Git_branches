package com.javagda25;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Read {
    int howMuch = 0;
    File plik = new File("data.txt");

    Scanner scanner = null;

    {
        try {
            scanner = new Scanner(new FileReader("data.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    {
        if (!scanner.hasNextLine()) {
            System.out.println("brak treeści");
        }
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            howMuch++;
        }


         System.out.println("linie: " + howMuch);
    }
}
