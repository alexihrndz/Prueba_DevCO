package com.travelocity.tasks;

import com.travelocity.models.Credentials;
import com.travelocity.userintarfaces.HomeTravelocityPage;
import com.travelocity.userintarfaces.SignInTravelocityPage;
import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.travelocity.models.Credentials.getEmail;
import static com.travelocity.models.Credentials.getPassword;
import static com.travelocity.userintarfaces.HomeTravelocityPage.LINK_SING_IN;
import static com.travelocity.userintarfaces.SignInTravelocityPage.TEXT_EMAIL;
import static com.travelocity.userintarfaces.SignInTravelocityPage.TEXT_PASSWORD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SignIn implements Task {

    private final DataTable credentials;

    public SignIn(DataTable credentials) {
        this.credentials = credentials;
    }

    public static SignIn now(DataTable credentials) {
        return instrumented(SignIn.class, credentials);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        new Credentials(credentials);

        actor.attemptsTo(Click.on(LINK_SING_IN),
                Click.on(HomeTravelocityPage.BUTTON_SIGN_IN),
                Enter.theValue(getEmail()).into(TEXT_EMAIL),
                Enter.theValue(getPassword()).into(TEXT_PASSWORD),
                Click.on(SignInTravelocityPage.BUTTON_SIGN_IN)
        );
    }
}
