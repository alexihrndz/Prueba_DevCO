package com.travelocity.tasks;

import com.travelocity.interactions.GoTo;
import com.travelocity.interactions.SelectDaysInto;
import com.travelocity.interactions.SelectFirstResult;
import com.travelocity.models.FiltersFlight;
import com.travelocity.userintarfaces.FlightResultsPage;
import com.travelocity.userintarfaces.HomeTravelocityPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchFlight implements Task {

    private final FiltersFlight filtersFlight;

    public SearchFlight(FiltersFlight filtersFlight) {
        this.filtersFlight = filtersFlight;
    }

    public static SearchFlight with(FiltersFlight filtersFligth) {
        return instrumented(SearchFlight.class, filtersFligth);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeTravelocityPage.BUTTON_ORIGIN_FLIGHT),
                Enter.theValue(filtersFlight.getCityFrom()).into(HomeTravelocityPage.TEXT_ORIGIN_FLIGTH),
                SelectFirstResult.onList(HomeTravelocityPage.XPATH_ORIGINS_FLIGHT_RESULTS),
                Click.on(HomeTravelocityPage.BUTTON_DESTINATION_FLIGHT),
                Enter.theValue(filtersFlight.getCityGoingTo()).into(HomeTravelocityPage.TEXT_DESTINATION_FLIGTH),
                SelectFirstResult.onList(HomeTravelocityPage.XPATH_DESTINATIONS_RESULTS),
                Click.on(HomeTravelocityPage.CHECK_IN_DATE),
                SelectDaysInto.calendar(filtersFlight.getDepartingDate()),
                SelectDaysInto.calendar(filtersFlight.getReturningDate()),
                GoTo.option(filtersFlight.getTypeTrip()),
                Click.on(HomeTravelocityPage.LINK_TRAVELERS_FLIGHT));

        while (!HomeTravelocityPage.LABEL_ADULTS.resolveFor(actor).getValue()
                .equals(filtersFlight.getTravelersAdults())) {
            actor.attemptsTo(Click.on(HomeTravelocityPage.BUTTON_INCREASE_ADULTS));
        }

        actor.attemptsTo(Click.on(HomeTravelocityPage.BUTTON_DONE_TRAVELERS),
                Click.on(HomeTravelocityPage.LINK_PREFERRED_CLASS));

        List<WebElementFacade> listPreferredClass = BrowseTheWeb.as(actor).findAll(HomeTravelocityPage.XPATH_PREFERRED_CLASS);

        for (WebElementFacade preferredClass : listPreferredClass) {
            if (preferredClass.containsText(filtersFlight.getTypeClass())) {
                actor.attemptsTo(Click.on(preferredClass));
                break;
            }
        }
        actor.attemptsTo(Click.on(HomeTravelocityPage.BUTTON_SEARCH_HOME),
                WaitUntil.the(FlightResultsPage.LABEL_TITLE_CITY, isVisible())
                        .forNoMoreThan(30).seconds());
    }
}
