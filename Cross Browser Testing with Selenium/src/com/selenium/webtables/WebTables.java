package com.selenium.webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		//https://money.rediff.com/gainers/bsc/daily/groupa

		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\FEB_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
	//WebElement table=	driver.findElement(By.xpath("//table[@class='dataTable']"));
	//table.findElement(null)

	}

}
