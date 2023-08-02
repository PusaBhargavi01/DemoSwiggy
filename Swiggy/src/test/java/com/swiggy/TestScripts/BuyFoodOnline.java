package com.swiggy.TestScripts;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyFoodOnline extends Driver{

 
	@Given("user enters the landing page")
	public void user_enters_the_landing_page() {
		
	}

	@When("he enters location as hyderabad and selects the first option from dropdown")
	public void he_enters_location_as_hyderabad_and_selects_the_first_option_from_dropdown()throws InterruptedException {
		
		landingPage.enterlocationname("Hyderabad");
	}

	@When("he clicks first restaurant shown under Top restaurant chains in Hyderabad")
	public void he_clicks_first_restaurant_shown_under_top_restaurant_chains_in_hyderabad() {
	  
	   restaurantsPage.clickrestaurant();
	}

	@When("he Clicks on Add button corresponding to first listed dish.")
	public void he_clicks_on_add_button_corresponding_to_first_listed_dish() {
		 
		   restaurantsPage.firstdish();
	}

	@When("he Hover over Cart in the top right corner.")
	public void he_hover_over_cart_in_the_top_right_corner() {
		
		 restaurantsPage.Cart();
	}

	@When("he clciks on Check Out in the sub-menu")
	public void he_clciks_on_check_out_in_the_sub_menu() {
		
		restaurantsPage.checkOut();
	}

	@Then("he verify the text-{string}")
	public void he_verify_the_text(String string) {
	
		 String expectedErrMsg = string;
		    String actualErrMsg = restaurantsPage.getMsg();
		    Assert.assertEquals(actualErrMsg, expectedErrMsg);
	}

}
