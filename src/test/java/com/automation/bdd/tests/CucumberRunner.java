package com.automation.bdd.tests;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.automation.bdd.tests.stepdefs",
        features = {"src/test/resources/features/"})
public class CucumberRunner {
}
