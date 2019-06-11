package com.javagda25;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class Write {


public void writeFile(){
    try(PrintWriter printWriter = new PrintWriter(new FileWriter("data.txt", true));) {

        printWriter.println("Hello world!");


    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
