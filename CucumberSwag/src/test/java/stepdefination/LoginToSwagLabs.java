package stepdefination;

import org.apache.log4j.Logger;
import org.testng.Assert;

import configreader.ObjectRepo;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Logger.LoggerHelper;
import helper.TestBase.TestBase;
import junit.framework.Test;
import pageObjects.SLogin;

public class LoginToSwagLabs {

	private final Logger log = LoggerHelper.getLogger(LoginToSwagLabs.class);

	SLogin login;

	@Given("^I eneter to the application entering the URL \"([^\"]*)\"$")
	public void i_eneter_to_the_application_entering_the_URL(String arg1) {
		TestBase.driver.get(ObjectRepo.reader.getWebsite());

	}

	@Then("^I should see the Loginpage of the application$")
	public void i_should_see_the_Loginpage_of_the_application() {
		Assert.assertEquals(TestBase.driver.getTitle(), "Swag Labs");
		log.info("Page Title Verified Sccessfully");
	}

	@When("^enter Username as \"([^\"]*)\"$")
	public void enter_Username_as(String Username) {
		login = new SLogin(TestBase.driver);
		login.enterusername("standard_user");
	}

	@When("^enter Password as \"([^\"]*)\"$")
	public void enter_Password_as(String password) throws Throwable {
		login.enterPassword("secret_sauce");
	}

	@When("^click on sign in button$")
	public void click_on_sign_in_button() {
		login.clickOnSubmitButton();

	}

	@Then("^I am on the Myprofile page on URL \"([^\"]*)\"$")
	public void i_am_on_the_Myprofile_page_on_URL(String arg1) {
		String currentUrl = TestBase.driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.saucedemo.com/inventory.html");
		log.info("Header verified successfully");

	}

	@Then("^I should see \"([^\"]*)\" message$")
	public void i_should_see_message(String arg1) {
		Assert.assertEquals(login.Pagetitleafterlogin(), "Swag Labs");
		log.info("Page Title Verified successfully");
	}

	@Then("^I should see the \"([^\"]*)\" button$")
	public void i_should_see_the_button(String arg1) {
		Assert.assertEquals(true, login.LogoutbuttonPresent(), "Logout Button Present");
		log.info("Logout Button Available");
	}

}
