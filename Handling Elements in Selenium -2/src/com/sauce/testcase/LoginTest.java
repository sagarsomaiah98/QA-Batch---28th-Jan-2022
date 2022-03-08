package com.sauce.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	
	public void login(String uname, String pwd) throws InterruptedException 
	{
		
    System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\FEB_WORKSPACE\\DRIVERS\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.saucedemo.com/");
		d.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
		d.findElement(By.id("password")).sendKeys(pwd);
		d.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		
		
		try {
		d.findElement(By.xpath("//span[@class='title']"));
		System.out.println(uname+" -> LOGGED IN SUCCESSFULLY");
		}
		catch(Exception e) {
			
			
			System.out.println(uname+" -> USER CANNOT LOGIN WITH THESE CREDENTIALS");
		}
		
		//d.close();
		d.quit();

	
		
	}

	public static void main(String[] args) throws InterruptedException
	{

		LoginTest l= new LoginTest();
		l.login("standard_user","secret_sauce");
		l.login("locked_out_user", "secret_sauce");
		l.login("problem_user", "secret_sauce");
		l.login("performance_glitch_user", "secret_sauce");
		
			
	}		

}
