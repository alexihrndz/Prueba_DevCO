package com.travelocity.stepdefinitions;

import com.travelocity.models.DataReserveAndPay;
import com.travelocity.models.FiltersHotel;
import com.travelocity.questions.HotelList;
import com.travelocity.questions.ItiniraryNumber;
import com.travelocity.tasks.SearchHotel;
import com.travelocity.tasks.EnterDataPay;
import com.travelocity.tasks.SelectLowerPrice;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.travelocity.utils.ConstantsStrings.ACTOR_NAME;
import static com.travelocity.utils.ConstantsStrings.URL_HOME;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ReserveHotelStepdefinitions {


    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que yo como usuario quiero realizar la reserva de hotel en travelocity$")
    public void queYoComoUsuarioQuieroRealizarLaReservaDeHotelEnTravelocity() {
        theActorCalled(ACTOR_NAME).wasAbleTo(Open.url(URL_HOME));
    }


    @Cuando("^ingrese los filtros$")
    public void ingreseLosFiltros(DataTable dataTable) {
        FiltersHotel filtersHotel = new FiltersHotel(dataTable);
        theActorInTheSpotlight().attemptsTo(SearchHotel.with(filtersHotel));

    }

    @Entonces("^puedo ver la lista de resultados y seleccionar el de menor precio$")
    public void puedoVerLaListaDeResultadosYSeleccionarElDeMenorPrecio() {
        theActorInTheSpotlight().should(seeThat(HotelList.results()));
        theActorInTheSpotlight().attemptsTo(SelectLowerPrice.ofResultList());

    }

    @Cuando("^seleccione la opcion de reserva lleno los datos de pago$")
    public void seleccioneLaOpcionDeReservaLlenoLosDatosDePago(DataTable dataTable) {
        DataReserveAndPay dataReserveAndPay = new DataReserveAndPay(dataTable);
        theActorInTheSpotlight().attemptsTo(EnterDataPay.intoForm(dataReserveAndPay));

    }

    @Entonces("^puedo ver la reserva con exito$")
    public void puedoVerLaReservaConExito() {
        theActorInTheSpotlight().should(seeThat(ItiniraryNumber.confirmed()));
    }
}
