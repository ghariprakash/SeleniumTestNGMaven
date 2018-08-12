package com.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class MavenHandsOn {
	
@Test
void launchBrowser() {
	
	// Using  Using FirefoxOptions:	
	// Working Fine
	System.setProperty("webdriver.gecko.driver", "E:\\Work\\Selenium\\JARs\\Browser_Drivers\\Gecko\\v0.19.0\\geckodriver-v0.19.0-win64\\geckodriver.exe");
	FirefoxOptions options = new FirefoxOptions();
	WebDriver driver= new FirefoxDriver(options); 
	driver.get("http://www.google.com");	
	driver.quit();
}

}
