package com.travelocity.stepdefinitions;

import com.travelocity.questions.UserLogged;
import com.travelocity.tasks.SignIn;
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

public class SignInStepsDefinitions {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que yo como usuario quiero iniciar sesion en Travelocity con correo$")
    public void queYoComoUsuarioQuieroIniciarSesionEnTravelocityConCorreo() {
        theActorCalled(ACTOR_NAME).wasAbleTo(Open.url(URL_HOME));

    }

    @Cuando("^ingrese mis credenciales correo y password$")
    public void ingreseMisCredencialesY(DataTable credenciales) {
        theActorInTheSpotlight().attemptsTo(SignIn.now(credenciales));
    }

    @Entonces("^puedo ver el usuario logueado$")
    public void puedoVerElUsuarioNombreLogueado(DataTable nombre) {
        theActorInTheSpotlight().should(seeThat(UserLogged.withName(nombre)));
    }

    @Dado("^que yo quiero realizar una operacion en travelocity$")
    public void queYoQuieroRealizarUnaOperacionEnTravelocity() {
        theActorCalled(ACTOR_NAME).wasAbleTo(Open.url(URL_HOME));
    }
}
