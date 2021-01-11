package com.travelocity.models;

import cucumber.api.DataTable;

import java.util.List;
import java.util.Map;

public class DataReserveAndPay {

    private final String contactName;
    private final String countryCode;
    private final String phoneNumber;
    private final String creditCardName;
    private final String creditCardNumber;
    private final String expMonth;
    private final String expYear;
    private final String secCode;
    private final String countryAddress;
    private final String billingAddres1;
    private final String city;
    private final String state;
    private final String zipCode;
    private final String emailAddress;

    public String getContactName() {
        return contactName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCreditCardName() {
        return creditCardName;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getExpMonth() {
        return expMonth;
    }

    public String getExpYear() {
        return expYear;
    }

    public String getSecCode() {
        return secCode;
    }

    public String getCountryAddress() {
        return countryAddress;
    }

    public String getBillingAddres1() {
        return billingAddres1;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public DataReserveAndPay(DataTable dataPay) {
        List<Map<String, String>> data = dataPay.asMaps(String.class, String.class);
        this.contactName = data.get(0).get("contactName");
        this.countryCode = data.get(0).get("countryCode");
        this.phoneNumber = data.get(0).get("phoneNumber");
        this.creditCardName = data.get(0).get("creditCardName");
        this.creditCardNumber = data.get(0).get("creditCardNumber");
        this.expMonth = data.get(0).get("expMonth");
        this.expYear = data.get(0).get("expYear");
        this.secCode = data.get(0).get("secCode");
        this.countryAddress = data.get(0).get("countryAddress");
        this.billingAddres1 = data.get(0).get("billingAddres1");
        this.city = data.get(0).get("city");
        this.state = data.get(0).get("state");
        this.zipCode = data.get(0).get("zipCode");
        this.emailAddress = data.get(0).get("emailAddress");
    }
}
