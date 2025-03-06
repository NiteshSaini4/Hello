package com.module_1.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Documents\\Batch7pm\\LoginApps\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
		driver.findElement(By.name("userfile")).sendKeys("C:\\Users\\dell\\Desktop\\alt2.pdf");
		
		
	}

}
