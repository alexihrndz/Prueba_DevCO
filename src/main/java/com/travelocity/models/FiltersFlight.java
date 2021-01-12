package com.travelocity.models;

import cucumber.api.DataTable;

import java.util.List;
import java.util.Map;

public class FiltersFlight {

    private final String typeTrip;
    private final String travelersAdults;
    private final String typeClass;
    private final String cityFrom;
    private final String cityGoingTo;
    private final String departingDate;
    private final String returningDate;

    public String getTypeTrip() {
        return typeTrip;
    }

    public String getTravelersAdults() {
        return travelersAdults;
    }

    public String getTypeClass() {
        return typeClass;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public String getCityGoingTo() {
        return cityGoingTo;
    }

    public String getDepartingDate() {
        return departingDate;
    }

    public String getReturningDate() {
        return returningDate;
    }

    public FiltersFlight(DataTable filters) {
        List<Map<String, String>> filter = filters.asMaps(String.class, String.class);
        this.typeTrip = filter.get(0).get("typeTrip");
        this.travelersAdults = filter.get(0).get("travelersAdults");
        this.typeClass = filter.get(0).get("typeClass");
        this.cityFrom = filter.get(0).get("cityFrom");
        this.cityGoingTo = filter.get(0).get("cityGoingTo");
        this.departingDate = filter.get(0).get("departingDate");
        this.returningDate = filter.get(0).get("returningDate");
    }
}
