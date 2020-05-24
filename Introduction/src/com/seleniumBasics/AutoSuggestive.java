package com.seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumCourse\\chromedriver_win32\\chromedriver.exe");

		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();

		// Launch Website
		driver.get("https://www.makemytrip.com"); // URL in the browser

		WebElement source = driver.findElement(By.xpath("//span[@class='chNavText darkGreyText'][1]"));
		source.clear();
		source.sendKeys("MUM");
		Thread.sleep(2000);
		source.sendKeys(Keys.ENTER);

		WebElement destination = driver.findElement(By.id("hp-widget__sTo"));
		destination.clear();
		destination.sendKeys("DEL");
		Thread.sleep(2000);
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ENTER);

	}
}
