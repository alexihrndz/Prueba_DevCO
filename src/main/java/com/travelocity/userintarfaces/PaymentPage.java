package com.travelocity.userintarfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentPage {

    public static final Target TEXT_CONTACT_NAME = Target.the("Campo de nombre del contacto")
            .located(By.id("hotel-contact-name0"));
    public static final Target SELECT_COUNTRY_CODE = Target.the("Lista de codigo pais")
            .located(By.id("oneLinePhoneNumberCountryCodeHiddenSelect"));
    public static final Target TEXT_PHONE_NUMBER = Target.the("Texto Numero de Telefono")
            .locatedBy("//input[@data-tealeaf-name='phoneNumber']");
    public static final Target RADIO_NO_INSURANCE = Target.the("Opcion sin seguro")
            .located(By.id("no_insurance"));
    public static final Target TEXT_CREDIT_CARD_NAME = Target.the("Nombre de tarjeta de credito")
            .locatedBy("//input[@data-tealeaf-name='cardHolderName_1']");
    public static final Target TEXT_CREDIT_CARD_NUMBER = Target.the("Numero de tarjeta de credito o debito")
            .located(By.id("creditCardInput"));
    public static final Target SELECT_EXP_MONTH = Target.the("Mes de expiracion")
            .located(By.name("creditCards[0].expiration_month"));
    public static final Target SELECT_EXP_YEAR = Target.the("Año de expiracion")
            .located(By.name("creditCards[0].expiration_year"));
    public static final Target TEXT_SEC_CODE = Target.the("Codigo de seguridad")
            .located(By.id("new_cc_security_code"));
    public static final String XPATH_COUNTRY_SELECT = "//select[@name='creditCards[0].country']";
    public static final Target SELECT_COUNTRY_BILLING = Target.the("Pais de facturación")
            .located(By.name("creditCards[0].country"));
    public static final Target TEXT_BILLING_ADDRESS_1 = Target.the("Campo dirección")
            .locatedBy("//input[@data-tealeaf-name='street' and @aria-invalid='true']");
    public static final Target TEXT_CITY_BILLING = Target.the("Ciudad facturación")
            .locatedBy("//input[@name='creditCards[0].city' and @aria-invalid='true']");
    public static final Target TEXT_ZIP_CODE = Target.the("Codigo postal")
            .locatedBy("//input[@name='creditCards[0].zipcode' and @aria-invalid='true']");
    public static final Target TEXT_EMAIL_ADDRESS = Target.the("Direccion de correo")
            .locatedBy("//input[@data-tealeaf-name='email']");
    public static final Target BUTTON_COMPLETE_BOOKING = Target.the("Boton de completar reserva")
            .located(By.id("complete-booking"));
    public static final Target LABEL_MESSAGE_TRIP_IS_BOOKED = Target.the("Mensaje de reserva completada")
            .locatedBy("//h1[@class='section-header-main']");
    public static final Target LABEL_ITINIRARY_TRAVELOCITY = Target.the("Numero de reserva")
            .locatedBy("//span[@class='itinerary-number']");

    private PaymentPage() {
    }
}
