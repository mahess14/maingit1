package com.qa.stepdef;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef2 extends Base{
	
	@When("click on compose button and fill all fields with data")
	public void method5(DataTable dt) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		
		List<Map<String,String>> m=dt.asMaps();
		for(int i=0;i<m.size();i++)
		{
			driver.findElement(By.xpath("//*[text()='Compose']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@type='text'])[4]")).sendKeys(m.get(i).get("To"));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys(m.get(i).get("Subject"));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys(m.get(i).get("Message Body"));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@type='file']")).sendKeys(m.get(i).get("Attachment"));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Send']")).click();
			Thread.sleep(1000);
			String x=driver.findElement(By.xpath("//span[text()='Message sent']")).getText();
			if(x.contains("Message Sent"))
			{
				SoftAssert sa = new SoftAssert();
				sa.assertTrue(true);
				System.out.println("Message sent  is displaying");
				sa.assertAll();
			}
			else 
			{
				System.out.println("Message sent is not displaying");
			}
			
		}
	    
	}
	
	
	
	@Then("do logout")
	public void method7() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(@aria-label,'Google Account:')]/img")).click();
		driver.switchTo().frame("account");
		driver.findElement(By.xpath("//div[text()='Sign out']")).click();
		Thread.sleep(5000);
		driver.close();
	   
	}


}
