package com.silverlake.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1 {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.db4free.net/");

		// click on phpMyAdmin »
		// b[contains(text(),'phpMy')]
		driver.findElement(By.partialLinkText("phpMyAdmin")).click();

		// switch to 2nd tab
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));

		driver.findElement(By.id("input_username")).sendKeys("admin");
		// enter password as admin123
		// click on log in

		driver.close(); // check what's happening?
		
		//switch to tab 1
		driver.switchTo().window(windows.get(0));
		
		//print the title
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
