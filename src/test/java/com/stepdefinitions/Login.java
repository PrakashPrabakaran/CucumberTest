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


public class Login {
	WebDriver driver;
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--start-maximized"); // Maximize window on start-up
		options.addArguments("--disable-extensions"); // Disable browser extensions
		options.addArguments("--disable-popup-blocking"); // Disable pop-up blocking
		options.addArguments("no-sandbox");
		options.addArguments("disable-dev-shm-usage");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	}

	@When("^user enters the valid username and password$")
	public void user_enters_the_valid_username_and_password() throws Throwable {
		Thread.sleep(3000);
		 driver.findElement(By.name("username")).sendKeys("Admin");
		 driver.findElement(By.name("password")).sendKeys("admin123");
		  
	}

	@When("^clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("^the user should be navigated to homepage$")
	public void the_user_should_be_navigated_to_homepage() throws Throwable {
		Thread.sleep(3000);

	    // Write code here that turns the phrase above into concrete actions
		boolean status = driver.findElement(By.className("oxd-brand-banner")).isDisplayed();
		Assert.assertTrue(status);
	}
}
