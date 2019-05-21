package org.repository.telecom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinitions.Hooks;

public class Add_Customer {
	//WebDriver driver;

		public  Add_Customer() {

		PageFactory.initElements(Hooks.driver, this);
	}

		@FindBy(xpath="//label[text()='Done']")
		private WebElement radio_btn;
		
		
		@FindBy(xpath="//input[@id='fname']")
		private WebElement fname;
	
		@FindBy(xpath="//input[@name='lname']")
		private WebElement lastname;
		
		@FindBy(id="email")
		private WebElement email;
		
		@FindBy(name="addr")
		private WebElement addr;
		
		@FindBy(name="submit")
		private WebElement submit;
		
		public WebElement getSubmit() {
			return submit;
		}

		public WebElement getRadio_btn() {
			return radio_btn;
		}

		public WebElement getFname() {
			return fname;
		}

		public WebElement getLastname() {
			return lastname;
		}

		public WebElement getEmail() {
			return email;
		}

		public WebElement getAddr() {
			return addr;
		}

		public WebElement getTelephoneno() {
			return telephoneno;
		}

		@FindBy(name="telephoneno")
		private WebElement telephoneno;
		
		
		@FindBy(tagName="h1")
		private WebElement message;

		public WebElement getMessage() {
			return message;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}