package com.travelocity.interactions;

import com.travelocity.userintarfaces.HomeTravelocityPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static com.travelocity.utils.ConstantsStrings.ATTRIBUTE_ARIA_LABEL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectDaysInto implements Interaction {

    private final String daySelected;

    public SelectDaysInto(String daySelected) {
        this.daySelected = daySelected;
    }

    public static SelectDaysInto calendar(String daySelected) {
        return instrumented(SelectDaysInto.class, daySelected);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> listDays = BrowseTheWeb.as(actor).findAll(HomeTravelocityPage.XPATH_DAYS_CALENDAR);

        for (WebElementFacade checkIntoCalendar : listDays) {
            if (checkIntoCalendar.getAttribute(ATTRIBUTE_ARIA_LABEL).contains(daySelected)) {
                actor.attemptsTo(Click.on(checkIntoCalendar));
                break;
            }
        }
    }
}
