package com.tcs.sims.testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class seleniumgrid {

	@Test
	public void test1() throws MalformedURLException
	{
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setPlatform(Platform.WINDOWS);
		URL url=new URL("http://192.168.43.120:4444/wd/hub");
		WebDriver driver=new RemoteWebDriver(url, cap);
		driver.get("https://qa.tcsion.com");
		System.out.println(driver.getTitle());
		
	}
	
}
