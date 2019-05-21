package org.repository.telecom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinitions.Hooks;

public class Home_Page {
	
	public Home_Page() {
		PageFactory.initElements(Hooks.driver, this);
	}
	
	//Add Customer 
	@FindBy(xpath="//a[text()='Add Customer']")
	private WebElement link_adcustomer;

	public WebElement getLink_adcustomer() {
		return link_adcustomer;
	}
	
	//Add Tarrif Plan
	
	@FindBy(xpath="//a[text()='Add Tariff Plan']")
	private WebElement add_tarrif;
	
	public WebElement getAdd_tarrif() {
		return add_tarrif;
	}
	
	
	//Pay Billing
	
	@FindBy(xpath="	//a[text()='Pay Billing']")
	private WebElement pay_bill;

	public WebElement getPay_bill() {
		return pay_bill;
	}
	
		//Add tarrif to customer
	@FindBy(xpath="	//a[text()='Add Tariff Plan to Customer']")
	private WebElement addtarrif_customer;

	public WebElement getAddtarrif_customer() {
		return addtarrif_customer;
	}
	}
	
	
	


	