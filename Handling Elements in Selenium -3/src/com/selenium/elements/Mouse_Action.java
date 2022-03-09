package com.selenium.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Action {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\FEB_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/");
		
		Actions a= new Actions(driver);
		
		//mouse hover on the element
		
		a.moveToElement(driver.findElement(By.xpath("//a[@class='no_border'][normalize-space()='Free Ebooks']"))).build().perform();
		
		
		
		
		driver.findElement(By.xpath("//span[normalize-space()='Free Deep Learning eBooks']")).click();

	}

}
