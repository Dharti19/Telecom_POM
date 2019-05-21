package org.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.repository.telecom.Add_tarrif_to_customer;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps_Add_tarrif_to_customer {

	public static WebDriver driver;
	@When("the user enter the valid customer id")
	public void the_user_enter_the_valid_customer_id() {
	   Add_tarrif_to_customer addtarrif = new  Add_tarrif_to_customer();
	   addtarrif.getCustomer_id().sendKeys("123456");
	   addtarrif.getSubmit().click();
	   
	}

	@Then("the succesfully added displayed")
	public void the_succesfully_added_displayed() {
		Add_tarrif_to_customer addtarrif = new  Add_tarrif_to_customer();
		Assert.assertTrue(addtarrif.getMessage().isDisplayed());
	  
	}






}
