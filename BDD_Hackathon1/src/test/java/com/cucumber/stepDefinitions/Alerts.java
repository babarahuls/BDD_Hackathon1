package com.cucumber.stepDefinitions;


	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;



	public class Alerts 
	{




		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","G:\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get("http://rahul:@www.qaonlinetraining.com/testcase.html");
			driver.findElement(By.xpath("/html/body/div[2]/div/button")).click();;
			

		
		}



	}




