package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass_Cucumber;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pom.adactin.Cucumber_POM_Adactin_Login;

public class Step_Definition_Adactin extends BaseClass_Cucumber {

	@Given("User should be in login page")
	public void user_should_be_in_login_page() {

		WebElement txtWelcome = locatorBy("text", "//*[text()='Welcome to Adactin Group of Hotels']");
		String text = txtWelcome.getText();
		System.out.println("Default text shown in Loginpage is : " + text);
		Assert.assertEquals(text, "Welcome to Adactin Group of Hotels");
		System.out.println("Loginpage Validated");
	}

	@When("User should enter {string},{string} and click Login button")
	public void user_should_enter_and_click_Login_button(String userName, String passWord) throws InterruptedException {

		Cucumber_POM_Adactin_Login a = new Cucumber_POM_Adactin_Login();
		a.loginPage(userName, passWord);
	}

	@Then("User should be redirected to Home page")
	public void user_should_be_redirected_to_Home_page() {

		WebElement txtUserName = locatorBy("id", "username_show");
		String attribute = txtUserName.getAttribute("value");
		System.out.println("Value of UserName in Homepage is : " + attribute);
		Assert.assertEquals(attribute, "Hello MyNewIDforTesting!");
		System.out.println("Homepage Validated");
	}

	@Given("User should be in Search Hotel page")
	public void user_should_be_in_Search_Hotel_page() {

	}

	@When("User should enter {string},{string},{string},{string},{string},{string},{string},{string} and click Search button")
	public void user_should_enter_and_click_Search_button(String string, String string2, String string3, String string4,
			String string5, String string6, String string7, String string8) {

	}

	@When("User should be redirected to Select Hotel Page")
	public void user_should_be_redirected_to_Select_Hotel_Page() {

	}

	@When("User should Select existing hotel and click Continue button")
	public void user_should_Select_existing_hotel_and_click_Continue_button() {

	}

	@Then("User should be redirected to Book A Hotel Page")
	public void user_should_be_redirected_to_Book_A_Hotel_Page() {

	}

	@Given("User should be in booking page")
	public void user_should_be_in_booking_page() {

	}

	@When("User should enter {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_enter_and(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8) {

	}

	@When("User should click Book_Now button")
	public void user_should_click_Book_Now_button() {

	}
}
