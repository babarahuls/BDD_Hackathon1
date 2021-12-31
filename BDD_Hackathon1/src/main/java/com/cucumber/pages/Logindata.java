package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.base.Testbase;

public class Logindata extends Testbase
{
	@FindBy(xpath="//span[@class='hide_xs']")
	WebElement sign;

	@FindBy(xpath="//input[@id='email']")
	WebElement email;

	@FindBy(xpath ="//input[@type='password']")
	WebElement Password;

	@FindBy(xpath ="//*[@id=\"SubmitLogin\"]/span")
	WebElement login;

	@FindBy(xpath ="//*[@id=\"center_column\"]/div/div/ul/li[5]/a") 
	WebElement myaddress;

	@FindBy(xpath ="//*[@id=\"center_column\"]/div/a") 
	WebElement Addaddress;

	@FindBy(xpath ="//input[@name='firstname']")
	WebElement firstname;

	@FindBy(xpath ="//input[@name='lastname']")
	WebElement lastname;

	@FindBy(xpath ="//*[@id=\"company\"]")
	WebElement company;

	@FindBy(xpath ="//input[@id='address1']")
	WebElement Address;

	@FindBy(xpath ="//input[@id='city']")
	WebElement city;

	@FindBy(xpath ="//select[@id='id_state']")
	WebElement state;

	@FindBy(xpath ="//input[@id='postcode']")
	WebElement Zip;
	
	@FindBy(xpath ="//*[@id=\"id_country\"]")
	WebElement country;
	
	@FindBy(xpath ="//*[@id=\"phone\"]")
	WebElement phone;

	@FindBy(xpath ="//input[@id='phone_mobile']")
	WebElement mobile;

	@FindBy(xpath ="//input[@id='alias']")
	WebElement reference;
	
	@FindBy(xpath ="//p[@class='submit2']")
	WebElement save;
  
	//@FindBy(xpath ="//*[@id=\"submitAddress\"]/span")
	//WebElement save = driver.findElement(By.cssSelector("#submitAddress")); 
	
	@FindBy(xpath ="//*[@id=\"user_info_acc\"]/span[2]")
	WebElement button;

	@FindBy(xpath ="//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/ul/li[3]/a")
	WebElement logout;

	//Initialize Object Repositories
	public Logindata() {
		PageFactory.initElements(driver, this);
	}
	public void loginDetails()
	{
		sign.click();
		email.clear();
		//email.sendKeys("sr209518@gmail.com");
		email.sendKeys("rahulsgame@gmail.com");
		//email.sendKeys("demo@demo.com");
		Password.clear();
		Password.sendKeys("shameer@90006");
		//Password.sendKeys("Test@123");
	}
		public void Login()
		{
		login.click();
		
		 //myaddress.click();
		 //Addaddress.click();
	}
	public void Adddetails()
	{
		myaddress.click();
		Addaddress.click();
		firstname.clear();
		firstname.sendKeys("Bob");
		lastname.clear();
		lastname.sendKeys("rahul");
		company.sendKeys("HCL");
		//Address.clear();
		Address.sendKeys("Alaska");
		//city.clear();
		city.sendKeys("new york");
	//	state.clear();
		state.sendKeys("Alaska");
		//Zip.clear();
		Zip.sendKeys("10001");
		//country.clear();
		country.sendKeys("united states");
		phone.clear();
		phone.sendKeys("9000689154");
		mobile.clear();
		mobile.sendKeys("7386668637");
		reference.clear();
		reference.sendKeys("correct");
		((JavascriptExecutor) driver).executeScript("document.getElementById('submitAddress').click();", save);
		//save.click();

	}
	//public void submit() throws InterruptedException 
	//{
       // save.click();
		//((JavascriptExecutor) driver).executeScript("document.getElementById('submitAddress').click();", save);
		//button.click();
		//logout.click();
	//}
	public void Logout()
	{
		button.click();
		logout.click();
	}
}
