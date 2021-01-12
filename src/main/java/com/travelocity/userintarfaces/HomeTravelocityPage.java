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
    public static final Target BUTTON_DESTINATION_HOTEL = Target.the("Texto going to")
            .locatedBy("//button[@aria-label='Going to']");
    public static final Target TEXT_DESTINATION_HOTEL = Target.the("Texto destino")
            .located(By.id("location-field-destination"));
    public static final String XPATH_LIST_RESULTS_DESTINATIONS = "//button[@data-stid='location-field-destination-result-item-button']";
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

    public static final Target BUTTON_ORIGIN_FLIGHT = Target.the("Boton origen")
            .locatedBy("//button[@data-stid='location-field-leg1-origin-menu-trigger']");
    public static final Target TEXT_ORIGIN_FLIGTH = Target.the("Campo Origen vuelo")
            .locatedBy("//input[@data-stid='location-field-leg1-origin-menu-input']");
    public static final Target BUTTON_DESTINATION_FLIGHT = Target.the("Boton destino")
            .locatedBy("//button[@data-stid='location-field-leg1-destination-menu-trigger']");
    public static final Target TEXT_DESTINATION_FLIGTH = Target.the("Campo destino vuelo")
            .locatedBy("//input[@data-stid='location-field-leg1-destination-menu-input']");
    public static final Target LINK_TRAVELERS_FLIGHT = Target.the("Link de viajeros")
            .locatedBy("//a[@data-testid='travelers-field']");
    public static final Target LINK_PREFERRED_CLASS = Target.the("Link clase preferidad")
            .located(By.id("preferred-class-input"));
    public static final String XPATH_PREFERRED_CLASS = "//a[@class='uitk-list-item']";
    public static final String XPATH_ORIGINS_FLIGHT_RESULTS = "//button[@data-stid='location-field-leg1-origin-result-item-button']";
    public static final String XPATH_DESTINATIONS_RESULTS = "//button[@data-stid='location-field-leg1-destination-result-item-button']";

    public static final Target BUTTON_PICK_UP_CITY = Target.the("Boton de recogida del vehiculo")
            .locatedBy("//button[@data-stid='location-field-locn-menu-trigger']");
    public static final Target TEXT_PICK_UP_CITY = Target.the("Ciudad de recogida del vehiculo")
            .locatedBy("//input[@data-stid='location-field-locn-menu-input']");
    public static final String XPATH_PICK_UP_RESULTS = "//button[@data-stid='location-field-locn-result-item-button']";
    public static final Target BUTTON_DROP_OFF_CITY = Target.the("Boton de recogida del vehiculo")
            .locatedBy("//button[@data-stid='location-field-loc2-menu-trigger']");
    public static final Target TEXT_DROP_OFF_CITY = Target.the("Ciudad de recogida del vehiculo")
            .locatedBy("//input[@data-stid='location-field-loc2-menu-input']");
    public static final String XPATH_DROP_OFF_RESULTS = "//button[@data-stid='location-field-loc2-result-item-button']";

    public static final Target SELECT_PICK_UP_TIME = Target.the("Hora de recogida")
            .locatedBy("//select[@aria-label='Pick-up time']");
    public static final Target SELECT_DROP_OFF_TIME = Target.the("Hora de entrega")
            .locatedBy("//select[@aria-label='Drop-off time']");


    public static final Target SECTION_FAMILY_OFFERS = Target.the("Seccion de ofertas de familia")
            .locatedBy("//a[contains(@href,'https://www.travelocity.com/lp/deals/family')]");

    private HomeTravelocityPage() {
    }
}
