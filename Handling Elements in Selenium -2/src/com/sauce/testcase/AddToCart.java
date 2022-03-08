package com.sauce.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
	
	
	public void addTocart() throws InterruptedException
	{
		
System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\FEB_WORKSPACE\\DRIVERS\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.saucedemo.com/");
		d.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		d.findElement(By.id("password")).sendKeys("secret_sauce");
		d.findElement(By.name("login-button")).click();
		d.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		d.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		d.findElement(By.xpath("//button[@id='checkout']")).click();
		d.findElement(By.xpath("//input[@id='first-name']")).sendKeys("fname");
		d.findElement(By.xpath("//input[@id='last-name']")).sendKeys("lname");
		d.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("2148");
		d.findElement(By.xpath("//input[@id='continue']")).click();
		d.findElement(By.xpath("//button[@id='finish']")).click();
		String value=d.findElement(By.xpath("//div[@class='complete-text']")).getText();
		Thread.sleep(2000);
		System.out.println(value);
		d.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		
		AddToCart a = new AddToCart();
		a.addTocart();
		

	}

}
