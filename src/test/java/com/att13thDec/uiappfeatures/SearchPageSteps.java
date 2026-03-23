package com.att13thDec.uiappfeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.att13thDec.drivermanager.DriverFactory;
import com.att13thDec.drivermanager.PageFactoryManager;
import com.att13thDec.pages.SearchPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPageSteps {

	WebDriver driver;
	SearchPage searchPageObject;
	public SearchPageSteps()
	{
		 searchPageObject = new PageFactoryManager().getSearchPageObject(DriverFactory.getDriver());
	}
	
	@When("user search the {string} in text field")
	public void user_search_the_in_text_field(String string)
	{
		searchPageObject.productSearched(string);
		
	    	}
	
	@Then("mobile search results should displayed")
	public void mobile_search_results_should_displayed()
	{
		boolean isDisplying = searchPageObject.isMobilePhoneDisplyed();
		Assert.assertEquals(isDisplying, true);
	}
}
