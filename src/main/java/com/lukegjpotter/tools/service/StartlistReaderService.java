package com.lukegjpotter.tools.service;

import com.lukegjpotter.tools.model.RaceStartlist;

public class StartlistReaderService {

    String startlistFileName;

    public StartlistReaderService(String startlistFileName) {
        this.startlistFileName = startlistFileName;
    }

    public RaceStartlist determineRaceEntrants() {
        RaceStartlist raceStartlist = new RaceStartlist();

        String race = "", firstName = "", surname = "", club = "";
        raceStartlist.addRiderToStartlist(race, firstName, surname, club);

        return raceStartlist;
    }
}
