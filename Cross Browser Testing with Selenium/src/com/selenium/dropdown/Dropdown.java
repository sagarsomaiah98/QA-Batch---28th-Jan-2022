package com.selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\FEB_WORKSPACE\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
	
		
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Select sel = new Select(driver.findElement(By.xpath("//select[@name='dropdown']")));
		
		sel.selectByIndex(3);
		Thread.sleep(2000);
		
		sel.selectByValue("ddautomation");
		
		Thread.sleep(2000);
		
		sel.selectByVisibleText("Performance Testing");


	}

}
