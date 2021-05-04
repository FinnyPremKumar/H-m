package com.qa.testpages;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HmPages 
{
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/header/nav/ul[1]/li[1]/div/a[1]")
	WebElement signInBtn;
	public WebElement getSignInBtn()
	{
		return signInBtn;
	}
	@FindBy(xpath = "/html/body/div[16]/div")
	WebElement signinTab;
	
	public WebElement getSignInTab()
	{
		return signinTab;
	}
	@FindBy(id = "modal-txt-signin-email")
	WebElement email;
	
	public WebElement getEmail()
	{
		return email;
	}
	@FindBy(id = "modal-txt-signin-password")
	WebElement password;
	
	public WebElement getPassword()
	{
		return password;
	}
	
	@FindBy(name = "rememberMe")
	WebElement checkBox;
	
	public WebElement getCheckBox()
	{
		return checkBox;
	}
	
	@FindAll(@FindBy(xpath = "//button[contains(text(),'Sign in')]"))
	WebElement submitBtn;
	
	public WebElement getSubmitBtn()
	{
		return submitBtn;
	}
	@FindBy(xpath = "/html/body/header/nav/ul[1]/li[1]/div/div[2]/ul/li[3]/a")
	WebElement signOutbtn;
	
	public WebElement getSignOutBtn()
	{
		return signOutbtn;
	}
	
	@FindBy(xpath = "//header/nav[1]/ul[1]/li[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")
	WebElement membershipInfo;
	
	public WebElement getMembershipInfo()
	{
		return membershipInfo;
	}
	
	@FindBy(xpath = "//header/nav[1]/ul[1]/li[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")
	WebElement myAccount;
	
	public WebElement getMyAccount()
	{
		return myAccount;
	}
	
	@FindBy(xpath = "/html/body/header/nav/div[1]/section/form/input")
	WebElement mainSearch;
	
	public WebElement getMainSearch()
	{
		return mainSearch;
	}
	@FindBy(xpath = "/html/body/header/nav/div[1]/section/form/button")
	WebElement go;
	public WebElement getGo()
	{
		return go;
	}
	
	@FindAll(@FindBy(xpath = "//body[1]/main[1]/div[3]/div[1]/div[1]/ul[1]/li"))
	List<WebElement> listItems;
	
	public List<WebElement> getListItems()
	{
		return listItems;
	}
	
	@FindBy(xpath = "//span[contains(text(),'ADD')]")
	WebElement addToCart;
	
	public WebElement getAddToCart()
	{
		return addToCart;
	}
	
	@FindAll(@FindBy(xpath = "//body/main[@id='main-content']/div[3]/div[1]/div[1]/ul[1]/li/article[1]/div[2]/h3/a"))
	List<WebElement> titles;
	
	public List<WebElement> getTitles()
	{
		return titles;
	}
	@FindAll(@FindBy(xpath = "/html/body/main/div[3]/div/div[1]/ul/li/article/div[2]/strong/span"))
	List<WebElement> prices;
	public List<WebElement> getPrices()
	{
		return prices;
	}
	
	//Selecting Shoes and Accessories
	@FindBy(linkText = "View All")
	WebElement menAcc;
	
	public WebElement getAccessories()
	{
		return menAcc;
	}
	//Women
	@FindBy(xpath = "/html/body/header/nav/ul[2]/li[2]/a/span")
	WebElement womenCat;
	
	public WebElement getWomenCat()
	{
		return womenCat;
	}
	
	@FindBy(xpath = "/html/body/header/nav/ul[2]/li[2]/ul/li[2]/ul/li[2]/a")
	WebElement womenSubCat;
	public WebElement getWomenSubCat()
	{
		return womenSubCat;
	}
	//Men
	@FindBy(xpath = "/html/body/header/nav/ul[2]/li[3]/a/span")
	WebElement menCat;
	
	public WebElement getmenCat()
	{
		return menCat;
	}
	
	@FindBy(xpath = "/html/body/header/nav/ul[2]/li[3]/ul/li[5]/ul/li[15]/a")
	WebElement menSubCat;
	public WebElement getmenSubCat()
	{
		return menSubCat;
	}
	//Kids
	@FindBy(xpath = "/html/body/header/nav/ul[2]/li[4]/a/span")
	WebElement kidscat;
	
	public WebElement getKidsCat()
	{
		return kidscat;
	}

	@FindBy(xpath = "/html/body/header/nav/ul[2]/li[4]/ul/li[3]/ul/li[6]/a")
	WebElement kidsSubCat;
	public WebElement getKidsSubCat()
	{
		return kidsSubCat;
	}
	//Divided
	@FindBy(xpath = "/html/body/header/nav/ul[2]/li[5]/a/span")
	WebElement divcat;
	
	public WebElement getDivCat()
	{
		return divcat;
	}

	@FindBy(xpath = "/html/body/header/nav/ul[2]/li[5]/ul/li[4]/ul/li[4]/a")
	WebElement divSubCat;
	public WebElement getdivSubCat()
	{
		return divSubCat;
	}
	
	//Sale
	@FindBy(xpath = "/html/body/header/nav/ul[2]/li[6]/a/span")
	WebElement salecat;
	
	public WebElement getSaleCat()
	{
		return salecat;
	}

	@FindBy(xpath = "/html/body/header/nav/ul[2]/li[6]/ul/li[5]/ul/li[2]/a")
	WebElement saleSubCat;
	public WebElement getSaleSubCat()
	{
		return saleSubCat;
	}
	//Magazine
		@FindBy(xpath = "/html/body/header/nav/ul[2]/li[7]/a/span")
		WebElement magcat;
		
		public WebElement getMagCat()
		{
			return magcat;
		}	
	
	public HmPages(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
