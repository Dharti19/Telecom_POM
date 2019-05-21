
package org.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

public static WebDriver driver;

@Before
public static void beforeMethod() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhart_000\\Dharti\\TelecomTestCucumber\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/telecom/");
}

//@After
//public static void afterMethod() {
	//driver.close();
	//driver.quit();
}


	
	
