package com.lukegjpotter.tools.model;

import java.util.ArrayList;
import java.util.List;

public class RaceStartlist {

    List<RiderEntryRecord> riderEntries;

    public RaceStartlist() {
        riderEntries = new ArrayList<>();
    }

    public void addRiderToStartlist(String race, String firstName, String surname, String club) {
        riderEntries.add(new RiderEntryRecord(race, firstName, surname, club));
    }
}
