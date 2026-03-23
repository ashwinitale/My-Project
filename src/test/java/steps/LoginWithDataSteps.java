package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataSteps {
	
	@Given("User should be at the login page")
	public void user_should_be_at_the_login_page()
	{
	    System.out.println("Nav to Login");
	}
	
	@When("User enters the username as {string}")
	public void user_enters_the_username_as(String username)
	{
	    System.out.println("(\"Received username value is :\"+username");	
	}
	
	@When("user enters the password as {string}")
	public void user_enters_the_password_as(String pwd)
	{
	   System.out.println("Received password value is : "+pwd);
	}
	
	@When("user clicks on login {int} button")
	public void user_clicks_on_login_button(Integer value)
	{
	    System.out.println("Clicked on login button with value : " +value);
	}
	
	@Then("user should get logged into application")
	public void user_should_get_logged_into_application()
	{
	    System.out.println("Login validated!!");
	}

}
