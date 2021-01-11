package com.travelocity.questions;

import com.travelocity.userintarfaces.ResultsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class HotelList implements Question<Boolean> {
    public static HotelList results() {
        return new HotelList();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return !BrowseTheWeb.as(actor).findAll(ResultsPage.XPATH_LIST_RESULTS).isEmpty();
    }
}
