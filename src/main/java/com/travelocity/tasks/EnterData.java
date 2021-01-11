package com.travelocity.tasks;

import com.travelocity.models.FiltersHotel;
import com.travelocity.userintarfaces.HomeTravelocityPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import sun.awt.AWTAccessor;

import java.util.List;

import static com.travelocity.utils.ConstantsStrings.ATTRIBUTE_ARIA_LABEL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterData implements Task {

    private FiltersHotel filtersHotel;

    public EnterData(FiltersHotel filtersHotel) {
        this.filtersHotel = filtersHotel;
    }

    public static EnterData toFilters(FiltersHotel filtersHotel) {
        return instrumented(EnterData.class, filtersHotel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeTravelocityPage.TEXT_GOING_TO),
                Enter.theValue(filtersHotel.getGoingTo()).into(HomeTravelocityPage.TEXT_WHERE_ARE_YOU_GOING));

        BrowseTheWeb.as(actor).findAll(HomeTravelocityPage.XPATH_LIST_RESULTS_GOING_TO).get(0).click();

        actor.attemptsTo(Click.on(HomeTravelocityPage.CHECK_IN_DATE));

        List<WebElementFacade> listDays = BrowseTheWeb.as(actor).findAll(HomeTravelocityPage.XPATH_DAYS_CALENDAR);

        selectCheckInDay(listDays, actor);

        selectCheckOutDay(listDays, actor);

        actor.attemptsTo(Click.on(HomeTravelocityPage.BUTTON_SET_DATE),
                Click.on(HomeTravelocityPage.TEXT_TRAVELERS));

        while (!HomeTravelocityPage.LABEL_ADULTS.resolveFor(actor).getValue()
                .equals(filtersHotel.getTravelersAdults())){
            actor.attemptsTo(Click.on(HomeTravelocityPage.BUTTON_INCREASE_ADULTS));
        }

        while (!HomeTravelocityPage.LABEL_CHILDREN.resolveFor(actor).getValue()
                .equals(filtersHotel.getTravelersChildren())){
            actor.attemptsTo(Click.on(HomeTravelocityPage.BUTTON_INCREASE_CHILDREN));
        }



    }

    private <T extends Actor> void selectCheckOutDay(List<WebElementFacade> listDays, T actor) {
        for (WebElementFacade checkOut : listDays) {
            if (checkOut.getAttribute(ATTRIBUTE_ARIA_LABEL).contains(filtersHotel.getCheckOut())) {
                actor.attemptsTo(Click.on(checkOut));
                break;
            }
        }
    }

    private <T extends Actor> void selectCheckInDay(List<WebElementFacade> listDays, T actor) {
        for (WebElementFacade checkIn : listDays) {
            if (checkIn.getAttribute(ATTRIBUTE_ARIA_LABEL).contains(filtersHotel.getCheckIn())) {
                actor.attemptsTo(Click.on(checkIn));
                break;
            }
        }
    }
}
