package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {
	
	
	@Given("I have logged into the app")
	public void loginToapp()
	{
		System.out.println("login intiated");
	}
	
	@Given("I am at home page")
	public void navToApp()
	{
		System.out.println("navigated to home page");
	}
	
	@Given("I click on add profile button")
	public void clickOnProfile()
	{
		System.out.println("clicked on add profile button");
	}
	
	@Given("I enter the data")
	public void enteringData()
	{
		System.out.println("entered data");
	}
	
	@Then("Profile should get added")
	public void validateProfile()
	{
		System.out.println("profile added");
	}
	
	@When("I click on edit profile button")
	public void i_click_on_edit_profile_button() {
		System.out.println("Clicked on edit button");
	}

	@When("I modify the data")
	public void i_modify_the_data() {
	System.out.println("data modified");
	}

	@Then("Profile should get updated")
	public void profile_should_get_updated() {
		System.out.println("Profile updated!!");
	}

	@When("I click on delete profile button")
	public void i_click_on_delete_profile_button() {
		System.out.println("clicked on delete button");
	}

	@Then("Profile should get deleted")
	public void profile_should_get_deleted() {
		System.out.println("Profile deleted");
	}

	
	
}
