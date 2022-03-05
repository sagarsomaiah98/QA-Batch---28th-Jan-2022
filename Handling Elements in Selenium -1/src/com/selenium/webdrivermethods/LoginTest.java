package com.selenium.webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\FEB_WORKSPACE\\DRIVERS\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.saucedemo.com/");
		d.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		d.findElement(By.id("password")).sendKeys("secret_sauce1");
		d.findElement(By.name("login-button")).click();
		
		
		try {
		d.findElement(By.xpath("//span[@class='title']"));
		System.out.println("LOGGED IN SUCCESSFULLY");
		}
		catch(Exception e) {
			
			
			System.out.println("USER CANNOT LOGIN WITH THESE CREDENTIALS");
		}
		
		//d.close();
		d.quit();

	}

}
