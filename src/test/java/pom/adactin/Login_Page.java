package pom.adactin;

import baseclass.BaseClass_Cucumber;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page extends BaseClass_Cucumber {

	public Login_Page() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login")
	private WebElement login;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public void loginPage(String userName, String passWord) throws InterruptedException {

		sendKeys(getUsername(), userName);
		sendKeys(getPassword(), passWord);
		buttonClick(getLogin());

	}

}