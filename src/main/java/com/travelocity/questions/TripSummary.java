package com.travelocity.questions;

import com.travelocity.userintarfaces.FlightResultsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TripSummary implements Question<Boolean> {
    public static TripSummary completed() {
        return new TripSummary();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(FlightResultsPage.LABEL_TRIP_SUMMARY, isVisible())
                .forNoMoreThan(30).seconds());

        return FlightResultsPage.LABEL_TRIP_SUMMARY.resolveFor(actor).isCurrentlyVisible();
    }
}
