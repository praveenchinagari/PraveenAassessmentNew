package com.homeloan.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class HomePage {
	
	
	WebDriver driver;

	By Apptype = By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div[1]/div/div[1]/ul/li[1]/label");
	By Dependents = By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div[1]/div/div[2]/div/select");
	By PropType = By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/ul/li[1]/label");
	By uric = By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div[2]/div/div[1]/div/input");
	By urotic = By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div/input");
	By LivExp = By.id("expenses");
	By CurHoRep = By.id("homeloans");
	By OtLonRep = By.id("otherloans");
	By othComt = By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div[3]/div/div[4]/div/input");
	By totcreditcrd = By.id("credit");
	By workotbtn = By.id("btnBorrowCalculater");
	By strtovrbtn = By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[3]/div/div/div/div[3]/div[2]/button");
	

	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void fill() {
		driver.findElement(Apptype).click();		//Selected Single for Application type.
		driver.findElement(Dependents).click();		//Selected "0" for "Number of dependents".
		driver.findElement(PropType).click();  		//Selected "Home to Live in" radio button for "Property you would like to Buy".
		driver.findElement(uric).sendKeys("80000");	//Entered "80,000" in "Your income (before tax)" field 
		driver.findElement(urotic).sendKeys("10000");//Entered "10,000" in "Your other income" field
		driver.findElement(LivExp).sendKeys("500");	//Entered "500" in "Living expenses" field
		driver.findElement(CurHoRep).sendKeys("0");	//Entered  "0" in "Current home loan repayments" field
		driver.findElement(OtLonRep).sendKeys("100"); //Entered  "100" in "Other loan repayments" field
		driver.findElement(othComt).sendKeys("0");	//Entered  '0' in "Other Commitments" field
		driver.findElement(totcreditcrd).sendKeys("10000");//Entered "1000" in "total credit card limits" field
		driver.findElement(workotbtn).click(); 		//Clicking on the "Work out How much I could borrow" button
		driver.findElement(strtovrbtn).click();		//Clicking on the "Start Over" button"
		System.out.println("The 1st scenario completed and clicked on the startover button");
		Reporter.log("The 1st scenario completed and clicked on the startover button");
		
	}
	public void method () {	
		driver.findElement(LivExp).sendKeys("1");	//Entered "1" in "Living expenses" field
		driver.findElement(workotbtn).click();		//Clicking on the "Work out How much I could borrow" button
		boolean text = driver.getPageSource().contains("Text which you looking for"); //Checking the Warning message
		System.out.println("The warning text is" +text); // printing the Warning message
		Reporter.log("The warning text is\" +text");	// printing the Warning message
		System.out.println("The warnin text scenario is passed");
		Reporter.log("The warnin text scenario is passed");
	}
	
	
	
	
	
	}



