package com.travelocity.stepdefinitions;

import com.travelocity.interactions.GoTo;
import com.travelocity.interactions.SelectAirline;
import com.travelocity.models.FiltersFlight;
import com.travelocity.questions.TripSummary;
import com.travelocity.tasks.SearchFlight;
import com.travelocity.utils.ConstantsStrings;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.travelocity.utils.ConstantsStrings.ACTOR_NAME;
import static com.travelocity.utils.ConstantsStrings.URL_HOME;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ReserveFlightStepsDefinitions {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    Logger logger = LoggerFactory.getLogger(getClass());

    @Dado("^que yo como usuario quiero realizar la reserva de vuelo ingreso a travelocity$")
    public void queYoComoUsuarioQuieroRealizarLaReservaDeVueloIngresoATravelocity() {
        theActorCalled(ACTOR_NAME).wasAbleTo(Open.url(URL_HOME));
    }

    @Cuando("^ingrese los filtros de vuelo$")
    public void ingreseLosFiltrosDeVuelo(DataTable dataTable) {
        FiltersFlight filters = new FiltersFlight(dataTable);
        theActorInTheSpotlight().attemptsTo(
                GoTo.option(ConstantsStrings.FLIGHTS),
                SearchFlight.with(filters));
    }


    @Y("^selecciono la aerolinea y los vuelos$")
    public void seleccionoLaAerolineaYLosVuelos(DataTable dataTable) {
        String data = dataTable.asMaps(String.class, String.class).get(0).get(ConstantsStrings.AIRLINE);
        theActorInTheSpotlight().attemptsTo(SelectAirline.toFlight(data));
    }

    @Entonces("^puedo ver el resumen de la solicitud$")
    public void puedoVerElResumenDeLaSolicitud() {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().should(seeThat(TripSummary.completed()));

    }


}
