package org.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {


		public static void main(String[] args) throws InterruptedException{
			
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\Dell\\eclipse-workspace\\BrowserLanuch\\Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			//driver.get("https://www.facebook.com/");
			driver.get("https://demo.automationtesting.in/Alerts.html");

			//simple alert
			WebElement simplealert = driver.findElement(By.xpath("//a[text()='Alert with OK']"));
			simplealert.click();
			
			
			
			WebElement checkbox = driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box')]"));
			checkbox.click();
			
			
			Alert alert = driver.switchTo().alert();
			Thread.sleep(2000);
			
			//confirm alert
			 WebElement checkbox1 = driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box']"));
				checkbox1.click();
			
			
			
					
			
			
	//WebElement username = driver.findElement(By.id("email"));
	//username.sendKeys("greens@gmail.com");
	//WebElement password = driver.findElement(By.id("pass"));
	//password.sendKeys("234569");
	//WebElement tag = driver.findElement(By.tagName("h2"));
	//String text = tag.getText();
	//System.out.println(text); 
	//WebElement login = driver.findElement(By.name("login"));
	//login.click();
//	WebElement link = driver.findElement(By.linkText("Forgotten password?"));
	//link.click();
	//WebElement partialLink = driver.findElement(By.partialLinkText("voting"));
	//partialLink.click();    
		}
		
	}

	
	


