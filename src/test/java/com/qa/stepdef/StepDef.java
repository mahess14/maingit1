package com.qa.stepdef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	
	public RemoteWebDriver driver;
	
	@Given("launch the chrome browser")
	public void method1() {
	   WebDriverManager.chromedriver().setup(); 
	   driver=new ChromeDriver();
	}

	@When("Enter the url as {string}")
	public void method2(String string) throws Exception {
	    
		driver.get(string);
		Thread.sleep(5000);
	}

	@Then("Enter {string} and click Enter")
	public void method3(String string) throws Exception {
		
		driver.findElement(By.name("q")).sendKeys(string,Keys.ENTER);
		Thread.sleep(5000);
	    
	}

	@Then("Verify the page title as {string}")
	public void method4(String expected) {
		
		String actual=driver.getTitle();
		if(expected.contains(actual))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
	   
	}

	@Then("close/quit browser")
	public void method5() {
	   driver.close();
	}
	
	
	@Then("Verify the Title as {string}")
	public void method6(String expected) {
	   String actual=driver.getTitle();
	   if(actual.contains(expected))
	   {
		   System.out.println("Title is google");
	   }
	   else
	   {
		   System.out.println("Title is not google");
	   }
	}

	@Then("search a word and click Enter and check page title")
	public void method7(DataTable dt) throws Exception {
	   
	  List<String> l= dt.asList();
	  
	  for(int i=1;i<l.size();i++)
	  {
		  driver.findElement(By.name("q")).sendKeys(l.get(i), Keys.ENTER);
		  Thread.sleep(3000);
		  if(driver.getTitle().contains(l.get(i)))
		  {
			  System.out.println("Test passed");
		  }
		  else
		  {
			  System.out.println("Test Failed");
		  }
		  driver.navigate().back();
		  Thread.sleep(3000);
	  }
	}

}
