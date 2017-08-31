package com.qait.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef {
	 WebDriver driver;
	@Given("^I open the application$")
	public void i_open_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	     driver = new ChromeDriver();              
	     driver.get("http://accounts.google.com");
	     try{
		     Thread.sleep(3000);	    
	}
	catch(Exception e)
	{}
	}

	@When("^I enter username as ankitmalik(\\d+)$")
	public void i_enter_username_as_ankitmalik(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	     driver.findElement(By.id("identifierId")).sendKeys("ankitmalik"+arg1);

	     driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
try{
	     Thread.sleep(3000);	    
}
catch(Exception e)
{}
	}

	@When("^I enter password as (\\d+)$")
	public void i_enter_password_as(String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	    driver.findElement(By.cssSelector("input.whsOnd.zHQkBf")).sendKeys(arg2);
	     driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
	     try{
		     Thread.sleep(3000);	    
	}
	     catch(Exception e)
	 	{}
	}

	@Then("^login successful$")
	public void login_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		 if(driver.getCurrentUrl().equalsIgnoreCase(
			      "https://myaccount.google.com/?pli=1")){
			         System.out.println("Test Pass"); 
			      } else { 
			         System.out.println("Test Failed"); 
			      } 
	}


}
