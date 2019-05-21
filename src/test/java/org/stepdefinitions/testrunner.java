package org.stepdefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature/Addcustomer.feature",glue= {"org.stepdefinitions"},plugin= {"html:target"},strict=true)
public class testrunner {

}



