package com.travelocity.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/automated/reserva_vuelo.feature",
        glue = "com.travelocity.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class ReserveFlight {
}
