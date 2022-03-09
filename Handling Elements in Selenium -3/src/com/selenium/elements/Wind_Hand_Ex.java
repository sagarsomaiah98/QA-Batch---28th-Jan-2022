package com.selenium.elements;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wind_Hand_Ex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\FEB_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.linkText("Privacy")).click();

		Thread.sleep(2000);

		Set<String> win = driver.getWindowHandles();

		System.out.println("Total windows opened is = " + win.size());

		Iterator<String> it = win.iterator();
		String win1 = it.next();

		String win2 = it.next();

		System.out.println("First Window  ->" + win1);
		System.out.println("Second Window ->" + win2);
		driver.switchTo().window(win2);

		Thread.sleep(2000);

		
		  
		  driver.findElement(By.xpath("//span[normalize-space()='Learn more']")).click(
		  );
		  
		  win =driver.getWindowHandles();
		  System.out.println("****************************");
		  System.out.println("Total windows opened after clicking learn more = "+win.
		  size()); it = win.iterator(); String wind1= it.next();
		  
		  String wind2 =it.next(); String wind3=it.next();
		  
		  System.out.println("First Window  ->"+wind1);
		  System.out.println("Second Window ->"+wind2);
		  System.out.println("Third Window ->"+wind3);
		 
		Thread.sleep(2000);
		driver.quit();

	}

}
