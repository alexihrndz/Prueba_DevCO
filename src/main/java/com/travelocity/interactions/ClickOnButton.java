package com.travelocity.interactions;

import com.travelocity.userintarfaces.FlightResultsPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnButton implements Interaction {
    public static ClickOnButton firstFlight() {
        return instrumented(ClickOnButton.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElementFacade button = BrowseTheWeb.as(actor).findAll(FlightResultsPage.XPATH_BUTTON_SELECT_FLIGTH).get(0);
        actor.attemptsTo(Click.on(button));
    }
}
