package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlacingOrderSteps {

	String productID;
	
	@Given("I should be at the product page")
	public void i_should_be_at_the_product_page() {
	    System.out.println("Given statement");
	}
	@When("I click on aad to cart button")
	public void i_click_on_aad_to_button() {
	   System.out.println("clicked on add to cart");
	     productID = "abs2520xtz1230avt"; 
	     System.out.println("created product id is :"+productID);
	}
	@Then("product should get added to cart")
	public void product_should_get_added_to_cart() {
	    System.out.println("product addition validated");
	}
	
	public String getProductID()
	{
		return productID;
	}
	
}
