package com.att13thDec.uiappfeatures;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			
			features = {"src\\test\\resources\\uiappfeatures"},
			glue = {"com.att13thDec.uiappfeatures"},
			plugin = {"pretty", "html:target/cucumberreport/report.html"},
			publish= true
			//tags = "@sanity"
			
			)

	public class AmazonTestRunner extends AbstractTestNGCucumberTests{


	}

