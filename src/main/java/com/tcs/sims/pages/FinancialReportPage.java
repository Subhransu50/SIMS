package com.tcs.sims.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tcs.sims.base.TestBase;
import com.tcs.sims.util.TestUtil;

public class FinancialReportPage extends TestBase {

	@FindBy(linkText = "Reports")
	WebElement Reports;

	@FindBy(xpath = "//a[@id='financialreport' and text()='Financial Reports']")
	WebElement FinancialReport;

	@FindBy(xpath = "//a[@id='uploadlogo' and text()='Upload Organization Logo']")
	WebElement uploadLogo;

	@FindBy(xpath = "//a[@class='light-blue-btn ' and text()='Create']")
	WebElement Create;

	@FindBy(xpath = "//select[@name='entityName']")
	WebElement dropdown;

	@FindBy(xpath = "//option[@value='175832']")
	WebElement certificate;

	@FindBy(xpath = "//a[@class='blue-btn positiveAction searchIssueTable-btn hideSearchPanel' and text()='Search']")
	WebElement search;

	@FindBy(xpath = "//td[@align='left' and text()='Payment Mode Enable']/preceding-sibling::td//input[@name='selectedParam']")
	WebElement checkPaymentModeEnable;

	@FindBy(xpath = "//td[@align='left' and text()='Payment Mode Enable']/following-sibling::td/following-sibling::td[@align='left']//input[@id='businessParams']")
	WebElement enter;

	@FindBy(xpath = "//div[@class='button-pane margin-20-top']//a[@class='blue-btn modifyCardDetails' and text()='Save']")
	WebElement save;

	@FindBy(xpath = "//div[@class='mainTablePart-div']//table//thead/following-sibling::tbody//tr//td[contains(text(),'Payment Mode Enable')]/following-sibling::td")
	WebElement read;

	@FindBy(xpath = "//input[@id='eVerificationFile']")
	WebElement browse;

	@FindBy(xpath = "//a[@class='blue-btn positiveAction' and text()='Upload']")
	WebElement submit;
	
	@FindBy(xpath = "//input[@id='fromDate']")
	WebElement fromDate;
	
	
	@FindBy(xpath = "//input[@id='toDate']")
	WebElement toDate;
	
	
	
	/*@FindBy(xpath = "//a[@class='blue-btn positiveAction searchSeetingTable-btn hideSearchPanel']")
	WebElement Search;*/
	
	@FindBy(xpath="//a[@class='blue-btn positiveAction searchSeetingTable-btn hideSearchPanel' and text()='Search']")
	WebElement Search;
	
	/*DateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd");
	Date date11=new Date();
	String todate=dateFormat.format(date11);
	*/
	
	
	String beforeXpath="html/body/div[2]/table[2]/tbody/tr[";
	String afterXpath="]/td[";
	
	String todate="2018-07-01";
	String fromdate="2015-06-03";
	
	
	LocalDate date = LocalDate.now();
	LocalDate date2=date.minusYears(3);
	
	/*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
	String formattedString = date.format(formatter);
	
	DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-mm-dd");
	String formattedString1 = date2.format(formatter1);
	
	
	DateTimeFormatter formatter_1 = DateTimeFormatter.ofPattern("yyyy-mm-dd");
	String format_1=(date).format(formatter_1);
	
	DateTimeFormatter formatter_2 = DateTimeFormatter.ofPattern("yyyy-mm-dd");
	String format_2=(date2).format(formatter_1);*/


	public FinancialReportPage() {
		PageFactory.initElements(driver, this);
	}

	public FinancialReportPage fReport() throws Exception {
		System.out.println("-------Starting---------");

		Actions action = new Actions(driver);
		Thread.sleep(5000);
		action.moveToElement(Reports).build().perform();

		Thread.sleep(5000);

		FinancialReport.click();
		Thread.sleep(40000);
		
		
		LocalDate date = LocalDate.now();
		
		int b=date.getYear();
		int c=b-3;
		System.out.println(c);
		int e=date.getDayOfYear();
		System.out.println(e-1);
		int o=date.getDayOfMonth();
		int v=o-1;
		System.out.println(v);
		String bh=Integer.toString(v);
		System.out.println(bh);
		
		
		/*LocalDate y=date.minusYears(3);
		String s=y.toString();
		System.out.println("***************"+s);
		String f[]=s.split("-");
		String year=f[0];
		String month=f[1];
		String date1=f[2];
		String uh="18";*/
		
		driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div[1]/table/tbody/tr/td[2]/button")).click();
		Thread.sleep(2000);
		final int totalWeekdays=7;
		boolean flag=false;
		for(int rowNum=2;rowNum<=7;rowNum++)
		{
			for(int colNum=1;colNum<=totalWeekdays;colNum++)
			{
				String dayVal=driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).getText();
				//System.out.println(dayVal);
				if(dayVal.equals(bh))
				{
					System.out.println("yes");
					driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).click();
					System.out.println("ok");
					flag=true;
					break;
					
				}
				System.out.println("If loop does not get executed");
			}
			if(flag)
			{
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='blue-btn positiveAction searchSeetingTable-btn hideSearchPanel' and text()='Search']")).click();
		String ActualText=driver.findElement(By.xpath("//td[@class='pagemessagetext1']/span[@class='msgtype']")).getText();
		System.out.println(ActualText);
		//String ExpectedText="Maximum Allowed day range is Exceeded.";
		String ExpectedText="Error!";
		Thread.sleep(2000);
		Assert.assertEquals(ActualText, ExpectedText,"Text does not match");
		return new FinancialReportPage();
	}

	
}
