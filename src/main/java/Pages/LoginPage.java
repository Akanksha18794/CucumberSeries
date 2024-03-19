package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;

	// 1. By Locators: OR
	private By emailId = By.name("email");
	private By password = By.name("password");
	private By logIn = By.xpath("//span[contains(text(),'Log In')]");
	private By signIn = By.xpath("//div[contains(text(),'Login')]");
	private By forgotPwdLink = By.linkText("Forgot your password?");

	// 2. Constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public String GetLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean ForgotPasswordLinkIsDisplayed() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}
	
	public void ClickOnLoginButton() {
		driver.findElement(logIn).click();
	}

	public void EnterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}

	public void EnterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnSiginButton() {
		driver.findElement(signIn).click();
	}

	public HomePage doLogin(String un, String pwd) {
		System.out.println("Login with : " + un + " and " + pwd);
		driver.findElement(logIn).click();
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(signIn).click();
		return new HomePage(driver);
	}
}


