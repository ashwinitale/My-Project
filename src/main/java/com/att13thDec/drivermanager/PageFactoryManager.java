package com.att13thDec.drivermanager;

import org.openqa.selenium.WebDriver;

import com.att13thDec.pages.HomePage;
import com.att13thDec.pages.SearchPage;

public class PageFactoryManager 
         {
	
	HomePage homePage;
	SearchPage searchPage;
	
            public HomePage getHomePageObject(WebDriver driver)
            {
            	if(homePage==null)
            	{
					return homePage=new HomePage(driver);        
            	}
            	else
            	{
            		return homePage;
            	}
            }
            
            
           public SearchPage getSearchPageObject(WebDriver driver)
           {
        	   if(searchPage==null)
        	   {
				return searchPage = new SearchPage(driver);
        	   }
        	   else
        	   {
        		   return searchPage;
        	   }
           }
            
            
         
          }
