package stepdefinitions;

import java.io.IOException;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass_Cucumber;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.adactin.Booking_Confirmation_Page;
import pom.adactin.Booking_Page;
import pom.adactin.Login_Page;
import pom.adactin.Personal_Details_Page;

public class Step_Definition_Adactin extends BaseClass_Cucumber {

	public static WebDriver driver;

	@Given("User should be in login page")
	public void user_should_be_in_login_page() throws InterruptedException {

		WebElement txtWelcome = locatorBy("text", "//*[text()='Welcome to Adactin Group of Hotels']");
		String text = txtWelcome.getText();
		System.out.println("Default text shown in Loginpage is : " + text);
		Assert.assertEquals(text, "Welcome to Adactin Group of Hotels");
		System.out.println("Loginpage Validated");
	}

	@When("User should enter credentials and click Login button")
	public void user_should_enter_credentials_and_click_Login_button(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {

		Map<String, String> mapRef = dataTable.asMap(String.class, String.class);
		String s1 = mapRef.get("userName");
		String s2 = mapRef.get("passWord");

		Login_Page a = new Login_Page();
		sendKeys(a.getUsername(), s1);
		sendKeys(a.getPassword(), s2);
		buttonClick(a.getLogin());
	}

	@Then("User should be redirected to Home page")
	public void user_should_be_redirected_to_Home_page() {

		WebElement txtUserName = locatorBy("id", "username_show");
		String attribute = txtUserName.getAttribute("value");
		System.out.println("Value of UserName in Homepage is : " + attribute);
		Assert.assertEquals(attribute, "Hello MyNewIDforTesting!");
		System.out.println("Entered into \"Homepage\"");
	}

	// -------------------------------------------------------------------------------------------------------------------------------------------
	@Given("User should be in Search Hotel page")
	public void user_should_be_in_Search_Hotel_page() {

		WebElement txtUserName = locatorBy("id", "username_show");
		String attribute = txtUserName.getAttribute("value");
		System.out.println("Value of UserName in Homepage is : " + attribute);
		Assert.assertEquals(attribute, "Hello MyNewIDforTesting!");
		System.out.println("\"Search Hotelpage\" Validated");
	}

	@When("User should enter location, hotel, roomType, roomNos, checkIn, checkOut, adultRoom, childRoom and click Search button")
	public void user_should_enter_location_hotel_roomType_roomNos_checkIn_checkOut_adultRoom_childRoom_and_click_Search_button() throws IOException, InterruptedException {

		String path = "C:\\Users\\Bismillah\\Desktop\\Read";
		String fileName = "Test Data - Input - Adactin";
		String sheetName = "Single Test";

		String location = readExcelToWebPage(path, fileName, sheetName, 1, 0);
		String hotel = readExcelToWebPage(path, fileName, sheetName, 1, 1);
		String roomType = readExcelToWebPage(path, fileName, sheetName, 1, 2);
		String roomNos = readExcelToWebPage(path, fileName, sheetName, 1, 3);
		String checkIn = readExcelToWebPage(path, fileName, sheetName, 1, 4);
		String checkOut = readExcelToWebPage(path, fileName, sheetName, 1, 5);
		String adultRoom = readExcelToWebPage(path, fileName, sheetName, 1, 6);
		String childRoom = readExcelToWebPage(path, fileName, sheetName, 1, 7);

		Booking_Page b = new Booking_Page();
		sendKeys(b.getLocation(), location);
		sendKeys(b.getHotel(), hotel);
		sendKeys(b.getRoomType(), roomType);
		sendKeys(b.getRoomNos(), roomNos);
		sendKeys(b.getDatepickin(), checkIn);
		sendKeys(b.getDatepickout(), checkOut);
		sendKeys(b.getAdultroom(), adultRoom);
		sendKeys(b.getChildroom(), childRoom);
		buttonClick(b.getSearch());

	}

	@When("User should be redirected to Select Hotel Page")
	public void user_should_be_redirected_to_Select_Hotel_Page() throws InterruptedException {

		WebElement txtSelectHotel = locatorBy("text", "//*[text()='Select Hotel ']");
		String text = txtSelectHotel.getText();
		System.out.println("Default text shown in Hotel Confirmation page is : " + text);
		Assert.assertEquals(text, "Select Hotel");
		System.out.println("Entered into \"Select Hotel page\"");
	}

	@When("User should select existing hotel and click Continue button")
	public void user_should_select_existing_hotel_and_click_Continue_button() throws InterruptedException {

		Booking_Confirmation_Page c = new Booking_Confirmation_Page();
		c.bookingConfirmationPage();
	}

	@Then("User should be redirected to Book A Hotel Page")
	public void user_should_be_redirected_to_Book_A_Hotel_Page() throws InterruptedException {

		WebElement txtBookAHotel = locatorBy("text", "//*[text()='Book A Hotel ']");
		String text = txtBookAHotel.getText();
		System.out.println("Default text shown in Booking_Page page is : " + text);
		Assert.assertEquals(text, "Book A Hotel");
		System.out.println("Entered into \"Book A Hotel Page\"");
	}
	// -------------------------------------------------------------------------------------------------------------------------------------------

	@Given("User should be in final booking page")
	public void user_should_be_in_final_booking_page() throws InterruptedException {

		WebElement txtBookAHotel = locatorBy("text", "//*[text()='Book A Hotel ']");
		String text = txtBookAHotel.getText();
		System.out.println("Default text shown in Booking_Page page is : " + text);
		Assert.assertEquals(text, "Book A Hotel");
		System.out.println("\"Final Booking_Page page\" Validated");
	}

	@When("User should enter {string},{string},{string},{string},{string},{string},{string},{string} and click Book_Now button")
	public void user_should_enter_and_click_Book_Now_button(String firstName, String lastName, String billingAddress,
			String ccNum, String ccType, String ccExpMonth, String ccExpYear, String cvvNum)
			throws InterruptedException {

		Personal_Details_Page d = new Personal_Details_Page();
		d.personalDetailsPage(firstName, lastName, billingAddress, ccNum, ccType, ccExpMonth, ccExpYear, cvvNum);
	}

	@When("User should be redirected to Booking Confirmation Page")
	public void user_should_be_redirected_to_Booking_Confirmation_Page() throws InterruptedException {

		WebElement txtBookingConfirmation = locatorBy("text", "//*[text()='Booking Confirmation ']");
		String text = txtBookingConfirmation.getText();
		System.out.println("Default text shown in Booking Confirmation page is : " + text);
		Assert.assertEquals(text, "Booking Confirmation");
		System.out.println("\"Booking Confirmation page\" Validated");
	}

	@Then("User should get OrderId of Booked Hotel")
	public void user_should_get_OrderId_of_Booked_Hotel() throws InterruptedException {

		WebElement txtOrderId = locatorBy("id", "order_no");
		String attribute = txtOrderId.getAttribute("value");
		System.out.println("Value of OrderId is : " + attribute);
	}
}