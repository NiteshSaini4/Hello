package com.module_2.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Documents\\Batch7pm\\LoginApps\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.findElement(By.cssSelector("img[title='PayPal']")).click();
		
	}

}
//file:///C:/Users/dell/Desktop/tb.html