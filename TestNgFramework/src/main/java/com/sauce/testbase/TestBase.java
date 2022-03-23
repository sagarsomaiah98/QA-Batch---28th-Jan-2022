package com.sauce.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static FileInputStream fis;
	public static Properties prop;
	public static WebDriver driver;
	
	public void intialize() throws IOException
	
	{
     fis= new FileInputStream("S:\\JANBASK\\FEB_WORKSPACE\\TestNgFramework\\src\\main\\java\\com\\sauce\\config\\config.properties");
		
		prop= new Properties();
		
		
		
		prop.load(fis);
		
		String bname=prop.getProperty("Browser");
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		
		if(bname.equals("Chrome"))
			driver= new ChromeDriver();
		else if(bname.equals("Firefox"))
			driver= new FirefoxDriver();
		String url= prop.getProperty("URL");
		driver.get(url);
		driver.manage().window().maximize();
		
		
		
		
		
	}

}
