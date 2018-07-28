package com.tcs.sims.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class PhantomJSheadLeassDriver {

	
	@Test
	public void headlessTesting() throws Exception
	{
		System.setProperty("phantomjs.binary.path", "G:\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		WebDriver driver=new PhantomJSDriver();
		driver.get("http://www.freecrm.com");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("naveenk");
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("test@123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
	}
}
