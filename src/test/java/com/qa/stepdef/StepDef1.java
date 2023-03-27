package com.qa.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef1 extends Base {
	
	@Given("launch chrome browser")
	public void method1() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	    
	}

	@Then("Enter url as {string}")
	public void method2(String x) throws Exception {
		
		driver.get(x);
		Thread.sleep(5000);
	    
	}

	@Then("Enter username as {string} and password as {string}")
	public void method3(String x, String y) throws Exception {
		
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(x);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys(y);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
	}

	
}
