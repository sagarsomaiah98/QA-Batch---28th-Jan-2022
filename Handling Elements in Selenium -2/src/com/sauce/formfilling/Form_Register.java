package com.sauce.formfilling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_Register {
	
	
	public static String unique_lname() 
	{
    String[] alp= {"a","b","c","d","2","3","12","v","z","3","t","y","r"};
 		
		int num;
		
		String value = "";
		for( int i=0;i<5;i++)
		{
		num= (int) (Math.random()*10);
		//System.out.println(num);
		value=alp[num]+value;
		}
		//System.out.println(value);
		
		return value;
		}

		
		
		
	
	
	
	public void register() throws InterruptedException 
	{
		
	 System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\FEB_WORKSPACE\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver(); // launch the browser
		
		

	
         Thread.sleep(3000);  
		  String fname="Lee";
		  String lname="Con"; 
		  String Address="24 central sydney"; 
		  String city="sydney";
		  String state=" Aus";
		  String pin ="4178"; 
		  String phone="4123456";
		  String SSN="78856";
		  String Uname=unique_lname();
		  String pwd="pwd123"; 
		  String confirm="pwd123";
		  
		  driver.get("https://parabank.parasoft.com/parabank/register.htm");
		  driver.manage().window().maximize();
		  
		  // driver.findElement(By.xpath(""))
		  driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(fname);
		  driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys(lname);
		  driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys(Address);
		  driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys(city);
		  driver.findElement(By.xpath(" //input[@id='customer.address.state']")).sendKeys(state);
		  driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys(pin);
		  driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys(phone);
		  driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys(SSN);
		  driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(Uname); 
		 
		//  method("//input[@id='customer.username']").sendKeys("john3365oo");
		  driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys(pwd);
		  driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys(confirm);
		  driver.findElement(By.xpath("//input[@value='Register']")).click();
		  
		  String msg=driver.findElement(By.xpath("//h1[@class='title']")).getText();
		  
		  System.out.println(msg);
		
	}

	public static void main(String[] args) throws InterruptedException {
		Form_Register f = new Form_Register();
		f.register();
	//String uname=	unique_lname();
	//System.out.println(uname);
		
		

	}

}
