package Parallel;

import org.junit.Assert;

import Factory.DriverFactory;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	private static String title;
	private LoginPage lp = new LoginPage(DriverFactory.getDriver());
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("https://freecrm.com/");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = lp.GetLoginPageTitle();
		System.out.println("Page title is: " + title);
	}

	@Then("login page title should  be {string}")
	public void login_page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
		lp.ClickOnLoginButton();
		Assert.assertTrue(lp.ForgotPasswordLinkIsDisplayed());
	}

	@Then("user clicks on LogIn button")
	public void user_clicks_on_Log_In_button() {
	    lp.ClickOnLoginButton();
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
	   lp.EnterUserName(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
	    lp.EnterPassword(password);
	}

	@When("user clicks on signin button")
	public void user_clicks_on_sign_in_button() {
	  lp.clickOnSiginButton();;
	}

	@Then("user gets the title of the home page")
	public void user_gets_the_title_of_the_home_page() {
		title = lp.GetLoginPageTitle();
		System.out.println("Page title is: " + title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
	    Assert.assertTrue(title.contains(expectedTitle));
	}

}
