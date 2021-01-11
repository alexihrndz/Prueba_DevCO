package com.travelocity.userintarfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeTravelocityPage {

    public static final Target LINK_SING_IN = Target.the("Link Sign in")
            .locatedBy("//div[text()='Sign in']");
    public static final Target BUTTON_SIGN_IN = Target.the("Boton iniciar sesion")
            .locatedBy("//a[@data-stid='link-header-account-signin']");
    public static final String XPATH_LABEL_HEADER = "//div[@class='uitk-type-300']";
    public static final Target RECAPTCHA = Target.the("Recaptcha")
            .locatedBy("//iframe[@title='recaptcha challenge']");
    public static final Target TEXT_GOING_TO = Target.the("Texto going to")
            .locatedBy("//button[@aria-label='Going to']");
    public static final Target TEXT_WHERE_ARE_YOU_GOING = Target.the("Texto destino")
            .located(By.id("location-field-destination"));
    public static final String XPATH_LIST_RESULTS_GOING_TO = "//button[@data-stid='location-field-destination-result-item-button']";
    public static final Target CHECK_IN_DATE = Target.the("Fecha check in").located(By.id("d1-btn"));
    public static final String XPATH_DAYS_CALENDAR = "//button[contains(@class, 'uitk-new-date-picker-day')]";
    public static final Target BUTTON_SET_DATE = Target.the("Boton donde")
            .locatedBy("//button[@data-stid='apply-date-picker']");
    public static final Target TEXT_TRAVELERS = Target.the("Datos viajeros")
            .locatedBy("//button[@data-testid='travelers-field-trigger']");
    public static final Target LABEL_ADULTS = Target.the("Cantidad de adultos")
            .located(By.id("adult-input-0"));
    public static final Target LABEL_CHILDREN = Target.the("Cantidad de niños")
            .located(By.id("child-input-0"));
    public static final Target BUTTON_INCREASE_ADULTS = Target.the("Boton incrementar adultos")
            .locatedBy("//*[contains(@aria-labelledby,'increase-adults')]/parent::button");
    public static final Target BUTTON_INCREASE_CHILDREN = Target.the("Boton incrementar niños")
            .locatedBy("//*[contains(@aria-labelledby,'increase-children')]/parent::button");
    public static final Target BUTTON_DONE_TRAVELERS = Target.the("Boton done travelers")
            .locatedBy("//button[@data-testid='guests-done-button']");
    public static final Target BUTTON_SEARCH_HOME = Target.the("Boton search en el home")
            .locatedBy("//button[@data-testid='submit-button']");



    private HomeTravelocityPage() {
    }
}
