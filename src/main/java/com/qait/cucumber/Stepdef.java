package com.qait.cucumber;

//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When; 

public class Stepdef {
	 WebDriver driver;
//	 public static String readFile(String file) throws IOException
//	 {
//	 	BufferedReader reader = new BufferedReader(new FileReader (file));
//	     String         line = null;
//	     StringBuilder  stringBuilder = new StringBuilder();
//	     String         ls = System.getProperty("line.separator");
//
//	     try {
//	         while((line = reader.readLine()) != null) {
//	             stringBuilder.append(line);
//	             stringBuilder.append(ls);
//	         }
//	     } finally {
//	         reader.close();
//	     }
//	 	return stringBuilder.toString();
//	 }
	
	@Given("^I open the application$")
	public void i_open_the_application() throws Throwable {

		
		// Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	     driver = Hooks.driver;              
	     driver.get("https://www.hackerrank.com/auth/login?h_l=body_middle_left_button&h_r=login");
	     try{
		     Thread.sleep(1000);	    
	}
	catch(Exception e)
	{}
	}

	@When("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String userName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	     driver.findElement(By.id("input-1")).sendKeys(userName);

try{
	     Thread.sleep(1000);	    
}
catch(Exception e)
{}
	}

	@When("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String pass) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	    driver.findElement(By.id("input-2")).sendKeys(pass);
	     driver.findElement(By.cssSelector("button[data-analytics='LoginPassword']")).click();
	     try{
		     Thread.sleep(5000);	    
	}
	     catch(Exception e)
	 	{}
	}

	@Then("^login successful$")
	public void login_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		 if(driver.getCurrentUrl().equalsIgnoreCase(
			      "https://www.hackerrank.com/dashboard")){
			         System.out.println("Test Pass"); 
			      } else { 
			         System.out.println("Test Failed"); 
			      } 
	
	 
	 
 
	}

}
