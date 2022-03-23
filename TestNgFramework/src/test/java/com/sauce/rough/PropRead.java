package com.sauce.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropRead {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis= new FileInputStream("S:\\JANBASK\\FEB_WORKSPACE\\TestNgFramework\\src\\main\\java\\com\\sauce\\config\\config.properties");
		
		Properties prop= new Properties();
		
		
		
		prop.load(fis);
		
		String bname=prop.getProperty("Browser");
		System.out.println(bname);
		
		String url= prop.getProperty("URL");
		System.out.println(url);
		
		
		
		
	}

}
