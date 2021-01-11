package com.travelocity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.travelocity.userintarfaces.PaymentPage.LABEL_ITINIRARY_TRAVELOCITY;
import static com.travelocity.userintarfaces.PaymentPage.LABEL_MESSAGE_TRIP_IS_BOOKED;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class ItiniraryNumber implements Question<Boolean> {
    public static ItiniraryNumber confirmed() {
        return new ItiniraryNumber();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        Logger logger = LoggerFactory.getLogger("Itinerario: ");

        actor.attemptsTo(WaitUntil.the(LABEL_MESSAGE_TRIP_IS_BOOKED, isCurrentlyVisible())
                .forNoMoreThan(60).seconds());

        logger.info(LABEL_ITINIRARY_TRAVELOCITY.resolveFor(actor).getText());

        return LABEL_MESSAGE_TRIP_IS_BOOKED.resolveFor(actor).isCurrentlyVisible() &&
                LABEL_ITINIRARY_TRAVELOCITY.resolveFor(actor).isCurrentlyVisible();
    }
}
