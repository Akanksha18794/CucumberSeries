package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private WebDriver driver;
	
	private By HomePageSections = By.xpath("//div[@id='main-nav']//a");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public int getHomePageSectionCount() {
		return driver.findElements(HomePageSections).size();
	}
	
	public List<String> getHomePageHeaderList() {
		List<String> List = new ArrayList<>();
		List<WebElement> HeaderList = driver.findElements(HomePageSections);

		for (WebElement e : HeaderList) {
			String text = e.getText();
			System.out.println(text);
			List.add(text);
		}

		return List;
	}
}
