package com.travelocity.userintarfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CarOffersResultsPage {

    public static final Target IMG_GOOGLE_MAPS = Target.the("Imagen de google maps")
            .locatedBy("//div[@class='uitk-image-placeholder uitk-image-placeholder-image']");
    public static final String XPATH_LIST_OFFER_CAR = "//div[@class='offer-card-desktop']";
    public static final String XPATH_CAR_MODEL = "//div[@class='all-b-margin-one']";

    private CarOffersResultsPage() {
    }
}
