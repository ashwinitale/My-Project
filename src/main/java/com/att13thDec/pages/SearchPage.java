package com.att13thDec.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage{

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchtTextBox;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement searchButton;

	@FindBy(xpath="//*[@role='listitem']//*[contains(text(),'Redmi A4 5G (Starry Black')]")
	private WebElement mobileResult;

	
	public SearchPage(WebDriver driver)
	{
	        
		super(driver);
		this.driver=driver;		
		PageFactory.initElements(driver, this);
	        
	        
	}
	
	public void productSearched(String productToBeSearched)
	{
		clearAndSendkeys(searchtTextBox, productToBeSearched);
		click(searchButton);
	}
	
	public boolean isMobilePhoneDisplyed()
	{
		
		waitForVisibilityOfElement(mobileResult);
		 boolean isDisplaying = mobileResult.isDisplayed();
		 return isDisplaying;
		
	}
	
	
}

