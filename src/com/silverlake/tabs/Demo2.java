package com.silverlake.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.db4free.net/");

		// click on phpMyAdmin »
		// b[contains(text(),'phpMy')]
		driver.findElement(By.partialLinkText("phpMyAdmin")).click();

		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());

		System.out.println(windows);
		System.out.println(windows.get(0));
		System.out.println(windows.get(1));


		for (String window : windows) 
		{
			driver.switchTo().window(window);
			if (driver.getTitle().equals("phpMyAdmin")) 
			{
				break;
			}
		}
		
		driver.findElement(By.id("input_username")).sendKeys("admin");
	}

}
