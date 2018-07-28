package com.tcs.sims.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import net.bytebuddy.asm.Advice.Argument;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.phantomjs.PhantomJSDriver;
//import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.tcs.sims.util.TestUtil;
//import com.crm.qa.util.WebEventListener;
//import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;
import com.tcs.sims.util.WebEventListener;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventlistener;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"H:\\Automation\\SIMS/src/main/java/com/tcs/sims/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception i) {
			i.printStackTrace();
		}
	}

	
	
	
	public static void initialization(String bname) {
		//if u r taking the browser option from config file then remove the argument from initialzation(string bname) method
		//String bname = prop.getProperty("browser");
		if (bname.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "G:\\SeleniumServer\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		} else if (bname.equals("FireFox")) {
			driver = new FirefoxDriver();

		}
		
		/*System.setProperty("phantomjs.binary.path", "G:\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		driver=new PhantomJSDriver();*/
		
		
		/*Capabilities caps = new DesiredCapabilities();
		((DesiredCapabilities) caps).setJavascriptEnabled(true);
		((DesiredCapabilities) caps).setCapability(
		PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"G:\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		driver = new PhantomJSDriver(caps);*/

	
		
		
		
		
		
		
		
		
		
		
		
		e_driver=new EventFiringWebDriver(driver);
		eventlistener=new WebEventListener();
		e_driver.register(eventlistener);
		driver=e_driver;
		
		
		//driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
public static void clickOnJS(WebDriver driver,WebElement locator,int timeOutInSeconds)
{
	new WebDriverWait(driver, timeOutInSeconds).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
}

public static void selectDateByJs(WebDriver driver,WebElement element,LocalDate date)
{
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("arguments[0].setAttribute('value','"+date+"');",element);
}

public static void selectDateByJsNew(WebDriver driver,WebElement element,String date)
{
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("arguments[0].setAttribute('value','"+date+"');",element);
}

}
