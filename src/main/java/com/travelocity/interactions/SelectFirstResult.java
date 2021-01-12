package com.travelocity.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectFirstResult implements Interaction {

    private final String xpath;

    public SelectFirstResult(String xpath) {
        this.xpath = xpath;
    }

    public static SelectFirstResult onList(String xpath) {
        return instrumented(SelectFirstResult.class, xpath);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).findAll(xpath).get(0).click();
    }
}
