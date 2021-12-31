package com.cucumber.stepDefinitions;


import com.cucumber.base.Testbase;
import com.cucumber.pages.Logindata;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginpage extends Testbase
{
	Testbase base;
	Logindata ld;
	
	@Given("Launch the url")
	public void launch_the_url() {
	    base = new Testbase();
	    base.initialization();
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
	    ld=new Logindata();
	    base = new Testbase();
	    ld.loginDetails();
	   // base.Close();
	}

	@Then("click on Login")
	public void click_on_Login() {
		ld=new Logindata();
		ld.Login();
	}

	@When("user enter Address")
	public void user_enter_Address() throws InterruptedException {
		ld=new Logindata();
		ld.Adddetails();
	
	}

	@And("click on Logout")
	public void click_on_Logout() throws InterruptedException {
		ld=new Logindata();
		ld.Logout();
		base.Close();
	}
	
}
