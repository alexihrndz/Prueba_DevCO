package com.travelocity.questions;

import com.travelocity.userintarfaces.HotelsResultsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class HotelList implements Question<Boolean> {
    public static HotelList results() {
        return new HotelList();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return !BrowseTheWeb.as(actor).findAll(HotelsResultsPage.XPATH_LIST_RESULTS).isEmpty();
    }
}
