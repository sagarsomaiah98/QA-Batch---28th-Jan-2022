package com.selenium.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


//https://chromedriver.chromium.org/downloads
//https://github.com/mozilla/geckodriver/releases
public class LaunchBrowser {

	public static void main(String[] args) {
		
		//Launch chromeBrowser
		
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\FEB_WORKSPACE\\DRIVERS\\chromedriver.exe");
		
		//WebDriver d= new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "S:\\JANBASK\\FEB_WORKSPACE\\DRIVERS\\geckodriver.exe");
		
	//	WebDriver d1= new FirefoxDriver();
		System.setProperty("webdriver.edge.driver", "S:\\JANBASK\\FEB_WORKSPACE\\DRIVERS\\msedgedriver.exe");
		
		WebDriver d2= new EdgeDriver();
		

	}

}
