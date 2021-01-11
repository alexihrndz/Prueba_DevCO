package com.travelocity.userintarfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignInTravelocityPage {

    public static final Target TEXT_EMAIL = Target.the("Campo Email")
            .located(By.id("signin-loginid"));
    public static final Target TEXT_PASSWORD = Target.the("Campo Contraseña")
            .located(By.id("signin-password"));
    public static final Target BUTTON_SIGN_IN = Target.the("Boton inicio de sesion")
            .located(By.id("submitButton"));

    private SignInTravelocityPage() {
    }
}
