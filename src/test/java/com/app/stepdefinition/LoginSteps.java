package com.app.stepdefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class LoginSteps {

	@Given("Launch the URL")
	public void launch_the_url() {
	    System.out.println("browser launch");
	}
	@When("Enter the username {string}")
	public void enter_the_username(String username) {
	   System.out.println(username);
	}
	@When("Enter the password {string}")
	public void enter_the_password(String password) {
	   System.out.println(password);
	}
	@When("Click the login button")
	public void click_the_login_button() {
	  System.out.println("login button");
	}
	@Then("Validate the Homepage")
	public void validate_the_homepage() {
	  System.out.println("homepage");  
	}
	
	@When("Enter the mobile data {string}")
	public void enter_the_mobile_data(String mobile) {
	    System.out.println(mobile);
	}
	
	@When("Enter the deatils for practise form")
	public void enter_the_deatils_for_practise_form(DataTable dataTable) {
		List<String> asList = dataTable.asList();
		System.out.println(asList.get(0));
		
	}
	
	@When("Enter the deatils for emp form")
	public void enter_the_deatils_for_emp_form(DataTable dataTable) {
		Map<String, String> asMap = dataTable.asMap();
		System.out.println(asMap.get("FirstName"));
		
	}

}
