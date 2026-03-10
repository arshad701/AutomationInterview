package com.ui.pages;

import org.openqa.selenium.By;

import com.constants.Browser;
import static com.constants.Env.*;
import com.utility.BrowserUtility;
import com.utility.JsonUtility;

import static com.utility.PropertiesUtility.*;

public final class HomePage extends BrowserUtility {

	public HomePage(Browser browserName) {
		super(browserName);
		goToUrl(JsonUtility.readJSON(QA));

	}

	private static By SIGN_IN_LOCATOR = By.xpath("//a[contains(text(),\"Sign\")]");

	public LoginPage goToLoginPage() {
		clickOnElement(SIGN_IN_LOCATOR);
		LoginPage lp = new LoginPage(getDriver());
		return lp;

	}

}
