package com.travelocity.tasks;

import com.travelocity.interactions.SelectDaysInto;
import com.travelocity.interactions.SelectFirstResult;
import com.travelocity.models.FiltersHotel;
import com.travelocity.userintarfaces.HomeTravelocityPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchHotel implements Task {

    private final FiltersHotel filtersHotel;

    public SearchHotel(FiltersHotel filtersHotel) {
        this.filtersHotel = filtersHotel;
    }

    public static SearchHotel with(FiltersHotel filtersHotel) {
        return instrumented(SearchHotel.class, filtersHotel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomeTravelocityPage.BUTTON_DESTINATION_HOTEL),
                Enter.theValue(filtersHotel.getGoingTo()).into(HomeTravelocityPage.TEXT_DESTINATION_HOTEL),
                SelectFirstResult.onList(HomeTravelocityPage.XPATH_LIST_RESULTS_DESTINATIONS),
                Click.on(HomeTravelocityPage.CHECK_IN_DATE),
                SelectDaysInto.calendar(filtersHotel.getCheckIn()),
                SelectDaysInto.calendar(filtersHotel.getCheckOut()),
                Click.on(HomeTravelocityPage.BUTTON_SET_DATE),
                Click.on(HomeTravelocityPage.TEXT_TRAVELERS));

        while (!HomeTravelocityPage.LABEL_ADULTS.resolveFor(actor).getValue()
                .equals(filtersHotel.getTravelersAdults())) {
            actor.attemptsTo(Click.on(HomeTravelocityPage.BUTTON_INCREASE_ADULTS));
        }

        while (!HomeTravelocityPage.LABEL_CHILDREN.resolveFor(actor).getValue()
                .equals(filtersHotel.getTravelersChildren())) {
            actor.attemptsTo(Click.on(HomeTravelocityPage.BUTTON_INCREASE_CHILDREN));
        }

        actor.attemptsTo(Click.on(HomeTravelocityPage.BUTTON_DONE_TRAVELERS),
                Click.on(HomeTravelocityPage.BUTTON_SEARCH_HOME));

    }

}
