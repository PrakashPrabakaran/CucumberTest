package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogle {
	WebDriver driver;
	@Given("^user is entering google\\.co\\.in$")
	public void user_is_entering_google_co_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
	}

	@When("^user is typing the search term \"([^\"]*)\"$")
	public void user_is_typing_the_search_term(String searchTerm) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(searchTerm);
	}

	@When("^enters the return key$")
	public void enters_the_return_key() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@Then("^the user should see the search results$")
	public void the_user_should_see_the_search_results() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 boolean status = driver.findElement(By.partialLinkText("erp")).isDisplayed();
		    if(status) {
		    	System.out.println("Result Displayed");
	}

}}