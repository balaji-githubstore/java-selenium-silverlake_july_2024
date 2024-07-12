package com.silverlake.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FbLogin {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://facebook.com");

//		 By locator= By.id("email");
//		 WebElement element= driver.findElement(locator);
//		 element.sendKeys("hello");
//		 
//		 
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("hello");

		// driver.findElement(By.id("email")).sendKeys("hello1223452@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("welome233");

		// click on login
		driver.findElement(By.name("login")).click();

	}

}
