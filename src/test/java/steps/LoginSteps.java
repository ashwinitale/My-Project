

package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
	
	@Given("I am at the login page")
	public void i_am_at_the_login_page() {
	    System.out.println("login initiated");
	}
	@When("I enter the ussername")
	public void i_enter_the_ussername() {
	    System.out.println("entered username");
	}

	@When("I enter password")
	public void enteringPwd()
	{
		System.out.println("entered password");
	}
	
	@When("I click on login button")
	public void submit()
	{
		System.out.println("clilked on login");
	}
	

		@Then("I should be able to login")
	public void i_should_be_able_to_login() {
			System.out.println("login validated!!");
	}
	
	
		
	
}
