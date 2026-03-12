package com.ui.tests;

import static com.constants.Browser.CHROME;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ui.pages.HomePage;
import com.ui.pojo.User;

public class LoginTest {

	private HomePage hg;

	@BeforeMethod
	public void setup() {
		hg = new HomePage(CHROME);
	}

//	@Test(description = "Verifies with the valid user is able to login into the application", groups = {"e2e","sanity"},
//			dataProviderClass = com.ui.dataproviders.LoginDataProvider.class, dataProvider = "LoginTestDataProvider")
//	public void loginTest(User user) {
//
//		assertEquals(hg.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getAccountName(),
//				"Arshad Kapadi");
//
//	}
//	
//	
//	@Test(description = "Verifies with the valid user is able to login into the application", groups = {"e2e","sanity"},
//			dataProviderClass = com.ui.dataproviders.LoginDataProvider.class, dataProvider = "LoginTestCSVDataProvider")
//	public void loginCSVTest(User user) {
//
//		assertEquals(hg.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getAccountName(),
//				"Arshad Kapadi");
//
//	}
	
	
	@Test(description = "Verifies with the valid user is able to login into the application", groups = {"e2e","sanity"},
			dataProviderClass = com.ui.dataproviders.LoginDataProvider.class, dataProvider = "LoginTestExcelDataProvider")
	public void loginExcelTest(User user) {

		assertEquals(hg.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getAccountName(),
				"Arshad Kapadi");

	}

	@AfterMethod
	public void teardown() {
		hg.getDriver().quit();
	}

}
