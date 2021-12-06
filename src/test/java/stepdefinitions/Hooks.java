package stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseclass.BaseClass_Cucumber;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass_Cucumber {

	@Before
	public void initialization() {

		chromeLaunch("http://adactinhotelapp.com/HotelAppBuild2/");
	}

	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			final byte[] screenshotAs = screenshot.getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotAs, "image/png");
		}
		driver.close();
	}

}
