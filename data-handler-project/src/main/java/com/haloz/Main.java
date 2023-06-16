package com.haloz;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File(
                    "F:\\Oleg\\Projects\\Java\\data-handler\\data-handler-project\\src\\main\\java\\com\\haloz\\protofile.proto"
            );
            Scanner scanner = new Scanner(file);b v
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            System.out.println("file = " + file);
            System.out.println("file.length() = " + file.length());
        } catch (Exception e) {
            e.printStackTrace();
          }
    }
}