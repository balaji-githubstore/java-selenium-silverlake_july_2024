package com.silverlake.advance;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//standalone
//java -jar selenium-server-4.22.0.jar hub
public class Demo7Grid {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.85:4444"),cap);
		
		driver.get("https://google.com");
		
		System.out.println(driver.getTitle());
		Thread.sleep(9000);
		
		driver.quit();
	}

}
