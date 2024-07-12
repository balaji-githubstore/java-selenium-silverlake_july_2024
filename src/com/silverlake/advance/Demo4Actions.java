package com.silverlake.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo4Actions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm");
		
		
		//mousehover on Profile
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//img[@alt='Go']"))).contextClick().perform();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
	}
}
