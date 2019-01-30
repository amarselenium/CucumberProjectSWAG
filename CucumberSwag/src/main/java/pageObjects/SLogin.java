package pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Logger.LoggerHelper;
import helper.Wait.WaitHelper;

public class SLogin {

	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(SLogin.class);
	WaitHelper waitHelper;

	@FindBy(xpath = "//input[@id='user-name']")
	WebElement Username;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	@FindBy(xpath = "//input[@class='login-button']")
	WebElement submitLogin;

	@FindBy(xpath = "//div[@class='header_label']")
	WebElement HomepageHeader;

	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	WebElement Logoutbutton;

	public SLogin(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}

	public void enterusername(String Username) {
		log.info("entering username " + Username);
		this.Username.sendKeys(Username);
	}

	public void enterPassword(String password) {
		log.info("entering password...." + password);
		this.password.sendKeys(password);
	}

	public void clickOnSubmitButton() {
		log.info("clicking on submit button...");
		submitLogin.click();

	}

	public String Pagetitleafterlogin() {
		log.info("Getting Page Title after login");
		return HomepageHeader.getText();
	}

	public boolean LogoutbuttonPresent() {
		log.info("Check If Logout Button Is present");
		return Logoutbutton.isEnabled();
	}
}
