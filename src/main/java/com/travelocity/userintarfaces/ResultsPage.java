package com.travelocity.userintarfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResultsPage {

    public static final String XPATH_LIST_RESULTS = "//a[@data-stid='open-hotel-information']";
    public static final Target SELECT_RESULTS_SORT = Target.the("Lista de ordenamiento")
            .located(By.id("sort"));
    public static final Target LABEL_SEARCHING = Target.the("Etiqueta de busqueda")
            .locatedBy("//div[text()='What we are paid impacts our sort order']");

    private ResultsPage() {
    }
}
