package com.company;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;


public class FileIO {

    ArrayList<String> readGameData() {


        File file = new File("src/com/company/data.txt");
        ArrayList<String> data = new ArrayList<>();
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                data.add(scan.nextLine());//“Egon: 30000”
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }
}