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

public class AddToCartTest extends TestBase {
	
	@Test
	public void addTocarttest() throws InterruptedException, IOException 
	{
		
		intialize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();	
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		
		boolean actual=driver.findElement(By.xpath("//button[@id='continue-shopping']")).isDisplayed();
		
		assertEquals(actual, true);
	}

	
	@AfterMethod
	public void teardown() 
	
	{
		driver.quit();
		
	}
}
