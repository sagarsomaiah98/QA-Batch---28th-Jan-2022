package com.selenium.elements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Ex {

	public static void main(String[] args) throws InterruptedException {
	
		//ctrl+shift+O
		
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\FEB_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		
		Thread.sleep(2000);
		
	
		
		Alert a =driver.switchTo().alert();
		
		String text=a.getText();
		//a.accept();
		a.dismiss();
		
		System.out.println(text);
		
		
	}

}
