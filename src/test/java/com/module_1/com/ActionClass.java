package com.module_1.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws Exception 
	{
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Documents\\Batch7pm\\LoginApps\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement e1=driver.findElement(By.id("APjFqb"));
		e1.sendKeys("hello");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		act.keyDown(Keys.CONTROL);//hold
		act.sendKeys("A");
		act.keyUp(Keys.CONTROL).perform();  
		
	}

}
