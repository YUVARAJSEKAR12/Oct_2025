package com.app.stepdefinition;

import io.cucumber.java.en.Given;

public class RealLoginSteps {
	@Given("Login to the Application")
	public void login_to_the_application() {
	    System.out.println("login");
	}
}
