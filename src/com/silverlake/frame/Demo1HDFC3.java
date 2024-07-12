package com.silverlake.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

//name or id as string
public class Demo1HDFC3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.switchTo().frame("login_page");
		
		//enter userid as jack123
		driver.findElement(By.name("fldLoginUserId")).sendKeys("hello123");
		
		//click on Continue
		//linktext or partial link text --> give character font as per UI
		//xpath - font as per html 
		driver.findElement(By.linkText("CONTINUE")).click();
		
		//switch to main html
		driver.switchTo().defaultContent();
	}

}
