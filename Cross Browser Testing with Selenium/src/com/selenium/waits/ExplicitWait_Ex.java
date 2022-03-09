package com.selenium.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Ex {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();


WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3000));

wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
	}

}
