package com.amazonPageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.amazoUtilities.SetupDriver;
import com.amazonPageElements.AmazonLinkPageElements;

public class AmazonLinkPageActions {
	
	AmazonLinkPageElements pageElement;
	
	public  AmazonLinkPageActions() {
		pageElement=new AmazonLinkPageElements ();
		PageFactory.initElements(SetupDriver.driver, pageElement);
	}
	
	public void getAmazonlinkPage() {
		SetupDriver.driver.get("https://www.amazon.com/");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}
	
	public void AmazonOutlet() {
		System.out.println(" clickinf gon amazon outlet button");
		pageElement.outlet.click();
	}
	
	public void AmaznTodayDeals() {
		System.out.println(" clickinf gon amazon todays deal button");
		pageElement.TDeals.click();;
	}
	
	public boolean verifypage() {
		System.out.println(" Verifying the todays deal page");
		
		boolean bool=false;
		String errorMsg=pageElement.allDeal.getText();
		if(errorMsg.contains("Today's Deals")) {
			bool=true;
		}
		return bool;
		
		
	}
	

}
