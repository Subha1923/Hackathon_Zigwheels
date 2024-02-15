package TestCase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.UpcomingBikes;
import PageObject.UsedCars;
import PageObject.HomePage;
import TestBase.BaseClass;


public class TC002_UsedCarsDetails extends BaseClass {
	
	@Test
	public void UsedCarDetails() throws InterruptedException, IOException {

		try {
			logger.info("clicking on  Used Cars and selecting Chennai");
			UsedCars usedCar = new UsedCars(driver);
			
			//Hover and select used cars
			usedCar.selectUsedCars();
			
			//Click on the selected car
			usedCar.clickSelectedCar();

			//Click on the popular models
			usedCar.clickPopularModels();
		} catch (Exception e) {
			logger.info("Failed to click used cars!!!");
			e.printStackTrace();
			Assert.fail();
		}
		logger.info("**** Finished TC_003_UsedCar ****");
	}
}
