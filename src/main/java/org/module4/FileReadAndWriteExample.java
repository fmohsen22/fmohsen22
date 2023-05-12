package org.module4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadAndWriteExample {
    public static void main(String[] args) throws IOException {

        String fileName =  "C:\\Users\\fmohs\\Downloads\\testFileName.txt";

        File file = new File(fileName);

        //write the file in a directory

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write("test text!!!");

        writer.close();


        //read the File

        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()){
            String line = scanner.nextLine();
            System.out.println(line);
        }



    }
}
