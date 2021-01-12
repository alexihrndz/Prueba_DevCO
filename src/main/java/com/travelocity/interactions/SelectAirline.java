package com.travelocity.interactions;

import com.travelocity.userintarfaces.FlightResultsPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectAirline implements Interaction {

    private final String airLine;

    public SelectAirline(String airLine) {
        this.airLine = airLine;
    }

    public static SelectAirline toFlight(String airLine) {
        return instrumented(SelectAirline.class, airLine);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebElementFacade checkAirline = BrowseTheWeb.as(actor)
                .findAll(FlightResultsPage.XPATH_AIRLINES_FLIGHT_RESULTS.replace("{0}", airLine)).get(0);

        actor.attemptsTo(Click.on(checkAirline),
                ClickOnButton.firstFlight(),
                ClickOnButton.firstFlight(),
                Check.whether(FlightResultsPage.BUTTON_ADD_HOTEL_NO.resolveFor(actor).isVisible())
                        .andIfSo(Click.on(FlightResultsPage.BUTTON_ADD_HOTEL_NO)),
                SwitchToNewWindow.now());
    }
}
