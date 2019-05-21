package org.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.repository.telecom.Add_tarrifplan;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps_Add_tarrifplan {
	public static WebDriver driver;

	
	@When("the user fill the valid tarrif plan detail")
	public void the_user_fill_the_valid_tarrif_plan_detail() {
	  Add_tarrifplan tarrif = new Add_tarrifplan();
	  tarrif.getMont_rent().sendKeys("123");
	  tarrif.getLocal_minutes().sendKeys("122");
	  tarrif.getInter_minutes().sendKeys("124");
	  tarrif.getSms_pack().sendKeys("12");
	  tarrif.getMinutes_charges().sendKeys("123");
	  tarrif.getInter_charges().sendKeys("123");
	  tarrif.getSms_charges().sendKeys("10");
	  tarrif.getSubmit().click();
	}

	@Then("the confirmation message should display")
	public void the_confirmation_message_should_display() {
	  
		Add_tarrifplan tarrif = new Add_tarrifplan();
		Assert.assertTrue(tarrif.getConf_message().isDisplayed());
	
	}






}
