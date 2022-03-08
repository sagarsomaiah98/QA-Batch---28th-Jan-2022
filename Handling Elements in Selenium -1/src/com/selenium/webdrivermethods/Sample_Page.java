package com.selenium.webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Page {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\FEB_WORKSPACE\\DRIVERS\\chromedriver.exe");

		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.globalsqa.com/samplepagetest/");
		Thread.sleep(3000);
		//d.findElement(By.xpath("//input[@id='g2599-name']")).sendKeys("standard_user");
		//d.findElement(By.xpath("//input[@name='g2599-education']")).click();
		
		JavascriptExecutor executor = (JavascriptExecutor) d;
	     executor.executeScript("arguments[0].click();", d.findElement(By.xpath("//input[@name='g2599-education']")));
	     executor.executeScript("arguments[0].click();", d.findElement(By.xpath("//input[@value='Automation Testing']")));
		//d.findElement(By.name("//input[@value='Automation Testing']]")).click();
		System.out.println("clicked");

	}

}
