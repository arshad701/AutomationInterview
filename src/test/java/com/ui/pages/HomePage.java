package com.ui.pages;

import org.openqa.selenium.By;

import com.constants.Browser;
import com.utility.BrowserUtility;

public final class HomePage extends BrowserUtility {

	public HomePage(Browser browserName) {
		super(browserName);
		goToUrl("https://automationpractice.techwithjatin.com");

	}

	private static By SIGN_IN_LOCATOR = By.xpath("//a[contains(text(),\"Sign\")]");

	public LoginPage goToLoginPage() {
		clickOnElement(SIGN_IN_LOCATOR);
		LoginPage lp = new LoginPage(getDriver());
		return lp;

	}

}
