package com.sample.mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
        
		WebDriverManager.chromedriver().setup();
		
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.saucedemo.com/");
		d.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		d.findElement(By.id("password")).sendKeys("secret_sauce");
		d.findElement(By.name("login-button")).click();
		
		d.quit();

	}

}
