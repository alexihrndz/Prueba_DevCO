package com.travelocity.stepdefinitions;

import com.travelocity.models.FiltersHotel;
import com.travelocity.tasks.EnterData;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.travelocity.utils.ConstantsStrings.ACTOR_NAME;
import static com.travelocity.utils.ConstantsStrings.URL_HOME;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ReserveHotelStepdefinitions {


    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    Logger logger = LoggerFactory.getLogger(getClass());

    @Dado("^que yo como usuario quiero realizar la reserva de hotel en travelocity$")
    public void queYoComoUsuarioQuieroRealizarLaReservaDeHotelEnTravelocity() {
        theActorCalled(ACTOR_NAME).wasAbleTo(Open.url(URL_HOME));
    }


    @Cuando("^ingrese los filtros$")
    public void ingreseLosFiltros(DataTable datos) {
        FiltersHotel filtersHotel = new FiltersHotel(datos);
        theActorInTheSpotlight().attemptsTo(EnterData.toFilters(filtersHotel));

    }

    @Entonces("^puedo ver la lista de resultados y seleccionar el de menor precio$")
    public void puedoVerLaListaDeResultadosYSeleccionarElDeMenorPrecio() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Cuando("^seleccione la opcion de reserva lleno los datos de pago$")
    public void seleccioneLaOpcionDeReservaLlenoLosDatosDePago(DataTable arg1) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).

    }

    @Entonces("^puedo ver el mensaje de pago rechazado$")
    public void puedoVerElMensajeDePagoRechazado() {
        // Write code here that turns the phrase above into concrete actions

    }

}
