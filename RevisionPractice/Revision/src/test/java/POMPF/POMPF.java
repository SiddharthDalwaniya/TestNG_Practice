package POMPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMPF {

	WebDriver driver;
	
	@FindBy(id="user-name")
	WebElement UserNameField;
	
	@FindBy(id="password")
	WebElement PasswordField;
	
	@FindBy(id="login-button")
	WebElement LoginButton;
	
	public POMPF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, POMPF.class);
	}
	
	public void EnterUserName(String username) {
		UserNameField.sendKeys(username);
	}

	public void EnterPassword(String password) {
		PasswordField.sendKeys(password);
	}
	
	public void PressLoginButton() {
		LoginButton.click();
	}
}
