package com.lukegjpotter.tools;

import com.lukegjpotter.tools.model.RaceResults;
import com.lukegjpotter.tools.model.RaceStartlist;
import com.lukegjpotter.tools.service.ResultsPrinterService;
import com.lukegjpotter.tools.service.ResultsSiteOperatorService;
import com.lukegjpotter.tools.service.StartlistReaderService;

public class Controller {

    public static void main(String[] args) {

        // Setup - Change as needed.
        String startlistFileName = "/Users/lukegjpotter/Downloads/NavanStartlist.csv";
        String resultsFileName = "/Users/lukegjpotter/Downloads/NavanResults.csv";
        Boolean hasInLap = true;

        StartlistReaderService startlistReaderService = new StartlistReaderService(startlistFileName);
        ResultsSiteOperatorService resultsSiteOperatorService = new ResultsSiteOperatorService();
        ResultsPrinterService resultsPrinterService = new ResultsPrinterService();

        RaceStartlist raceStartlist = startlistReaderService.determineRaceEntrants();
        RaceResults raceResults = resultsSiteOperatorService.determineRaceResults(raceStartlist);
        resultsPrinterService.printResultsToCsv(raceResults, hasInLap, resultsFileName);

        System.exit(0);
    }
}
