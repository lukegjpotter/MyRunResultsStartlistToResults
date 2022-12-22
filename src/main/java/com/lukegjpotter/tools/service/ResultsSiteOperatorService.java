package com.lukegjpotter.tools.service;

import com.lukegjpotter.tools.model.RaceResults;
import com.lukegjpotter.tools.model.RaceStartlist;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ResultsSiteOperatorService {

    public ResultsSiteOperatorService() {
        WebDriverManager.chromedriver().setup();
    }

    public RaceResults determineRaceResults(RaceStartlist raceStartlist) {
        return null;
    }
}
