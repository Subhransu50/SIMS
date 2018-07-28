package com.tcs.sims.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tcs.sims.base.TestBase;
import com.tcs.sims.util.TestUtil;

public class AdminBusinessParameterPage extends TestBase {

	/*@FindBy(xpath="//a[@class='tab-link selected-tab' and text()='Admin']")
	WebElement Admin;*/
	@FindBy(linkText="Admin")
	WebElement Admin;
	
	
	@FindBy(xpath="//a[@id='businessparameters' and text()='Business Parameters']")
	WebElement BusinessParameter;
	
	@FindBy(xpath="//a[@id='uploadlogo' and text()='Upload Organization Logo']")
	WebElement uploadLogo;
	
	@FindBy(xpath="//a[@class='light-blue-btn ' and text()='Create']")
	WebElement Create;
	
	
	@FindBy(xpath="//select[@name='entityName']")
	WebElement dropdown;
	
	
	@FindBy(xpath="//option[@value='175832']")
	WebElement certificate;
	
	@FindBy(xpath="//a[@class='blue-btn positiveAction searchIssueTable-btn hideSearchPanel' and text()='Search']")
	WebElement search;
	
	
	/*@FindBy(xpath="//td[@align='left' and text()='Password Protected PDF']/preceding-sibling::td//input[@name='selectedParam']")
	WebElement check;*/
	
	//td[@align='left' and text()='Password Protected PDF']/following-sibling::td/following-sibling::td[@align='left']//input[@id='businessParams']
	
	/*@FindBy(xpath="//td[@align='left' and text()='Password Protected PDF']/following-sibling::td/following-sibling::td[@align='left']//input[@id='businessParams']")
	WebElement enter;*/
	
	@FindBy(xpath="//td[@align='left' and text()='Payment Mode Enable']/preceding-sibling::td//input[@name='selectedParam']")
	WebElement checkPaymentModeEnable;
	
	@FindBy(xpath="//td[@align='left' and text()='Payment Mode Enable']/following-sibling::td/following-sibling::td[@align='left']//input[@id='businessParams']")
	WebElement enter;
	
	@FindBy(xpath="//div[@class='button-pane margin-20-top']//a[@class='blue-btn modifyCardDetails' and text()='Save']")
	WebElement save;
	
	
	@FindBy(xpath="//div[@class='mainTablePart-div']//table//thead/following-sibling::tbody//tr//td[contains(text(),'Payment Mode Enable')]/following-sibling::td")
	WebElement read;
	
	@FindBy(xpath="//input[@id='eVerificationFile']")
	WebElement browse;
	
	
	@FindBy(xpath="//a[@class='blue-btn positiveAction' and text()='Upload']")
	WebElement submit;
	
	public AdminBusinessParameterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public AdminBusinessParameterPage loginnew() throws Exception
	{/*List<WebElement> ele = driver.findElements(By.tagName("frame"));
    System.out.println("Number of frames in a page :" + ele.size());
    for(WebElement el : ele){
      //Returns the Id of a frame.
        System.out.println("Frame Id :" + el.getAttribute("id"));
      //Returns the Name of a frame.
        System.out.println("Frame name :" + el.getAttribute("name"));
    }
		
		*/
		System.out.println("-------Starting---------");
		
		/*JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes on the page are " + numberOfFrames);
 
		//By finding all the web elements using iframe tag
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());
		*/
		
		Actions action=new Actions(driver);
		Thread.sleep(5000);
		action.moveToElement(Admin).build().perform();
		//action.moveToElement(driver.findElement(By.linkText("Admin"))).build().perform();
		//action.moveToElement(driver.findElement(By.xpath(".//*[@id='main']/div[9]/ul/li[7]/a"))).build().perform();-->Absolute xpath
		Thread.sleep(5000);
		//Admin.click();
		//Thread.sleep(2000);
		BusinessParameter.click();
		Thread.sleep(9000);
		Create.click();
		Thread.sleep(2000);
		dropdown.click();
		Thread.sleep(2000);
		certificate.click();
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
		checkPaymentModeEnable.click();
		Thread.sleep(5000);
		enter.clear();
		Thread.sleep(3000);
		enter.sendKeys("Y");
		Thread.sleep(5000);
		save.click();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		
		return new AdminBusinessParameterPage();
	}
	public AdminBusinessParameterPage readBusinessParameter() throws Exception
	{
		System.out.println("-------Starting---------");
		
		
		Thread.sleep(8000);
		Actions action=new Actions(driver);
		Thread.sleep(5000);
		action.moveToElement(Admin).build().perform();
		//action.moveToElement(driver.findElement(By.linkText("Admin"))).build().perform();
		Thread.sleep(5000);
		
		BusinessParameter.click();
		Thread.sleep(20000);
		//Create.click();
		//Thread.sleep(2000);
		dropdown.click();
		Thread.sleep(2000);
		certificate.click();
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
		/*checkPaymentModeEnable.click();
		Thread.sleep(5000);
		enter.clear();
		Thread.sleep(3000);
		enter.sendKeys("Y");
		Thread.sleep(5000);
		save.click();*/
		String a=read.getText();
		System.out.println(a);
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		
		return new AdminBusinessParameterPage();
	}
	
	public AdminBusinessParameterPage uploadLogo() throws Exception
	{
		System.out.println("-------Starting---------");
		
		
		Thread.sleep(8000);
		Actions action=new Actions(driver);
		Thread.sleep(5000);
		action.moveToElement(Admin).build().perform();
		//action.moveToElement(driver.findElement(By.linkText("Admin"))).build().perform();
		Thread.sleep(5000);
		
		uploadLogo.click();
		Thread.sleep(20000);
		//Create.click();
		//Thread.sleep(2000);
		browse.sendKeys("H:\\Automation\\SIMS\\src\\uploadedFile\\blue.png");
		//driver.findElement(By.xpath("//input[@id='eVerificationFile']")).sendKeys("H:\\Automation\\SIMS\\src\\uploadedFile\\blue.png");
		Thread.sleep(2000);
		submit.click();
		/*certificate.click();
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
		*/
		
		
		return new AdminBusinessParameterPage();
	}
}
