package com.cucumber.stepDefinitions;

import com.cucumber.base.Testbase;
import com.cucumber.pages.Senddata;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Messagepage extends Testbase
{
	Testbase base;
	Senddata sd;
	
	
	@When("user click on Menu")
	public void user_click_on_Menu() {
	    sd=new Senddata();
	    sd.ContactUs();
	}

	@Then("user clicks on contact")
	public void user_clicks_on_contact() {
		 sd=new Senddata();
		    sd.Contact();
	}
	
	@And("user sends a message")
	public void user_sends_a_message() {
		 sd=new Senddata();
		    sd.message();
	}

}
