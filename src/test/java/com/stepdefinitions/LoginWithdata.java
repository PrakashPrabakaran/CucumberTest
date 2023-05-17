package com.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithdata {
	WebDriver driver;
	@Given("User is on login pages")
	public void user_is_on_login_pages() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--start-maximized"); // Maximize window on start-up
		options.addArguments("--disable-extensions"); // Disable browser extensions
		options.addArguments("--disable-popup-blocking"); // Disable pop-up blocking
		options.addArguments("no-sandbox");
		options.addArguments("disable-dev-shm-usage");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@When("user enters the valid {string} and {string}")
	public void user_enters_the_valid_and(String username, String password) throws InterruptedException {
		Thread.sleep(3000);
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.name("username")).sendKeys(username);
		 driver.findElement(By.name("password")).sendKeys(password);
	}
	@When("clicks on login buttons")
	public void clicks_on_login_buttons() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Then("the user should be navigated to homepages")
	public void the_user_should_be_navigated_to_homepages() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);

	    // Write code here that turns the phrase above into concrete actions
		boolean status = driver.findElement(By.className("oxd-brand-banner")).isDisplayed();
		Assert.assertTrue(status);
	}
}
