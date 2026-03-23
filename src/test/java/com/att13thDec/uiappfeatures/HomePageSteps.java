package com.att13thDec.uiappfeatures;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.att13thDec.drivermanager.DriverFactory;
import com.att13thDec.drivermanager.PageFactoryManager;
import com.att13thDec.pages.HomePage;

import Utility.ReadProperty;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

	HomePage homePageObject ;
      public HomePageSteps() 
      {
    	   homePageObject = new PageFactoryManager().getHomePageObject(DriverFactory.getDriver());
      }
       @Given("user is at landing page")
       public void user_is_at_landing_page() throws InterruptedException, IOException
       {
    	   WebDriver driver = DriverFactory.getDriver();
    		  
    		  driver.get(ReadProperty.getPropData("testsiteurl"));
    		  
    		  Thread.sleep(1000);
    			driver.navigate().refresh();
        }
       
        @Then("cart icon should displayed")
         public void cart_icon_should_displayed()
        {
        	boolean isDisplyed = homePageObject.isCartIconDisplyes();
        	Assert.assertEquals(isDisplyed, true);
        }
                	  
          @When("user click on deals")
          public void user_click_on_deals()
          {
        	  homePageObject.CheckoutDealsSection();
            }
          @Then("user should redirect to deal page")
          public void user_should_redirect_to_deal_page()
          {
        	  boolean isDisplyed = homePageObject.validateTextOnDealPage();
        	  Assert.assertEquals(isDisplyed, true);
          }
          
          @Then("page title should conatain {string}")
          public void page_title_should_conatain(String string) 
         {
        	 String title = homePageObject.getTitleOfPage();

        	 boolean isPresent = title.contains(string);
        	 
        	 Assert.assertEquals(isPresent, true);

         }

    }
