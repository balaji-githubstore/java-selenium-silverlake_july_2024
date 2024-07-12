package com.silverlake.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {
		
	
		
		WebDriver obj=new ChromeDriver();
		obj.get("https://www.facebook.com/");
		
		String actualTitle= obj.getTitle();
		System.out.println(actualTitle);
		
		System.out.println(obj.getCurrentUrl());
		
		
		//getPageSource() and print it 
		String actualPS= obj.getPageSource();
		System.out.println(actualPS);
		
	
	}

}
