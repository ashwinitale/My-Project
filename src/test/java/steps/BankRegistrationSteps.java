package steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class BankRegistrationSteps {
	
	@Given("User is at the accounts page")
	public void user_is_at_the_accounts_page() {
	    System.out.println("opening account page");
	}
	@When("User enters the following data")
	public void user_enters_the_following_data(DataTable dataTable) {
		
	List<List<String>> data = dataTable.asLists();
		
	    List<String> firstList = data.get(1);
	    System.out.println(firstList);
	   String ValueOfLastName = firstList.get(0);
	   System.out.println("Last name is : "+ValueOfLastName);
	   System.out.println("*************************************************************");
	   
	   List<Map<String, String>> mp = dataTable.asMaps();
	Map<String, String> secondLists = mp.get(1);
	System.out.println(secondLists);
	String emailAdress = secondLists.get("Email");
	System.out.println(emailAdress);
	
	}
	@When("User click on the submit button")
	public void user_click_on_the_submit_button() {
	    System.out.println("clicked on the submit button");
	}
	@Then("User should get confirmation")
	public void user_should_get_confirmation() {
	    System.out.println("application successfully submitted");
	}

}
