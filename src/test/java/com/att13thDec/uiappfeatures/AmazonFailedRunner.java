package com.att13thDec.uiappfeatures;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		
		//features = {"src\\test\\resources\\uiappfeatures"},
		features = {"@target/failedrun.txt"},
		
		glue = {"com.att13thDec.uiappfeatures"},
		plugin = {"pretty", "html:target/cucumberreport/report.html",
				   "rerun:target/failedrun.txt"},
		
		publish= true
		//tags = "@sanity"
		
		)

public class AmazonFailedRunner extends AbstractTestNGCucumberTests{


}



