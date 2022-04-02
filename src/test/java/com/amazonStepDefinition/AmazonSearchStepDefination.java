package com.amazonStepDefinition;

import com.amazonPageAction.AmazonSearchPageActions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSearchStepDefination {
	AmazonSearchPageActions actions=new AmazonSearchPageActions ();
	
	@Given("user is on the amazon home page")
	public void user_is_on_the_amazon_home_page() {
		actions.getAmazonSearchPage();
	    
	}

	@When("user enter {string} on the search box")
	public void user_enter_on_the_search_box(String string) {
	    actions.enterSearch();
	}

	@When("click on search box")
	public void click_on_search_box() {
	    actions.searchbutton();
	}

	@Then("user should able to go to T-shirt page")
	public void user_should_able_to_go_to_T_shirt_page() {
	    actions.errorMessage();
	}




}
