package com.att13thDec.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
	
	private WebDriver driver;
	
	@FindBy(xpath="//a[@id='nav-cart']")
	private WebElement cartIcon;
	
	@FindBy(xpath="//img[@alt='Daily essentials']")
	private WebElement dealsSection;
	
	@FindBy(xpath="//span[text()='Beauty']")
	private WebElement chargerText;
	
	public HomePage(WebDriver driver) 
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public String getTitleOfPage()
	{
     	String Title = driver.getTitle();
     	return Title;
	}
	
	public boolean isCartIconDisplyes()
	{
		boolean isDisplying = cartIcon.isDisplayed();
		return isDisplying;
	}
	
	
	public void CheckoutDealsSection()
	{
		WebElement element =waitForVisibilityOfElement(dealsSection);
	       JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("arguments[0].click();", element);
	}

	public boolean validateTextOnDealPage()
	{
		WebElement element =waitForVisibilityOfElement(chargerText);
		boolean isDisplying = element.isDisplayed();
		return isDisplying;
		
	}

	
	
}
