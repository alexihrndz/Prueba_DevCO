package com.travelocity.tasks;

import com.travelocity.userintarfaces.ResultsPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.travelocity.userintarfaces.ResultsPage.SELECT_RESULTS_SORT;
import static com.travelocity.userintarfaces.ResultsPage.XPATH_LIST_RESULTS;
import static com.travelocity.utils.ConstantsStrings.PRICE_LOW_TO_HIGH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectLowerPrice implements Task {
    public static SelectLowerPrice ofResultList() {
        return instrumented(SelectLowerPrice.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byValue(PRICE_LOW_TO_HIGH).from(SELECT_RESULTS_SORT),
                WaitUntil.the(ResultsPage.LABEL_SEARCHING, WebElementStateMatchers.isCurrentlyVisible())
        );

        WebElementFacade lowPriceSelection = BrowseTheWeb.as(actor).findAll(XPATH_LIST_RESULTS).get(0);
        actor.attemptsTo(Click.on(lowPriceSelection));

    }
}
