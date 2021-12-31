package com.cucumber.stepDefinitions;

import com.cucumber.base.Testbase;
import com.cucumber.pages.Logindata;
import com.cucumber.pages.Orderdata;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Orderpage 
{
	Logindata ld;
	Testbase base;
	Orderdata od;
	
	@When("user click on Details and Go to Order History")
	public void user_click_on_Details_and_Go_to_Order_History() {
		 base = new Testbase();
		    base.initialization();
		    ld=new Logindata();
		    ld.loginDetails();
		    od=new Orderdata();
		    od.orderDetails();
		   // base.Close();
	}

	@Then("user click on the Order cancellation")
	public void user_click_on_the_Order_cancellation() {
		  od=new Orderdata();
		    od.Cancel();
		    base.Close();
	}

}
