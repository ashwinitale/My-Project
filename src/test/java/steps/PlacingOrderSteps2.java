package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlacingOrderSteps2 {

	String productID;
    static String timeValue;
	
	@Given("I should be at the product page1")
	public void i_should_be_at_the_product_page() {
	    System.out.println("Given statement");
	}
	@When("I click on aad to cart button1")
	public void i_click_on_aad_to_button() {
	   System.out.println("clicked on add to cart");
	     productID = "abs2520xtz1230avt"; 
	     System.out.println("created product id is :"+productID);
	     
	      timeValue = "01-Jan-2026:07:37:42";
	}
	@Then("product should get added to cart1")
	public void product_should_get_added_to_cart() {
	    System.out.println("product addition validated");
	}
	
	public String getProductID()
	{
		return productID;
	}
	
	@Given("product is already added to cart")
	public void product_is_already_added_to_cart() {
	    System.out.println("Given for 2nd scenario");
	}
	@When("I place the order")
	public void i_place_the_order() {
	    System.out.println("order placing...");
	}
	@Then("order confirmation message should displyed")
	public void order_confirmation_message_should_displyed() {
	    System.out.println("order confirmation message validated with ID :"+productID);
	   
	    System.out.println("captured timevalue is :"+timeValue);
	}

	
}
