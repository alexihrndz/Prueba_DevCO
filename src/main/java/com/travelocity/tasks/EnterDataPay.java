package com.travelocity.tasks;

import com.travelocity.models.DataReserveAndPay;
import com.travelocity.userintarfaces.PaymentPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.ArrayList;
import java.util.List;

import static com.travelocity.userintarfaces.RoomListPage.XPATH_ROOM_LIST_RESERVE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class EnterDataPay implements Task {

    private final DataReserveAndPay dataReserveAndPay;

    public EnterDataPay(DataReserveAndPay dataReserveAndPay) {
        this.dataReserveAndPay = dataReserveAndPay;
    }

    public static EnterDataPay intoForm(DataReserveAndPay dataReserveAndPay) {
        return instrumented(EnterDataPay.class, dataReserveAndPay);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ArrayList<String> tabs2 = new ArrayList<> (BrowseTheWeb.as(actor).getDriver().getWindowHandles());
        actor.attemptsTo(Switch.toWindow(tabs2.get(1)));

        List<WebElementFacade> roomList = BrowseTheWeb.as(actor).findAll(XPATH_ROOM_LIST_RESERVE);
        BrowseTheWeb.as(actor).waitFor(roomList.get(1)).isClickable();

        actor.attemptsTo(
                JavaScriptClick.on(roomList.get(1)),
                WaitUntil.the(PaymentPage.TEXT_CONTACT_NAME, isCurrentlyVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(dataReserveAndPay.getContactName()).into(PaymentPage.TEXT_CONTACT_NAME),
                SelectFromOptions.byValue(dataReserveAndPay.getCountryCode()).from(PaymentPage.SELECT_COUNTRY_CODE),
                Enter.theValue(dataReserveAndPay.getPhoneNumber()).into(PaymentPage.TEXT_PHONE_NUMBER),
                Click.on(PaymentPage.RADIO_NO_INSURANCE),
                Enter.theValue(dataReserveAndPay.getCreditCardName()).into(PaymentPage.TEXT_CREDIT_CARD_NAME),
                Enter.theValue(dataReserveAndPay.getCreditCardNumber()).into(PaymentPage.TEXT_CREDIT_CARD_NUMBER),
                SelectFromOptions.byVisibleText(dataReserveAndPay.getExpMonth()).from(PaymentPage.SELECT_EXP_MONTH),
                SelectFromOptions.byVisibleText(dataReserveAndPay.getExpYear()).from(PaymentPage.SELECT_EXP_YEAR),
                Enter.theValue(dataReserveAndPay.getSecCode()).into(PaymentPage.TEXT_SEC_CODE));

        List<WebElementFacade> selectCountry = BrowseTheWeb.as(actor).findAll(PaymentPage.XPATH_COUNTRY_SELECT);

        if(!selectCountry.isEmpty()){
            actor.attemptsTo(
                    SelectFromOptions.byVisibleText(dataReserveAndPay.getCountryAddress()).from(selectCountry.get(1)),
                    Enter.theValue(dataReserveAndPay.getBillingAddres1()).into(PaymentPage.TEXT_BILLING_ADDRESS_1),
                    Enter.theValue(dataReserveAndPay.getCity()).into(PaymentPage.TEXT_CITY_BILLING),
                    Enter.theValue(dataReserveAndPay.getZipCode()).into(PaymentPage.TEXT_ZIP_CODE));
        }

       actor.attemptsTo(
                Enter.theValue(dataReserveAndPay.getEmailAddress()).into(PaymentPage.TEXT_EMAIL_ADDRESS),
                Click.on(PaymentPage.BUTTON_COMPLETE_BOOKING));

    }
}
