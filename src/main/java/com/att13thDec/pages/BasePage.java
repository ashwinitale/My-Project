package com.att13thDec.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	WebDriver driver;
	WebDriverWait  wait;
	
	public BasePage(WebDriver driver)
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public WebElement waitForVisibilityOfElement(WebElement element)
	{
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(element));
		
		return ele;
	}
	
	public WebElement waitForElementToBeClickable(WebElement element)
	{
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void click(WebElement ele)
	{
		waitForElementToBeClickable(ele).click();
	}
	
	public void clearAndSendkeys(WebElement element, String textToBeTyped)
	{
		element=waitForVisibilityOfElement(element);
		element.clear();
		element.sendKeys(textToBeTyped);
	}
}
