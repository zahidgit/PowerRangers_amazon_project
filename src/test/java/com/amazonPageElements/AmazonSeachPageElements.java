package com.amazonPageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSeachPageElements {
	
	@FindBy(xpath="//*[@id='twotabsearchtextbox']")
			public WebElement search;
			
	@FindBy(xpath="//*[@id=\"nav-search-submit-button\"]")
	public WebElement SearchButton;
	
	@FindBy(xpath="//*[@id=\"nav-logo-sprites\"]")
	public WebElement Tpage;
	
			

}
