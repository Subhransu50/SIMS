package com.tcs.sims.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tcs.sims.base.TestBase;
import com.tcs.sims.util.TestUtil;

public class LoginPage extends TestBase {

	public static String TESTDATA_SHEET_PATH = "H:/Automation"
			+ "/SIMS/src/main/java/com/tcs/sims/testdata/testdata.xlsx";
	
	@FindBy(name="accountname")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="html/body/div[3]/div[3]/div[1]/form/div[6]/a[2]")
	WebElement loginBtn;
	
	@FindBy(xpath="button[contains(text(),'Sign Up']")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	@FindBy(xpath=".//*[@id='username']")
	WebElement dualuname;
	
	@FindBy(xpath=".//*[@id='password']")
	WebElement dualpassword;
	
	@FindBy(xpath=".//*[@id='login_btn']")
	WebElement duallogin;
	
	@FindBy(xpath="html/body/div[2]/div[3]/div/button")
	WebElement alert;
	
	@FindBy(xpath=".//*[@id='start']")
	WebElement webtop;
	
	@FindBy(xpath=".//*[@id='id56']")
	WebElement sims1;
	
	@FindBy(xpath=".//*[@id='window_applications_content']")
	WebElement sims2;
	
	@FindBy(xpath=".//*[@id='quicklauncher']/div/a[2]")
	WebElement forward;
	
	@FindBy(xpath="//*[@id='idc']//img")
	WebElement sims;
	
	
	/*@FindBy(xpath="//li[@id='9516']//a[@id='ida']//img")
	WebElement simsfinancialreport;*/
	
	@FindBy(xpath="//*[@id='9516']")
	WebElement simsfinancialreport;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginpageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateCRMImage()
	{
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String ur,String pwd,String dunm,String dpwd) throws Exception
	{Thread.sleep(5000);
		username.sendKeys(ur);
		password.sendKeys(pwd);
		Thread.sleep(5000);
		loginBtn.click();
		
		Thread.sleep(40000);
		dualuname.sendKeys(dunm);
		dualpassword.sendKeys(dpwd);
		duallogin.click();
		
		
		Thread.sleep(40000);
		alert.click();
		Thread.sleep(5000);
		
	/*System.out.println("A");
	driver.findElement(By.name("accountname")).sendKeys("admin.tcssupport@greatlakes.com");
	System.out.println("B");
	Thread.sleep(5000);
	driver.findElement(By.name("password")).sendKeys("widowwh!te");
	System.out.println("C");
	Thread.sleep(5000);
	driver.findElement(By.xpath("html/body/div[3]/div[3]/div[1]/form/div[6]/a[2]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("dunm");
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("dpwd");
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='login_btn']")).click();
	Thread.sleep(5000);*/
	
		return new HomePage();
	}
	
	
	/**
	 * @throws Exception 
	 * 
	 */
	
	public HomePage sims() throws Exception
	{
		/*int size = driver.findElements(By.id("presence")).size();
	    System.out.println("Total Frames --" + size);
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath(".//*[@id='window_applications_content']/div")));
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();", sims1);
		//js.executeScript("window.scrollBy(0,1000)"); 
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");	
		System.out.println("fabulous");
		driver.switchTo().frame(1);
		Thread.sleep(10000);
		System.out.println("OMG my goodness");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		System.out.println("antidrone");
		Thread.sleep(5000);
		System.out.println("monkey");
		Thread.sleep(2000);
		sims1.click();*/
		
		
		//forward.click();
		
		
		//Thread.sleep(1000);
		
		
		//sims.click();
		
		
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		//JavascriptExecutor exe = (JavascriptExecutor) driver;
		
		
		simsfinancialreport.click();
		return new HomePage();
		
	}
}
