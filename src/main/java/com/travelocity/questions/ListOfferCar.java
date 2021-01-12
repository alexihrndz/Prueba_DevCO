package com.travelocity.questions;

import com.travelocity.userintarfaces.CarOffersResultsPage;
import com.travelocity.utils.ConstantsStrings;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.util.List;

public class ListOfferCar implements Question<Boolean> {
    public static ListOfferCar success() {
        return new ListOfferCar();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        int countCars = BrowseTheWeb.as(actor).findAll(CarOffersResultsPage.XPATH_LIST_OFFER_CAR).size();
        List<WebElementFacade> modelCars = BrowseTheWeb.as(actor).findAll(CarOffersResultsPage.XPATH_CAR_MODEL);
        int toyotaCars = 0;

        for (WebElementFacade modelCar : modelCars) {
            if (modelCar.getText().contains(ConstantsStrings.TOYOTA)) toyotaCars++;
        }
        return countCars > 10 && toyotaCars > 0;
    }
}
