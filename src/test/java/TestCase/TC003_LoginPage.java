package TestCase;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.LoginSignupPage;
import TestBase.BaseClass;

public class TC003_LoginPage extends BaseClass {

	@Test
	public void verifyLoginPage() {
		logger.info("**** Starting TC_004_LoginSignup ****");
		try {
			logger.info("Verifying login/SignUp");
			LoginSignupPage loginSignupPage = new LoginSignupPage(driver);
			
			// click on the Zigwheels link to navigate back
			loginSignupPage.clickZigwheels();
			
			// Click on the Login/Signup button
			loginSignupPage.clickLoginSignUp();
			// Taking screenshot
			screenshot("LoginSignUpCard");
			
			// Select the google button
			loginSignupPage.selectGoogleButton();
		} catch (Exception e) {
			logger.info("Verifying login/SignUp failed!!");
			e.printStackTrace();
			Assert.fail();
		}
		logger.info("**** Finished TC_004_LoginSignup ****");
	}
}
