package com.qa.testscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.testpages.HmPages;

public class HmTestBase 
{
	WebDriver driver;
	HmPages hp;
	JavascriptExecutor js;
	@Parameters({"Browser","Url"})
	@BeforeClass
	public void setUp(String Browser,String Url)
	{
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "S:\\\\Virtusa\\\\Softwares\\\\Drivers\\\\chromedriver_win32_2\\\\chromedriver.exe");
			driver=new ChromeDriver();
			js=(JavascriptExecutor) driver;
			driver.manage().window().maximize();
		}
		if(Browser.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "S:\\Virtusa\\Softwares\\Drivers\\edgedriver_win64_2\\msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
		}
		hp=new HmPages(driver);
		driver.get(Url);
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
