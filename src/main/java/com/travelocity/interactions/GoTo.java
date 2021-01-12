package com.travelocity.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static com.travelocity.utils.ConstantsStrings.XPATH_OPTIONS_HEADER;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoTo implements Interaction {

    private final String option;

    public GoTo(String option) {
        this.option = option;
    }

    public static GoTo option(String option) {
        return instrumented(GoTo.class, option);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> optionsHeader = BrowseTheWeb.as(actor).findAll(XPATH_OPTIONS_HEADER);
        for (WebElementFacade webElementFacade : optionsHeader) {
            if (webElementFacade.containsText(option)) {
                actor.attemptsTo(Click.on(webElementFacade));
                break;
            }
        }
    }
}
