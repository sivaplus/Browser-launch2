package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\BrowserLanuch\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/city/chennai");

		WebElement location = driver.findElement(By.xpath("//div[text()='Setup your precise location']"));
		location.click();

		WebElement enter = driver.findElement(By.xpath("//input[@placeholder='Search for area, street name...']"));
		enter.sendKeys("Chennai");

	}
}