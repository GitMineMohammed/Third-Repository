package pom.adactin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass_Cucumber;

public class Cucumber_POM_Adactin_Booking_Confirmation extends BaseClass_Cucumber {

	public Cucumber_POM_Adactin_Booking_Confirmation() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton;

	@FindBy(id = "continue")
	private WebElement continueBooking;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinueBooking() {
		return continueBooking;
	}

	public void bookingConfirmationPage() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		buttonClick(getRadiobutton());
		buttonClick(getContinueBooking());

	}
}