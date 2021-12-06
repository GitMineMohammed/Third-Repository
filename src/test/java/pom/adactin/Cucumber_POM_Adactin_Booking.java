package pom.adactin;

import baseclass.BaseClass_Cucumber;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cucumber_POM_Adactin_Booking extends BaseClass_Cucumber {

	public Cucumber_POM_Adactin_Booking() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotel;

	@FindBy(id = "room_type")
	private WebElement roomType;

	@FindBy(id = "room_nos")
	private WebElement roomNos;

	@FindBy(id = "datepick_in")
	private WebElement datepickin;

	@FindBy(id = "datepick_out")
	private WebElement datepickout;

	@FindBy(id = "adult_room")
	private WebElement adultroom;

	@FindBy(id = "child_room")
	private WebElement childroom;

	@FindBy(id = "Submit")
	private WebElement Search;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNos() {
		return roomNos;
	}

	public WebElement getDatepickin() {
		return datepickin;
	}

	public WebElement getDatepickout() {
		return datepickout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSearch() {
		return Search;
	}

	public void bookingPage(String location, String hotel, String roomType, String roomNos, String checkIn,
			String checkOut, String adultRoom, String childRoom) throws InterruptedException {

		selectByVisibleText(getLocation(), location);
		selectByVisibleText(getHotel(), hotel);
		selectByVisibleText(getRoomType(), roomType);
		selectByVisibleText(getRoomNos(), roomNos);
		selectByVisibleText(getDatepickin(), checkIn);
		selectByVisibleText(getDatepickout(), checkOut);
		selectByVisibleText(getAdultroom(), adultRoom);
		selectByVisibleText(getChildroom(), childRoom);
		buttonClick(getSearch());

	}
}
