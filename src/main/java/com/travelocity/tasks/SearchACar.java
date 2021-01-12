package com.travelocity.tasks;

import com.travelocity.interactions.SelectDaysInto;
import com.travelocity.interactions.SelectFirstResult;
import com.travelocity.models.FiltersCars;
import com.travelocity.userintarfaces.CarOffersResultsPage;
import com.travelocity.userintarfaces.HomeTravelocityPage;
import com.travelocity.utils.ConstantsStrings;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchACar implements Task {

    private final FiltersCars filtersCars;

    public SearchACar(FiltersCars filtersCars) {
        this.filtersCars = filtersCars;
    }

    public static SearchACar with(FiltersCars filtersCars) {
        return instrumented(SearchACar.class, filtersCars);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomeTravelocityPage.BUTTON_PICK_UP_CITY),
                Enter.theValue(filtersCars.getPickUpCity()).into(HomeTravelocityPage.TEXT_PICK_UP_CITY),
                SelectFirstResult.onList(HomeTravelocityPage.XPATH_PICK_UP_RESULTS));

        if (!filtersCars.getDropOffCity().equals(ConstantsStrings.SAME_AS_PICK_UP)) {
            actor.attemptsTo(Click.on(HomeTravelocityPage.BUTTON_DROP_OFF_CITY),
                    Enter.theValue(filtersCars.getDropOffCity()).into(HomeTravelocityPage.TEXT_DROP_OFF_CITY),
                    SelectFirstResult.onList(HomeTravelocityPage.XPATH_DROP_OFF_RESULTS));
        }

        actor.attemptsTo(
                Click.on(HomeTravelocityPage.CHECK_IN_DATE),
                SelectDaysInto.calendar(filtersCars.getPickUpDate()),
                SelectDaysInto.calendar(filtersCars.getDropOffDate()),
                Click.on(HomeTravelocityPage.BUTTON_SET_DATE),
                SelectFromOptions.byVisibleText(filtersCars.getPickupTime()).from(HomeTravelocityPage.SELECT_PICK_UP_TIME),
                SelectFromOptions.byVisibleText(filtersCars.getDropOffTime()).from(HomeTravelocityPage.SELECT_DROP_OFF_TIME),
                Click.on(HomeTravelocityPage.BUTTON_SEARCH_HOME),
                WaitUntil.the(CarOffersResultsPage.IMG_GOOGLE_MAPS, isVisible())
                        .forNoMoreThan(30).seconds());

    }
}
