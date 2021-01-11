package com.travelocity.models;

import cucumber.api.DataTable;

import java.util.List;
import java.util.Map;

public class FiltersHotel {

    private String goingTo;
    private String checkIn;
    private String checkOut;
    private String travelersAdults;
    private String travelersChildren;

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
