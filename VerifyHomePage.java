package com.homeloan.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.homeloan.pages.HomePage;

public class VerifyHomePage {
	
	@Test
	public void verifyHome () {
		System.setProperty("webdriver.gecko.driver", "C:\\Automation\\Driers.exe");
		WebDriver driver = new FirefoxDriver();	//Launching the Firefox browser
		//System.setProperty("webdriver.chrome.driver", "E:\\Tasks\\Chrome driver.exe");
		//WebDriver driver = new ChromeDriver();	//Launching the Chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Defined waiting time
		driver.navigate().to("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/"); //Opening site
		HomePage obj= new HomePage(driver); //creation of object
		obj.fill();			// calling the method to execute
		Reporter.log("The first method executed successfully");
		obj.method();		// calling the method to execute
		Reporter.log("The second method executed successfully");
		driver.quit();		//Closing the browser
		Reporter.log("Browser has been closed successfully");
		
	}
	

}
