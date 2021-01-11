package com.travelocity.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/manual/",
        snippets = SnippetType.CAMELCASE,
        dryRun = true,
        glue = "com.travelocity.stepdefinitions"
)
public class ManualScenaries {
}
