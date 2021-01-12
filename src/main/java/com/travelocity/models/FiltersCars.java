package com.travelocity.models;

import cucumber.api.DataTable;

import java.util.List;
import java.util.Map;

public class FiltersCars {

    private final String pickUpCity;
    private final String dropOffCity;
    private final String pickUpDate;
    private final String dropOffDate;
    private final String pickupTime;
    private final String dropOffTime;

    public String getPickUpCity() {
        return pickUpCity;
    }

    public String getDropOffCity() {
        return dropOffCity;
    }

    public String getPickUpDate() {
        return pickUpDate;
    }

    public String getDropOffDate() {
        return dropOffDate;
    }

    public String getPickupTime() {
        return pickupTime;
    }

    public String getDropOffTime() {
        return dropOffTime;
    }

    public FiltersCars(DataTable filters) {
        List<Map<String, String>> filter = filters.asMaps(String.class, String.class);
        this.pickUpCity = filter.get(0).get("pickUpCity");
        this.dropOffCity = filter.get(0).get("dropOffCity");
        this.pickUpDate = filter.get(0).get("pickUpDate");
        this.dropOffDate = filter.get(0).get("dropOffDate");
        this.pickupTime = filter.get(0).get("pickupTime");
        this.dropOffTime = filter.get(0).get("dropOffTime");
    }
}
