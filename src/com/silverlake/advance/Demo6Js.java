package com.silverlake.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo6Js {

	public static void main(String[] args) {
		
		

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.citibank.co.in/ssjsps/forgetuseridmidssi.jsp");

		driver.findElement(By.linkText("select your product type")).click();
		driver.findElement(By.linkText("Credit Card")).click();

		// approach 1 - not working
		driver.findElement(By.id("bill-date-long")).sendKeys("17/06/1992");

		// approach 2 - automate calendar
		// select year
		// select month
		// click on 17
		driver.findElement(By.name("DOB")).click();

		Select oSelectYear = new Select(driver.findElement(By.xpath("//select[@data-handler='selectYear']")));
		oSelectYear.selectByVisibleText("2022");

		Select oSelectMn = new Select(driver.findElement(By.xpath("//select[@data-handler='selectMonth']")));
		oSelectMn.selectByVisibleText("Apr");

		driver.findElement(By.xpath("//a[text()='14']")).click();

		// approach 3 - js
		JavascriptExecutor js =(JavascriptExecutor) driver; 
		js.executeScript("document.querySelector('#bill-date-long').value='17/06/1992'");
		
		//approach 4
		WebElement ele1=driver.findElement(By.xpath("//input[@id='bill-date-long']"));
		js.executeScript("arguments[0].value='17/06/1992'",ele1);
	}

}
