package org.stepdefinitions;

import org.repository.telecom.Home_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps_Home {
	
	@Given("the user is in home page")
	public void the_user_is_in_home_page() {
		Hooks.driver.get("http://demo.guru99.com/telecom/index.html");
	}
	
	

	@When("the user click add customer")
	public void the_user_click_add_customer() throws InterruptedException {
	   Home_Page home = new Home_Page();
	   home.getLink_adcustomer().click();
		
	}

	@Given("the user is on add tarrif plan page")
	public void the_user_is_on_add_tarrif_plan_page() {
		 Home_Page home = new Home_Page();
		 home.getAdd_tarrif().click();
	}

	@Given("the user is on add tarrif plan to customer page")
	public void the_user_is_on_add_tarrif_plan_to_customer_page() {
		 Home_Page home = new Home_Page();
		 home.getAddtarrif_customer().click();
	  
	}
	
	
	
	
	
	
}