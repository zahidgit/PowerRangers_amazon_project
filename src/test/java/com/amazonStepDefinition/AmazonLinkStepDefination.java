package com.amazonStepDefinition;

import com.amazonPageAction.AmazonLinkPageActions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonLinkStepDefination {
	AmazonLinkPageActions actions=new AmazonLinkPageActions();
	
	@Given("user is in the amazon homepage")
	public void user_is_in_the_amazon_homepage() {
		actions.getAmazonlinkPage();
		
	}

	@When("user click on AmazonOutLet")
	public void user_click_on_AmazonOutLet() {
		actions.AmazonOutlet();
	    
	}

	@When("click on Todays Deal")
	public void click_on_Todays_Deal() {
		actions.AmaznTodayDeals();
	   
	}

	@Then("user should able to see all the todays deal")
	public void user_should_able_to_see_all_the_todays_deal() {
		actions.verifypage();
	   
	}


}
