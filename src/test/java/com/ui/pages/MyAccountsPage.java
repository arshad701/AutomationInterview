package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public final class MyAccountsPage extends BrowserUtility{
	
	public MyAccountsPage(WebDriver driver) {
	    super(driver);
	}

private static final By accountName = By.xpath("//a[@title=\"View my customer account\"]/span");
	
	
	public String getAccountName() {
		
		
		return getVisibleText(accountName);
	}

	
	
	
}
