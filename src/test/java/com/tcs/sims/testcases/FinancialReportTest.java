package com.tcs.sims.testcases;

import java.io.IOException;
import java.time.LocalDate;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.tcs.sims.base.TestBase;
import com.tcs.sims.pages.AdminBusinessParameterPage;
import com.tcs.sims.pages.HomePage;
import com.tcs.sims.pages.LoginPage;
import com.tcs.sims.pages.FinancialReportPage;
import com.tcs.sims.util.TestUtil;

public class FinancialReportTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	FinancialReportPage abp;
	static String SheetName="testdata";
	public FinancialReportTest()throws IOException
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
		abp=new FinancialReportPage();
	}

	@DataProvider
	public Object[][] getTestDataa()
	{
		Object data[][]=TestUtil.getTestData();
		return data;
	}
	
	
	
	
	@Test(priority=1,dataProvider="getTestDataa")
	//@Test(priority=1)
	public void financialReport(String username,String password,String dusername,String dpassword) throws Exception
	{
	
	loginpage.login(username, password,dusername,dpassword);
	Thread.sleep(10000);

	
	loginpage.sims();
	System.out.println("Before abp");
	Thread.sleep(15000);
	
	
	

	
	
	driver.switchTo().frame("app_9516_content");
	Thread.sleep(5000);
	abp.fReport();
	System.out.println("After abp");
	}
	
	
	/*
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}*/
}
