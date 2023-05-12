package org.module4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\fmohs\\Downloads\\notFoundExample.txt");

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()){
                String line = scanner.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}
