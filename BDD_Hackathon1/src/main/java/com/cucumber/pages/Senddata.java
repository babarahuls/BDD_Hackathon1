package com.cucumber.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.base.Testbase;

public class Senddata extends Testbase
{



	@FindBy(xpath ="//*[@id=\"header\"]/div[3]/div/div/div[2]/button")
	WebElement lines;

	@FindBy(xpath ="//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[8]/a")
	WebElement contact;

	@FindBy(xpath ="//*[@id=\"contact_type\"]")
	WebElement choose;

	@FindBy(xpath ="//*[@id=\"center_column\"]/div/div[2]/div[2]/form/div[1]/div/div/ul/li[1]")
	WebElement service;

	@FindBy(xpath="//input[@id='email']")
	WebElement email;

	@FindBy(xpath ="//*[@id=\"message\"]")
	WebElement Message;

	@FindBy(xpath="//*[@id=\"submitMessage\"]/span")
	WebElement send;

	public Senddata() 
	{
		PageFactory.initElements(driver, this);
	}

	public void ContactUs()
	{
		lines.click();
	}
	public void Contact()
	{
		contact.click();
	}
	public void message()
	{
		choose.click();
		service.click();
		//email.sendKeys("sr209518@90006");
		email.sendKeys("rahulsgame@gmail.com");
		Message.sendKeys("Help me");
		//send.click();
		((JavascriptExecutor) driver).executeScript("document.getElementById('submitMessage').click();", send);
	}
}



