package com.att13thDec.uiappfeatures;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.att13thDec.drivermanager.DriverFactory;

import Utility.ReadProperty;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public class ApplicationHooks {
	//static WebDriver driver;
	@BeforeAll
	public static void LaunchBrowser() throws IOException
	{
		DriverFactory df= new DriverFactory();
		
		String browserName = ReadProperty.getPropData("browser");
	
		String browserFromCommandPrompt = System.getProperty("cliBrowser");
		
		System.out.println(browserFromCommandPrompt);
				
		if(browserFromCommandPrompt !=null)
		{
			browserName = browserFromCommandPrompt;
		}
		
		String envName = System.getProperty("env");
		
		System.out.println(envName);
		
		WebDriver driver = df.initBrowser(browserName);
		
		

		driver.manage().window().maximize();
		
	}
        @After
		public void tearDown(Scenario scenario )
		{
			Status statusOfScenario = scenario.getStatus();
			System.out.println(statusOfScenario);
			
			boolean isScenarioFailed = scenario.isFailed();
			if(isScenarioFailed)
			{
			TakesScreenshot ts = (TakesScreenshot)DriverFactory.getDriver();
			byte[] source = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(source, "image/png", scenario.getName());		
			}
	}
			@AfterAll
			public static void quitBrowser()
			{
				DriverFactory.getDriver().quit();
}
}