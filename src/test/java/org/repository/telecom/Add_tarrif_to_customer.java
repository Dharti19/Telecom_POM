package org.repository.telecom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinitions.Hooks;

public class Add_tarrif_to_customer {

	public  Add_tarrif_to_customer() {

		PageFactory.initElements(Hooks.driver, this);
	}
	
	@FindBy(id="customer_id")
	private WebElement customer_id;
	
	@FindBy(name="submit")
	private WebElement submit;
	
	@FindBy(tagName="h3")
	private WebElement message;

	public WebElement getCustomer_id() {
		return customer_id;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getMessage() {
		return message;
	}
	
	
}
