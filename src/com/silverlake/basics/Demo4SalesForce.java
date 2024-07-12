package com.silverlake.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4SalesForce {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");  //wait for page load to complete
		
		driver.findElement(By.name("UserFirstName")).sendKeys("jack");
		
		//input[contains(@id,'UserLast')]

	}
}
