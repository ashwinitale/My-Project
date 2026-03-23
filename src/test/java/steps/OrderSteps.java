package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderSteps {

	@Given("User is at orders page")
	public void user_is_at_orders_page() {
	   System.out.println("nav to order page");
	}
	@When("User click on order button")
	public void user_click_on_order_button() {
		System.out.println("clicked on order button");
	}
	@When("User click on current order")
	public void user_click_on_current_order() {
		System.out.println("clicked on CURRENT order");
	}
	@Then("User should see current order details")
	public void user_should_see_current_order_details() {
		System.out.println("CURRENT order details displyed");
	}
	
	@When("User click on order history")
	public void user_click_on_order_history() {
		System.out.println("clicked on order HISTORY");
		}
	@Then("User should see previous order details")
	public void user_should_see_previous_order_details() {
		System.out.println("previous order details displyed");
	}

	@When("User click on cancel order button")
	public void user_click_on_cancel_order_button() {
		System.out.println("clicked on CANCELLED order");
	}
	@Then("User should see cancelled order details")
	public void user_should_see_cancelled_order_details() {
		System.out.println("cancelled order deatils displyed");
		}
}
