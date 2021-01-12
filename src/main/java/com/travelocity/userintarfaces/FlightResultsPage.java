package com.travelocity.userintarfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FlightResultsPage {

    public static final String XPATH_AIRLINES_FLIGHT_RESULTS = "//span[contains(text(),'{0}')]/parent::label";
    public static final Target LABEL_TITLE_CITY = Target.the("Titulo ciudad destino")
            .locatedBy("//span[@data-test-id='title-city-text']");
    public static final String XPATH_BUTTON_SELECT_FLIGTH = "//button[@data-test-id='select-button']";
    public static final Target BUTTON_ADD_HOTEL_NO = Target.the("Boton Añadir hotel no gracias")
            .locatedBy("//span[@class='no-thanks-content']");
    public static final Target LABEL_TRIP_SUMMARY = Target.the("Resumen de vuelo")
            .locatedBy("//div[@class='uitk-col desktop-col-1-3 tablet-col-1-1']//div[@class='tripSummary']");

    private FlightResultsPage() {
    }
}
