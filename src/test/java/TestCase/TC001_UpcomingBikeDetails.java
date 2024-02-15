package TestCase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.UpcomingBikes;
import TestBase.BaseClass;

public class TC001_UpcomingBikeDetails extends BaseClass {

	@Test(priority = 1)
	public void clickNewBikes() throws InterruptedException {
		logger.info("**** Starting TC_002_UpcomingBike ****");
		try {
			logger.info("clicking on  New Bikes ");
			// Navigate to Zigwheels page
			HomePage hp = new HomePage(driver);
			// click on new bikes
			hp.clickNewBikes();
			// Click on upcoming bikes under new bikes
			hp.selectUpcomingBikes();
		} catch (Exception e) {
			logger.info("Failed to click New Bikes");
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test(priority = 2, dependsOnMethods = { "clickNewBikes" })
	public void clickUpcomingBikes() {
		try {
			logger.info("clicking on Upcoming Bikes");
			UpcomingBikes upcomingBike = new UpcomingBikes(driver);
			// Click on Manufacturer
			upcomingBike.clickManufacturer();
			
			// Click on the view more bikes button
			upcomingBike.clickViewMoreButton();
			
			// Displaying the details of the bikes
			upcomingBike.bikeDetails();
		} catch (Exception e) {
			logger.info("Failed to click upcoming bikes");
			e.printStackTrace();
			Assert.fail();
		}
		logger.info("**** Finished TC_002_UpcomingBike ****");
	}

}
