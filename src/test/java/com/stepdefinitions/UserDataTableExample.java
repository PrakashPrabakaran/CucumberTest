package com.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UserDataTableExample {
	WebDriver driver;


@Given("Login pagee")
public void login_pagee() {
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
@When("user enters {string} and {string}")
public void user_enters_and(String user, String pass) throws InterruptedException {
	Thread.sleep(3000);
	 driver.findElement(By.name("username")).sendKeys(user);
	 driver.findElement(By.name("password")).sendKeys(pass);
}
@When("click on the submit buttons")
public void click_on_the_submit_buttons() {
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}

	
}
