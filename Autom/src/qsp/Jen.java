package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Jen {
	@Test
	public void login()
	{
	
	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.gmail.com");
	
	}
}
