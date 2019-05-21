
package org.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.repository.telecom.*;

public class Steps_Add_Customer {
	public static WebDriver driver;
	
	@When("the user fill in the valid customer details")
	public void the_user_fill_in_the_valid_customer_details() throws InterruptedException {
		Add_Customer cust = new Add_Customer();
		cust.getRadio_btn().click();
		cust.getFname().sendKeys("dharti");
		cust.getLastname().sendKeys("rai");
		cust.getAddr().sendKeys("dhartirai");
		cust.getTelephoneno().sendKeys("1234567898");
	}

	@When("the user click the submit button")
	public void the_user_click_the_submit_button() {
		Add_Customer cust = new Add_Customer();
		cust.getSubmit();
	}

	@Then("The user should see the customer id")
	public void the_user_should_see_the_customer_id() {
		Add_Customer cust = new Add_Customer();
	   Assert.assertTrue(cust.getMessage().isDisplayed()); 
		
		
	}
	
		}
	
	
