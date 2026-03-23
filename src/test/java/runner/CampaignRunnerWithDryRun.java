package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"src\\test\\resources\\appfeatures\\Campaign.feature"},
		
		glue= {"steps"},
		
		plugin= {"pretty"},
		
		tags = "@campaigns",
		
		dryRun =true
		
		//publish =true                   // cucumber report will get in link form for 24hrs 
		
		)


public class CampaignRunnerWithDryRun extends AbstractTestNGCucumberTests{

}
