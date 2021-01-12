package com.travelocity.tasks;

import com.travelocity.userintarfaces.FamilyOffersPage;
import com.travelocity.userintarfaces.HomeTravelocityPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GoToFamily implements Task {
    public static GoToFamily offers() {
        return instrumented(GoToFamily.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomeTravelocityPage.SECTION_FAMILY_OFFERS),
                WaitUntil.the(FamilyOffersPage.LABEL_HAPPY_VACATIONS, isVisible())
                        .forNoMoreThan(20).seconds());
    }
}
