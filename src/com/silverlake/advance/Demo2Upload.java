package com.silverlake.advance;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2Upload {

	public static void main(String[] args) {
		
		File file=new File("file/Balaji Dinakaran Profile - QA-AI.pdf");
		String absPath=file.getAbsolutePath();
		System.out.println(absPath);
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.ilovepdf.com/pdf_to_word");
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(absPath);
	}
}
