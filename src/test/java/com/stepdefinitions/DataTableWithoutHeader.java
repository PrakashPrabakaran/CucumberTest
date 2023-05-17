package com.stepdefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataTableWithoutHeader {
WebDriver driver;
@Given("your is on login pages")
public void your_is_on_login_pages() {
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
@When("enter the below credentials")
public void enter_the_below_credentials(DataTable dataTable) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
	Thread.sleep(6000);

	List<String> credentials = dataTable.transpose().asList(String.class);
	String userName = credentials.get(0);
	String password = credentials.get(1);
	 driver.findElement(By.name("username")).sendKeys(userName);
	 driver.findElement(By.name("password")).sendKeys(password);
}
@When("clicks on login button in the login page")
public void clicks_on_login_button_in_the_login_page() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//button[@type='submit']")).click();

}
@Then("the user should be navigated to homepage in orange")
public void the_user_should_be_navigated_to_homepage_in_orange() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(3000);

    // Write code here that turns the phrase above into concrete actions
	boolean status = driver.findElement(By.className("oxd-brand-banner")).isDisplayed();
	Assert.assertTrue(status);
}

}
