package com.cucumber.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.base.Testbase;

public class Orderdata extends Testbase 
{
	//@FindBy(xpath ="//*[@id=\"user_info_acc\"]/span[2]")
	//WebElement button;
	
	@FindBy(xpath ="//*[@id=\"center_column\"]/div/div/ul/li[1]/a/span")
	WebElement orderdetails;

	@FindBy(xpath ="//*[@id=\"order-list\"]/tbody/tr/td[7]/a/span")
	WebElement details;

	@FindBy(xpath ="//*[@id=\"order_refund_request\"]")
	WebElement cancelbooking;

	@FindBy(xpath ="//*[@id=\"block-order-detail\"]/form[1]/div[2]/table/tbody/tr[1]/td[1]/div/label/input")
	WebElement Room;
	
	@FindBy(xpath ="//*[@id=\"order_refund_request_submit\"]")
	WebElement submit;

	public Orderdata() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void orderDetails()
	{
		orderdetails.click();
		details.click();
		//cancelbooking.click();
	}
	
	public void Cancel()
	{
		//cancelbooking.click();
		
		((JavascriptExecutor) driver).executeScript("document.getElementById('order_refund_request').click();", Room);


		Room.click();
		((JavascriptExecutor) driver).executeScript("document.getElementById('order_refund_request').click();", Room);

		//submit.click();
	}
}
