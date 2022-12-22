package com.lukegjpotter.tools.service;

import com.lukegjpotter.tools.model.RaceStartlist;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class StartlistReaderService {

    String startlistFileName;

    public StartlistReaderService(String startlistFileName) {
        this.startlistFileName = startlistFileName;
    }

    public RaceStartlist determineRaceEntrants() {
        RaceStartlist raceStartlist = new RaceStartlist();

        try (CSVReader reader = new CSVReaderBuilder(new FileReader(startlistFileName)).withSkipLines(1).build()) {

            String[] lineInArray;

            while ((lineInArray = reader.readNext()) != null) {
                raceStartlist.addRiderToStartlist(lineInArray[0], lineInArray[1], lineInArray[2], lineInArray[3]);
            }
        } catch (IOException | CsvValidationException e) {
            throw new RuntimeException(e);
        }

        return raceStartlist;
    }
}
