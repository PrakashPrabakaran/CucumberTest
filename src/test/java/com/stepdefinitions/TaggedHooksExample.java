package com.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaggedHooksExample {
	@Given("first step")
	public void first_step() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Testing1");

	}
	@Given("second step")
	public void second_step() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("2");

	}
	@When("thrid step")
	public void thrid_step() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("3");

	}
	@When("fourth step")
	public void fourth_step() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("4");

	}
	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("5");

	}

}
