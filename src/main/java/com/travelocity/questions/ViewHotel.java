package com.travelocity.questions;

import com.travelocity.userintarfaces.FamilyOffersPage;
import com.travelocity.utils.ConstantsStrings;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.util.List;

public class ViewHotel implements Question<Boolean> {

    public static ViewHotel intoList() {
        return new ViewHotel();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean result = false;

        List<WebElementFacade> lstHotels = BrowseTheWeb.as(actor).findAll(FamilyOffersPage.XPATH_LABEL_HOTELS);
        for (WebElementFacade lstHotel : lstHotels) {
            if (lstHotel.containsText(actor.recall(ConstantsStrings.HOTEL))) {
                result = true;
                break;
            }
        }

        return result;
    }
}
