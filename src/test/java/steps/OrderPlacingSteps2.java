package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderPlacingSteps2  {

	PlacingOrderSteps pos;
	
	//Using Constructor(datatype=PlacingOrderSteps, variable=pos)
	//here orderplacing class fetching data from PlacingOrderSteps class
	//so we take (PlacingOrderSteps) as a parameter 
	
	public OrderPlacingSteps2(PlacingOrderSteps pos)
	{
		this.pos=pos;
	}
	
	@When("I click on place order1")
	public void i_click_on_place_order() {
		  System.out.println("clicked on place order");
		  //PlacingOrderSteps pos=new PlacingOrderSteps();
		  System.out.println("product ID is :"+pos.getProductID());
	}
	@Then("order should get placed1")
	public void order_should_get_placed() {
		  System.out.println("order validated");
	}

}
