package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures\\LoginWithDoubleTypeData.feature"},
		
		glue={"steps"},
		
		plugin= {"pretty"}
		
		
		
		)


public class LoginWithDoubleTypeDataRunner extends AbstractTestNGCucumberTests{

}
