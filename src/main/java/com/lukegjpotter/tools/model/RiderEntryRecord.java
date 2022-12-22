package com.lukegjpotter.tools.model;

public class RiderEntryRecord {
    String race, firstName, surname, club;

    public RiderEntryRecord(String race, String firstName, String surname, String club) {
        this.race = race;
        this.firstName = firstName;
        this.surname = surname;
        this.club = club;
    }

    public String getRace() {
        return race;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getClub() {
        return club;
    }
}
