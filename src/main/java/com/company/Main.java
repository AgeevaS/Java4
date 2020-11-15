package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String csvFilePatch = "/foreign_names.csv";
        char separator = ';';
        ReadCSV read = new ReadCSV();
        LinkedList<Human> result= read.readCSVFile(csvFilePatch, separator);
        for (Human human : result) {
            System.out.println(human);
        }
    }
}
