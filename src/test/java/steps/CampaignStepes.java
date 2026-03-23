package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CampaignStepes {
	
	@Given("user should be at the campaign page")
	public void user_should_be_at_the_campaign_page() {
	    System.out.println("given statement");	
	    }
	
	@When("User click on the create campaign")
	public void user_click_on_the_create_campaign() {
	    System.out.println("clicked on create campaign");
	}
	@When("User enetrs the information")
	public void user_enetrs_the_information() {
	    System.out.println("inforemation entered");
	    }
	
	@When("Campaign should get created")
	public void campaign_should_get_created() {
	    System.out.println("campaign created");
	    }

	@When("User click on the shedule campaign")
	public void user_click_on_the_shedule_campaign() {
	    System.out.println("clicked on shedule campaign");
	}
	@When("User enetrs sheduled time")
	public void user_enetrs_sheduled_time() {
	    System.out.println("shedule time entered");
	}
	@When("Campaign should get sheduled")
	public void campaign_should_get_sheduled() {
	    System.out.println("campaign sheduled");
	}
	

@When("User click on the send campaign")
public void user_click_on_the_send_campaign() {
    System.out.println("clicked on send campaign");
}
@When("Campaign should see the sent count of email")
public void campaign_should_see_the_sent_count_of_email() {
    System.out.println("campaign see sent count of email");
}

	                   
	    

	  

}
