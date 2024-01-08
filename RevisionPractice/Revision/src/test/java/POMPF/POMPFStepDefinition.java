package POMPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import Utilities.Screenshot;
import io.cucumber.java.en.*;

public class POMPFStepDefinition {

	WebDriver driver=null;
	POMPF factory = new POMPF(driver);
	
	@When("user open the safari")
	public void user_open_the_safari() {
		driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
	}

	@And("enter the credentials")
	public void enter_the_credentials() {
		factory.EnterUserName("standard_user");
		factory.EnterPassword("secret_sauce");
		
	}

	@And("click on the login button")
	public void click_on_the_login_button() {
		factory.PressLoginButton();
	}

	@Then("verify the user if logged in correctly")
	public void verify_the_user_if_logged_in_correctly() {
		System.out.println("==============No need to validate. You are already on the login page.=================");
	}

	@When("user is logged in")
	public void user_is_logged_in() {
		System.out.println("User is logged in. Thanks.");
		
	}

	@And("takes screenshot")
	public void takes_screenshot() {
		Screenshot.TakeScreenshot(driver);
	}

	@Then("print the success statement")
	public void print_the_success_statement() {
		System.out.println("===============Screenshot has been taken successfully. Please have a look.============");
	}

	@And("close the browser")
	public void close_the_browser() {
		driver.close();
	}


	
}
