package com.app.stepdefinition;

import org.junit.Assert;

import io.cucumber.java.en.*;

public class Mobile {
	
	
	@When("Select the Electronic module")
	public void select_the_electronic_module() {
		System.out.println("ele");
		Assert.assertTrue(false);
		
	}
	@When("Select the Mobile oneplus mobile")
	public void select_the_mobile_oneplus_mobile() {
	    System.out.println("oneplus");
	}
	@Then("Validate the mobile in the add to cart")
	public void validate_the_mobile_in_the_add_to_cart() {
	    System.out.println("cart");
	}


}
