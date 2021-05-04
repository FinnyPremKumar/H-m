package com.qa.testscripts;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;

public class HmProject extends HmTestBase
{
	Actions act;
	
	@Test
	public void acceptCookies()
	{
		WebElement cookies=driver.findElement(By.xpath("/html/body/div[10]/div[3]/div/div/div[2]/div/div/button"));
		driver.switchTo().activeElement();
		cookies.click();
		Reporter.log("Cookies are accepted!! Ready to Sign in...");
	}
	
	@Test(priority = 1)
	public void failedLogin() throws InterruptedException
	{
		hp.getSignInBtn().click();
		Thread.sleep(1000);
		driver.switchTo().activeElement();
		hp.getEmail().clear();
		Thread.sleep(1000);
		hp.getPassword().clear();
		Thread.sleep(1000);
		hp.getEmail().sendKeys("ffgbfd234567i@gmail.com");
		hp.getPassword().sendKeys("123458369aaA");
		Thread.sleep(1000);
		hp.getPassword().submit();
		Reporter.log("The user should register with hm account or should enter valid email/ password", true);
		Thread.sleep(3000);
		
		driver.navigate().back();
		
	}
	
	@Test(priority = 2)
	public void login() throws InterruptedException
	{
		hp.getSignInBtn().click();
		Thread.sleep(1000);
		driver.switchTo().activeElement();
		hp.getEmail().clear();
		Thread.sleep(1000);
		hp.getPassword().clear();
		Thread.sleep(1000);
		hp.getEmail().sendKeys("finnydevarapalli@gmail.com");
		hp.getPassword().sendKeys("147258369aaA");
		Thread.sleep(1000);
		hp.getPassword().submit();
		
	}
	
	@Test(priority = 3)
	public void categories() throws InterruptedException
	{
		Actions act=new Actions(driver);
		act.clickAndHold(hp.getWomenCat());
		act.build().perform();
		Thread.sleep(2000);
		act.click(hp.getWomenSubCat());
		act.build().perform();		
		Thread.sleep(1000);
		
		act.clickAndHold(driver.findElement(By.xpath("/html/body/header/nav/ul[2]/li[3]/a/span")));
		act.build().perform();
		Thread.sleep(1000);
		act.click(driver.findElement(By.xpath("/html/body/header/nav/ul[2]/li[3]/ul/li[5]/ul/li[15]/a")));
		act.build().perform();
		Thread.sleep(3000);
		
		act.clickAndHold(driver.findElement(By.xpath("/html/body/header/nav/ul[2]/li[4]/a/span")));
		act.build().perform();
		Thread.sleep(1000);
		act.click(driver.findElement(By.xpath("/html/body/header/nav/ul[2]/li[4]/ul/li[3]/ul/li[6]/a")));
		act.build().perform();
		Thread.sleep(3000);
		
		act.clickAndHold(driver.findElement(By.xpath("/html/body/header/nav/ul[2]/li[5]/a/span")));
		act.build().perform();
		Thread.sleep(1000);
		act.click(driver.findElement(By.xpath("/html/body/header/nav/ul[2]/li[5]/ul/li[4]/ul/li[4]/a")));
		act.build().perform();
		Thread.sleep(3000);
		
		act.clickAndHold(driver.findElement(By.xpath("/html/body/header/nav/ul[2]/li[6]/a/span")));
		act.build().perform();
		act.click(driver.findElement(By.xpath("/html/body/header/nav/ul[2]/li[6]/ul/li[5]/ul/li[2]/a")));
		act.build().perform();
		Thread.sleep(3000);
		
		act.click(driver.findElement(By.xpath("/html/body/header/nav/ul[2]/li[7]/a/span")));
		act.build().perform();
		Thread.sleep(1000);
		
		
	}
	
	
	
	@Test(dataProvider = "getData", priority = 4)
	public void searchgItems(String input) throws InterruptedException
	{
		hp.getMainSearch().clear();
		hp.getMainSearch().sendKeys(input);
		hp.getGo().click();
		Thread.sleep(5000);
		
		//Getting Titles
		System.out.println("Total "+hp.getListItems().size()+" "+input+" are found in this page");
		
		for(int i=0;i<hp.getTitles().size();i++)
		{
			System.out.print(hp.getTitles().get(i).getText()+" \t");
			System.out.println(hp.getPrices().get(i).getText());	
		}
		
		
		hp.getListItems().get(3).click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,90)");
		Thread.sleep(1000);
		//Selecting Size
		driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div[1]/div[1]/div/div[3]/div[1]/div/button")).click();
		driver.switchTo().activeElement();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div[1]/div[1]/div/div[3]/div[1]/div/ul/li[2]/div/button/span")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div[1]/div[1]/div/div[3]/div[1]/button/span")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-90)");
		
		Reporter.log("Navigating back", true);
		driver.navigate().back();
		Thread.sleep(1000);
		System.out.print("\n\n\n\n\n\n");
	}
	
	@Test(priority = 5)
	public void shoppingBag() throws InterruptedException
	{
		Reporter.log("The user is checking Bag", true);
		driver.findElement(By.xpath("/html/body/header/nav/ul[1]/li[4]/span/a")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority = 6)
	public void logOut() throws InterruptedException
	{
		act=new Actions(driver);
		act.clickAndHold(driver.findElement(By.xpath("/html/body/header/nav/ul[1]/li[1]/div/a[2]")));
		act.build().perform();
		Thread.sleep(3000);
		act.click(driver.findElement(By.xpath("/html/body/header/nav/ul[1]/li[1]/div/div[2]/ul/li[3]/a")));
		act.build().perform();
		Reporter.log("Signing Out", true);
	}
	
	@DataProvider
	public String[][] getData() throws IOException
	{
		String xlPath="S:\\Virtusa\\LP_Training_Project_Docs\\ProjectHM\\src\\test\\java\\com\\qa\\testdata\\TestData.xlsx";
		String xlSheet="Sheet2";
		
		int rowCount=ExcelUtility.getRowCount(xlPath, xlSheet);
		int cellCount=ExcelUtility.getCellCount(xlPath, xlSheet, rowCount);
		String[][] data=new String[rowCount][cellCount];
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=0;j<cellCount;j++)
			{
				data[i-1][j]=ExcelUtility.getCellData(xlPath, xlSheet, i, j);
			}
		}
		return data;
	}
}