package com.tcs.sims.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.tcs.sims.base.TestBase;
import com.tcs.sims.pages.AdminBusinessParameterPage;
import com.tcs.sims.pages.HomePage;
import com.tcs.sims.pages.LoginPage;
import com.tcs.sims.util.TestUtil;

public class AdminBusinessParameterTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	AdminBusinessParameterPage abp;
	static String SheetName="testdata";
	public AdminBusinessParameterTest()throws IOException
	{
		super();
	}
	
	@BeforeMethod
	@Parameters({ "browser" })
	public void setUp(String p)
	{
		initialization(p);
		//initialization();
		loginpage=new LoginPage();
		abp=new AdminBusinessParameterPage();
	}

	@DataProvider
	public Object[][] getTestDataa()
	{
		Object data[][]=TestUtil.getTestData();
		return data;
	}
	@Test(priority=3,dataProvider="getTestDataa")
	//@Test(priority=1)
	public void loginTest(String username,String password,String dusername,String dpassword) throws Exception
	{
	
		
	//homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	loginpage.login(username, password,dusername,dpassword);
	Thread.sleep(10000);
//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	//driver.switchTo().alert().accept();
	//a.accept();
	
	loginpage.sims();
	System.out.println("Before abp");
	Thread.sleep(5000);
	

	/*JavascriptExecutor exe = (JavascriptExecutor) driver;
	Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
	System.out.println("Number of iframes on the page are " + numberOfFrames);*/


	//By finding all the web elements using iframe tag
	/*List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
	System.out.println("The total number of iframes are " + iframeElements.size());
	for(int i=0;i<iframeElements.size();i++)
	{
		String frame=iframeElements.get(i).getText();
		System.out.println(frame);
	}
	//System.out.println("The total number of iframes are " + iframeElements);
	List<WebElement> list=driver.findElements(By.tagName("a"));
	System.out.println(list.size());
	for(int i=0;i<list.size();i++)
	{
		String value=list.get(i).getText();
		System.out.println(value);
	}*/
	driver.switchTo().frame("app_9516_content");
	Thread.sleep(5000);
	abp.loginnew();
	System.out.println("After abp");
	}
	@Test(priority=2,dataProvider="getTestDataa")
	//@Test(priority=1)
	public void businessParameter(String username,String password,String dusername,String dpassword) throws Exception
	{
	
	loginpage.login(username, password,dusername,dpassword);
	Thread.sleep(10000);

	
	loginpage.sims();
	System.out.println("Before abp");
	Thread.sleep(5000);
	
	
	

	
	
	driver.switchTo().frame("app_9516_content");
	Thread.sleep(5000);
	abp.readBusinessParameter();
	System.out.println("After abp");
	}
	@Test(priority=1,dataProvider="getTestDataa")
	//@Test(priority=1)
	public void uploadFile(String username,String password,String dusername,String dpassword) throws Exception
	{
	
	loginpage.login(username, password,dusername,dpassword);
	Thread.sleep(10000);

	
	loginpage.sims();
	System.out.println("Before abp");
	Thread.sleep(5000);
	
	
	

	
	
	driver.switchTo().frame("app_9516_content");
	Thread.sleep(5000);
	abp.uploadLogo();
	System.out.println("After abp");
	}
	/*
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}*/
}
