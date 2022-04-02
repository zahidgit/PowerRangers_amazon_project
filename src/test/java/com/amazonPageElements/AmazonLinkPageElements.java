package com.amazonPageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonLinkPageElements {
	
	@FindBy(xpath="//*[@id=\"nav-xshop\"]/a[3]")
	public WebElement outlet;
	
	@FindBy(xpath="//*[@id=\"nav-subnav\"]/a[1]/span")
	public WebElement TDeals;
	
	@FindBy(xpath="//*[@id=\"slot-2\"]/div/h1")
	public WebElement allDeal;

}
