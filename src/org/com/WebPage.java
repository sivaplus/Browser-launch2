package org.com;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebPage {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Dell\\eclipse-workspace\\BrowserLanuch\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		

          WebElement newAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
          newAccount.click();
        
  
          Thread.sleep(2000);
          WebElement day = driver.findElement(By.id("day"));
          Select s=new Select(day);
          s.selectByIndex(18);
         
          WebElement month = driver.findElement(By.id("month"));
          Select s1=new Select(month);
          s1.selectByIndex(2);
       
          WebElement year = driver.findElement(By.id("year"));
          Select s2=new Select(year);
          s2.selectByVisibleText("2015");
          
        
          WebElement gender = driver.findElement(By.xpath("//span[@data-type='radio'][1]"));
         gender.click();
         
	}


	
}