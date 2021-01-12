package com.travelocity.userintarfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FamilyOffersPage {

    public static final Target LABEL_HAPPY_VACATIONS = Target.the("Mensaje de felices vacaciones")
            .locatedBy("//h2[text()='The secret to a happy family? VACATION!']");
    public static final String XPATH_LABEL_HOTELS =
            "//h3[@class='uitk-type-heading-500 uitk-spacing truncate uitk-spacing-padding-blockend-half']";

    private FamilyOffersPage() {
    }
}
