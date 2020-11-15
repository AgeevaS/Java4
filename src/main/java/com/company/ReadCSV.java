package com.company;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.HashMap;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadCSV {
    public LinkedList<Human> readCSVFile(String csvFilePatch, char separator) {
        LinkedList<Human> result = new LinkedList<>();
        long newId = 1;
        HashMap<String, Division> divisions = new HashMap<>();

        try (InputStream in = getClass().getResourceAsStream(csvFilePatch);
             CSVReader reader = in == null ? null : new CSVReaderBuilder(new InputStreamReader(in)).withCSVParser(new CSVParserBuilder().withSeparator(separator).build()).build()) {
            if (reader == null) {
                throw new FileNotFoundException(csvFilePatch);
            }
            SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
            String[] nextLine; reader.readNext();
            while ((nextLine = reader.readNext()) != null) {
                Division nowDivision;
                if(divisions.containsKey(nextLine[4])) {
                    nowDivision = divisions.get(nextLine[4]);
                } else {
                    nowDivision = new Division(newId, nextLine[4]);
                    divisions.put(nextLine[4], nowDivision);
                    newId++;
                }
                    result.add(new Human(Long.parseLong(nextLine[0]), nextLine[1], nextLine[2],
                            formatter.parse(nextLine[3]), nowDivision, Integer.parseInt(nextLine[5])));
            }
        } catch (IOException | CsvValidationException | ParseException Per) {
            Per.printStackTrace();
        }
        return result;
    }
}
