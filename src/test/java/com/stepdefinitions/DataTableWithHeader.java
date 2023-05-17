package com.stepdefinitions;

import java.util.List;
import java.util.Map;

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

public class DataTableWithHeader {
	WebDriver driver;
@Given("Login pages")
public void login_pages() {
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
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
@When("enter the below credentials of the login Pagess")
public void enter_the_below_credentials_of_the_login_pagess(DataTable dataTable) throws InterruptedException {
	Thread.sleep(3000);
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
	 List<Map<String, String>> KeyValuePair = dataTable.asMaps(String.class, String.class);
	 String user = KeyValuePair.get(0).get("UserName");
	 String pass = KeyValuePair.get(0).get("Password");
	 driver.findElement(By.name("username")).sendKeys(user);
	 driver.findElement(By.name("password")).sendKeys(pass);
}

@When("click on the login button in the Log In Orange pages")
public void click_on_the_login_button_in_the_log_in_orange_pages() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}



	
}
