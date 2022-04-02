package com.amazonPageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.amazoUtilities.SetupDriver;
import com.amazonPageElements.AmazonSeachPageElements;

public class AmazonSearchPageActions {
	
	AmazonSeachPageElements pageElements;
	
	
	public  AmazonSearchPageActions() {
		pageElements=new AmazonSeachPageElements ();
		PageFactory.initElements(SetupDriver.driver, pageElements);
	}
	
	public void getAmazonSearchPage() {
		SetupDriver.driver.get("https://www.amazon.com/");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}
	
	public void enterSearch() {
		System.out.println("Passing search item");
		pageElements.search.sendKeys("T-shirt");
		
	}
	
	public void searchbutton() {
		System.out.println("clicking on search button");
		pageElements.SearchButton.click();
	}
	
	public boolean errorMessage() {
		boolean bool=false;
		String errorMsg=pageElements.Tpage.getText();
		if(errorMsg.contains("Amazon")){
			bool=true;
		}
		return bool;
				
	}

}
