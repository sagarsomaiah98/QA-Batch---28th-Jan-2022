package com.sauce.tests;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.sauce.testbase.TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends TestBase{
	
	
	@Test
	public void Validlogintest() throws IOException, InterruptedException 
	
	{
		intialize();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();	
		String actual=driver.findElement(By.xpath("//span[contains(text(),'Products')]")).getText();
		assertEquals(actual, "PRODUCTS");
		
		
		
		
		
	}
	
	@Test
	public void invalidlogintest() throws IOException, InterruptedException 
	{
       intialize();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("username1");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		//String actual=driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]")).getText();
		//assertEquals(actual, "Epic sadface: Username and password do not match any user in this service");
		String actual=driver.findElement(By.xpath("//span[contains(text(),'Products')]")).getText();
		
		assertEquals(actual, "PRODUCTS");
	}
	
	@AfterMethod
	public void teardown() 
	
	{
		driver.quit();
		
	}

}
