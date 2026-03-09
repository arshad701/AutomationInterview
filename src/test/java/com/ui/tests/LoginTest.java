package com.ui.tests;

import com.constants.Browser;
import com.ui.pages.HomePage;

public class LoginTest {

	public static void main(String[] args) {

		HomePage hg = new HomePage(Browser.EDGE);
		
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

		// driver.get("https://automationpractice.techwithjatin.com");

		//hg.goToUrl("https://automationpractice.techwithjatin.com");

		String accountName = hg.goToLoginPage().doLoginWith("xamasan125@keecs.com", "password").getAccountName();
		System.out.println(accountName);

		

	}

}
