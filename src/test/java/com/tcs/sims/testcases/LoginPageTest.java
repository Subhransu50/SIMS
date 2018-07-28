package com.tcs.sims.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.tcs.sims.base.TestBase;
import com.tcs.sims.pages.HomePage;
import com.tcs.sims.pages.LoginPage;
import com.tcs.sims.util.TestUtil;

public class LoginPageTest  extends TestBase{

	LoginPage loginpage;
	HomePage homepage;
	static String SheetName="testdata";
	public LoginPageTest()throws IOException
	{
		super();
	}
	
	@BeforeMethod
	@Parameters({ "browser" })
	public void setUp(String browser)
	{
		initialization(browser);
		loginpage=new LoginPage();
	}
	
/*	@Test(priority=3)
	public void loginPageTitleTest()
	{
		String a=loginpage.validateLoginpageTitle();
		Assert.assertEquals(a, "Free CRM software in the cloud powers sales and customer service");
		
	}
	@Test(priority=2)
	public void crmLogoImageTest()
	{
		boolean flag=loginpage.validateCRMImage();
		Assert.assertTrue(flag);
	}*/
	
	@DataProvider
	public Object[][] getTestDataa()
	{
		Object data[][]=TestUtil.getTestData();
		return data;
	}
	
	
	@Test(priority=1,dataProvider="getTestDataa")
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
	
	}
	/*@AfterMethod
	public void tearDown() throws Exception
	{
		Thread.sleep(5000);
		driver.quit();
	}*/
}
