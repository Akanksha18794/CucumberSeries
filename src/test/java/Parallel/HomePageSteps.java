package Parallel;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
import Factory.DriverFactory;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps {
	
	private LoginPage lp = new LoginPage(DriverFactory.getDriver());
	private HomePage hp;
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable credTable) {
	    List<Map<String,String>> credList = credTable.asMaps();
	    String userName = credList.get(0).get("username");
	    String password = credList.get(0).get("password");
	
	DriverFactory.getDriver().get("https://freecrm.com/");
	hp = lp.doLogin(userName, password);
	}

	@Given("user is on Home page")
	public void user_is_on_home_page() {
	    String title = hp.getHomePageTitle();
	    System.out.println("Home Page Title is: " + title);
	}

	@Then("user gets the home page section")
	public void user_gets_the_home_page_section(DataTable sectionTable) {
	    List<String> expectedHomepageList = sectionTable.asList();
		System.out.println("Expected Home Page List: " + expectedHomepageList);
	    
		List<String> actualHomepageList = hp.getHomePageHeaderList();
	    System.out.println("Actual Home Page List: " + actualHomepageList);
	
	    Assert.assertTrue(expectedHomepageList.containsAll(actualHomepageList));
	}

	@Then("Homepage section count should be {int}")
	public void homepage_section_count_should_be(Integer expectedCount) {
	    Assert.assertTrue(hp.getHomePageSectionCount() == expectedCount);
	}

}
