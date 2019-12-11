package stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

public class stepDefination {

	WebDriver driver;
	public WebElement inputAreaCode, searchBoxElement, helpLinkText;
	String areaError;

	@Before()
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\\\SeleniumJars\\\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.just-eat.co.uk/");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Given("^I want food in \"AR51 1AA\"$")
	public void i_want_food_in_something() throws InterruptedException {

		inputAreaCode = driver.findElement(By.xpath("//input[@name='postcode']"));
		inputAreaCode.sendKeys("AR51 1AA");
	}

	@When("^I search for restaurants$")
	public void i_search_for_restaurants() {

		searchBoxElement = driver.findElement(By.xpath("//button[@class='Form_c-search-btn_1EEhL']"));
		searchBoxElement.click();
		// Assert.assertEquals("Please enter a full, valid postcode", areaError);
	}

	@Then("^I should see some restaurants in \"([^\"]*)\"$")
	public void i_should_see_some_restaurants_in_something(String data) {

		List<WebElement> restroList = driver.findElements(By.xpath("//h3[@class=\"c-listing-item-title\"]"));
		System.out.println(" List size -->" + restroList.size());
		System.out.println("------ Restaurent---------");
		for (int i = 0; i < 5; i++) {
			System.out.println(restroList.get(i).getText());
		}
	}

	@Given("^Search for food in \"([^\"]*)\"$")
	public void i_want_food_in_something(String strArg1) throws InterruptedException {

//		driver.get("https://www.just-eat.co.uk/");
//		Thread.sleep(3000);
		inputAreaCode = driver.findElement(By.xpath("//input[@name='postcode']"));
		inputAreaCode.sendKeys("AR509");

	}

	@When("^I click on search button$")
	public void i_click_on_search_button() {

		searchBoxElement = driver.findElement(By.xpath("//button[@class='Form_c-search-btn_1EEhL']"));
		searchBoxElement.click();

	}

	@Then("^I should see validation error message  \"([^\"]*)\".$")
	public void i_should_see_validation_error_message_something(List<String> list1) {
		Assert.assertEquals("Please enter a full, valid postcode", driver.findElement(By.id("errorMessage")).getText());
	}

	@Given("^Search for Help link on HomePage$")
	public void search_for_help_link_on_homepage() {

		helpLinkText = driver.findElement(By.xpath("//a[contains(text(),'Help')]"));
		Assert.assertEquals("Help", helpLinkText.getText());
	}

	@When("^click on the link$")
	public void click_on_the_link() throws Throwable {

		helpLinkText.click();

	}

	@Then("^verify the title of the HelpPage$")
	public void verify_the_title_of_the_helppage() {

		Assert.assertEquals("Help - JUST EAT", driver.getTitle());
	}

	@After()
	public void tearDown() {
		driver.close();
	}
}
