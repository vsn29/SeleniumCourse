//Handling Dynamic Drop Down in selenium
//=====================================================================

package com.seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {

		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumCourse\\chromedriver_win32\\chromedriver.exe");

		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();

		// Launch Website
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	
        //Select Bangalore as Source
		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		Thread.sleep(2000);

		/*
		 * driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		 */
		
		//Entering the Destination
		/*
		 * driver.findElement(By.xpath(
		 * "//input[@name='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		 */
		 //Select the Destination Chennai(MAA) : locating element using Parent-child relationship
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();  
		
		  Thread.sleep(2000);
		  
		  //Clicks on the Current Date once the Source and Destinations are selected
		  driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).click();
		 
         //Close Browser
		  
		  driver.close();
	}

}
