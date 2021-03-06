//Selenium WebDriver- Handling Alerts 
//===================================================================
//Points to Remember:
//--------------------------------------------------------------------

//1)Selenium WebDriver provides three methods to accept and reject the Alert depending on the Alert types.

//   a)void dismiss() :This method is used to click on the 'Cancel' button of the alert.

//      ==>Syntax: driver.switchTo().alert().dismiss();  

//   b) void accept():This method is used to click on the 'Ok' button of the alert.

//      ==>Syntax: driver.switchTo().alert().accept(); 

//   c)String getText():This method is used to capture the alert message.

//      ==>Syntax: driver.switchTo().alert().getText(); 

//   d)void sendKeys(String stringToSend):This method is used to send some data to the alert box.

//     ==>Syntax:driver.switchTo().alert().sendKeys("Text");  

package com.seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {

		String text = "Vijaya";
		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumCourse\\chromedriver_win32\\chromedriver.exe");

		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();

		// Launch Website
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice");

		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Enter the String in the input box to pop-up the alert box
		driver.findElement(By.id("name")).sendKeys(text);
		Thread.sleep(2000);
		// alert pop up appears
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		Thread.sleep(2000);

		// Gets the alert box Text
		System.out.println(driver.switchTo().alert().getText());

		Thread.sleep(2000);

		// This clicks the 'OK' option in alert box
		driver.switchTo().alert().accept();

		Thread.sleep(2000);

		// This line clicks the 'confirm' button
		driver.findElement(By.cssSelector("[id='confirmbtn']")).click();
		Thread.sleep(2000);

		// Gets the alert box Text
		System.out.println(driver.switchTo().alert().getText());

		// This line clicks on the 'Cancel' button on the alert box
		driver.switchTo().alert().dismiss();

		// Close Browser

		driver.close();

	}
}
