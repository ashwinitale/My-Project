package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"src\\test\\resources\\appfeatures\\OrderConfirmationEx2.feature"},
		
		glue= {"steps"},
		
		plugin= {"pretty"}
		
		)
public class PlacingConfirmationRunner2 extends AbstractTestNGCucumberTests {

}
