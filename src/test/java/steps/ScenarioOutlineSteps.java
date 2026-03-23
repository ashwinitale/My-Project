package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	
	@Given("user is at signup page")
	public void user_is_at_signup_page()
	{
	    System.out.println("Nav to signup page");
	}
	
	@When("user enters name as {string} on thr form")
	public void user_enters_name_as_on_thr_form(String name) 
	{
	    System.out.println("entered name is "+name);
	}
	
	@When("user select gender as {string}")
	public void user_select_gender_as(String string) {
	    System.out.println("selected gender is "+"string");
	}
	@When("user select the slotnumber {int}")
	public void user_select_the_slotnumber(Integer int1) {
	   System.out.println("selected slotnumber is "+int1);
	}
	@Then("user gets created")
	public void user_gets_created() {
	   System.out.println("user creation validated!!");
	}

	

}
