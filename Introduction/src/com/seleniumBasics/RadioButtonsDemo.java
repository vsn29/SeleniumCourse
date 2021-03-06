//Handling Radio buttons in selenium:
//============================================================

package com.seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsDemo {

	public static void main(String[] args) throws InterruptedException {

		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumCourse\\chromedriver_win32\\chromedriver.exe");

		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();

		// Launch Website
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='radio1']")).click();

		int a = driver.findElements(By.xpath("//input[@type='radio']")).size();

		System.out.println(a);

		// Close Browser

		driver.close();
	}
}
