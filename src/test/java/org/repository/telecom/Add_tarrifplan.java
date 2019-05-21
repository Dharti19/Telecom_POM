package org.repository.telecom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinitions.Hooks;

public class Add_tarrifplan {

	public  Add_tarrifplan() {

		PageFactory.initElements(Hooks.driver, this);
	}
	
	
	@FindBy(id="rental1")
	private WebElement mont_rent;
	
	@FindBy(id="local_minutes")
	private WebElement local_minutes;
	
	@FindBy(id="inter_minutes")
	private WebElement inter_minutes;
	
	@FindBy(id="sms_pack")
	private WebElement sms_pack;
	
	@FindBy(id="minutes_charges")
	private WebElement minutes_charges;
	
	@FindBy(id="inter_charges")
	private WebElement inter_charges;
	
	@FindBy(id="sms_charges")
	private WebElement sms_charges;
	
	@FindBy(tagName="h1")
	private WebElement conf_message;
	
	public WebElement getMont_rent() {
		return mont_rent;
	}

	public WebElement getLocal_minutes() {
		return local_minutes;
	}

	public WebElement getInter_minutes() {
		return inter_minutes;
	}

	public WebElement getSms_pack() {
		return sms_pack;
	}

	public WebElement getMinutes_charges() {
		return minutes_charges;
	}

	public WebElement getInter_charges() {
		return inter_charges;
	}

	public WebElement getSms_charges() {
		return sms_charges;
	}

	public WebElement getSubmit() {
		return submit;
	}


	@FindBy(name="submit")
	private WebElement submit;

	public WebElement getConf_message() {
		return conf_message;
	}
	
	
	
	
	
}
