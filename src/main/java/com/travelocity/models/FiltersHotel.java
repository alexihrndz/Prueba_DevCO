package com.travelocity.models;

import cucumber.api.DataTable;

import java.util.List;
import java.util.Map;

public class FiltersHotel {

    private final String goingTo;
    private final String checkIn;
    private final String checkOut;
    private final String travelersAdults;
    private final String travelersChildren;

    public String getGoingTo() {
        return goingTo;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public String getTravelersAdults() {
        return travelersAdults;
    }

    public String getTravelersChildren() {
        return travelersChildren;
    }

    public FiltersHotel(DataTable filters) {
        List<Map<String, String>> filter = filters.asMaps(String.class, String.class);
        this.goingTo = filter.get(0).get("goingTo");
        this.checkIn = filter.get(0).get("checkIn");
        this.checkOut = filter.get(0).get("checkOut");
        this.travelersAdults = filter.get(0).get("travelersAdults");
        this.travelersChildren = filter.get(0).get("travelersChildren");
    }

}
