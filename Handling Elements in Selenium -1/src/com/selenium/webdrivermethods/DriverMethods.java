package com.selenium.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\FEB_WORKSPACE\\DRIVERS\\chromedriver.exe");
	// Interface object  class	
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		// d.get("https://www.saucedemo.com/");
		d.navigate().to("https://www.saucedemo.com/");
		
		String title =d.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		d.navigate().to("https://www.janbask.com");
		title =d.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		d.navigate().to("https://www.bing.com");
		title =d.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		d.navigate().back();
		Thread.sleep(2000);
		d.navigate().back();
		Thread.sleep(2000);
		d.navigate().forward();
		Thread.sleep(2000);
		d.navigate().refresh();
		
		d.close();
	
		
		
	}

}
