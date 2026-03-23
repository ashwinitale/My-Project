package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDoubleTypeData {
	
	@Given("user at the signup page")
	public void user_at_the_signup_page() {
	    System.out.println("nav to signup page");	
	    }
	@When("user enters the name as username {string}")
	public void user_enters_the_name_as_username(String string) {
		System.out.println("entered username");
	    
	}
	@When("user clicks on the login {double} button")
	public void user_clicks_on_the_login_button(Double double1) {
	   	}
	@Then("user should get logged into applicationS")
	public void user_should_get_logged_into_application_s() {
	   
	}


}
