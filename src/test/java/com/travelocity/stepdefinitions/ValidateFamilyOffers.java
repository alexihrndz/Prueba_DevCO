package com.travelocity.stepdefinitions;

import com.travelocity.questions.ViewHotel;
import com.travelocity.tasks.GoToFamily;
import com.travelocity.utils.ConstantsStrings;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidateFamilyOffers {

    @Cuando("^ingreso a la seccion ofertas de familia$")
    public void ingresoALaSeccionOfertasDeFamilia() {
        theActorInTheSpotlight().attemptsTo(GoToFamily.offers());

    }


    @Entonces("^puedo ver el siguiente \"([^\"]*)\"$")
    public void puedoVerElSiguiente(String hotel) {
        theActorInTheSpotlight().remember(ConstantsStrings.HOTEL, hotel);
        theActorInTheSpotlight().should(seeThat(ViewHotel.intoList()));


    }
}
