package com.selenium.links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\FEB_WORKSPACE\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		
		
		
List<WebElement> links=	driver.findElements(By.tagName("a"));


System.out.println("Number of links in the page is -> "+links.size());//total number of links in the page

//System.out.println(links.get(47).getText());
		
for (  int i=0;i<links.size();i++) 

{
	System.out.println(links.get(i).getText());
}

	}

}
