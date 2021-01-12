package com.travelocity.stepdefinitions;

import com.travelocity.interactions.GoTo;
import com.travelocity.models.FiltersCars;
import com.travelocity.questions.ListOfferCar;
import com.travelocity.tasks.SearchACar;
import com.travelocity.utils.ConstantsStrings;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RentACarStepsDefinitions {

    @Cuando("^ingreso los datos de la renta$")
    public void ingresoLosDatosDeLaRenta(DataTable dataTable) {
        FiltersCars filtersCars = new FiltersCars(dataTable);

        theActorInTheSpotlight().attemptsTo(
                GoTo.option(ConstantsStrings.CARS),
                SearchACar.with(filtersCars));

    }

    @Entonces("^puedo ver lista de vehiculos$")
    public void puedoVerListaDeVehiculos() {
        theActorInTheSpotlight().should(seeThat(ListOfferCar.success()));

    }
}
