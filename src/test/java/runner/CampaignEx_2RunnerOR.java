package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"src\\test\\resources\\appfeatures\\CampaignEx_2.feature"},
		
		glue= {"steps"},
		
		plugin= {"pretty"},
		
		tags="@sanity or @functional"
		
		
		)

public class CampaignEx_2RunnerOR extends AbstractTestNGCucumberTests {

}

