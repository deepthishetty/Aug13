package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

public class Jen {
	@Test
	public void login()
	{
	
	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.gmail.com");
	System.out.println("hi");
	ExtentReports e=new ExtentReports("./ExtentReport.html");
e.startTest("test1");
	
	}
}
