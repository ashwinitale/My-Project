package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"src\\test\\resources\\appfeatures\\Campaign.feature"},
		
		glue= {"steps"},
		
		plugin= {"pretty"},
		
		tags="not(@functional or @regression)"
		
		
		)

public class CampaignRunnerNotOR extends AbstractTestNGCucumberTests {

}
