package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;

public class RgistrationSteps {
	
	@Given("User is at accounts page")
	public void user_is_at_accounts_page() {
	    System.out.println("Given statement");
	}
	@When("user enters the following data")
	public void user_enters_the_following_data(DataTable dataTable) {
	             List<List<String>> data = dataTable.asLists();
	             List<String> FirstList=data.get(0);
	             System.out.println(FirstList);
	             String emailAddress = FirstList.get(2);
	             System.out.println("email address is : "+emailAddress);
	             String phoneNumber = data.get(1).get(3);
	             System.out.println("phone number is : "+phoneNumber);
	             System.out.println("printing all values from 0th list");
	             
	             for(String value:FirstList)
	             {
	            	 System.out.println(value);
	             }
	             
	               long phoneInLong = Long.parseLong(phoneNumber);
	               System.out.println(phoneInLong);
	            System.out.println("************************************");   
	                   
	            List<Map<String, String>> mapData = dataTable.asMaps();
	             Map<String, String> firtlist = mapData.get(0);
	             System.out.println(firtlist);
	             String emailValueOf0thList = firtlist.get("Email");
	             System.out.println(emailValueOf0thList);
	             Map<String, String> secondList = mapData.get(1);
	            System.out.println(secondList);
	            String phoneOfSecondList = secondList.get("Phone");
	            System.out.println(phoneOfSecondList);
	}
	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		System.out.println("click on submit button");
	   
	}
	@Then("user should get confirmation")
	public void user_should_get_confirmation() {
		System.out.println("application submitted!!");
	    	}


}
