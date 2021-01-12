package com.travelocity.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Switch;

import java.util.ArrayList;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SwitchToNewWindow implements Interaction {
    public static SwitchToNewWindow now() {
        return instrumented(SwitchToNewWindow.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ArrayList<String> tabs2 = new ArrayList<> (BrowseTheWeb.as(actor).getDriver().getWindowHandles());
        actor.attemptsTo(Switch.toWindow(tabs2.get(1)));

    }
}
