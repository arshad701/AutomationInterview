package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public final class LoginPage extends BrowserUtility {
	
	public LoginPage(WebDriver driver) {
	    super(driver);
	}
	
	
	final static By EMAIL_ID_LOCATOR = By.id("email");
	final static By PASSWORD_LOCATOR = By.id("passwd");
	final static By SIGN_IN_BUTTON_lOCATOR = By.xpath("//button[@id=\"SubmitLogin\"]/span");
	
	
	
	public MyAccountsPage doLoginWith(String Email,String Password) {
		sendKeyToElements(EMAIL_ID_LOCATOR, Email);
		sendKeyToElements(PASSWORD_LOCATOR, Password);
		clickOnElement(SIGN_IN_BUTTON_lOCATOR);
		MyAccountsPage ma = new MyAccountsPage(getDriver());
		return ma;
		
	}

	

}
