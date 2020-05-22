//Handling Dynamic Drop Down in selenium
//=====================================================================

//Using Select class for selecting value from dropdown  
//Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));  
//dropdown.selectByVisibleText("Database Testing");

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
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");

		driver.manage().window().maximize();

		Thread.sleep(5000);

//Using Select class for selecting value from dropdown  

		Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
		dropdown.selectByVisibleText("Database Testing");

		Thread.sleep(2000);
		// Close the Browser
		driver.close();
	}

}
