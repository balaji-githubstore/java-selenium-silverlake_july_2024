package com.silverlake.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FbSignup {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://facebook.com");  //wait for page load to complete
		
		driver.findElement(By.xpath("(//span[text()='Allow all cookies'])[2]")).click();

		// findElement - takes only 0.5s to check the presence of element
		driver.findElement(By.linkText("Create new account")).click();
		
		// findElement - takes only 0.5s to check the presence of element
		driver.findElement(By.name("firstname")).sendKeys("john");
		
		//enter lastname as wick
		driver.findElement(By.name("lastname")).sendKeys("wick");
		
		//enter password as welcom123
		driver.findElement(By.id("password_step_input")).sendKeys("john123");
		
		//click on custom radio button
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		//17 june 1992
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("17");
		
		Select selectMonth=new Select(driver.findElement(By.id("month")));
//		selectMonth.selectByVisibleText("Jun");
//		selectMonth.selectByValue("6");
		selectMonth.selectByIndex(5);
		
		//select year as 1992
		Select selectYear=new Select(driver.findElement(By.id("year")));
		selectYear.selectByVisibleText("1992");
		
//		click on sign up

	}
}






