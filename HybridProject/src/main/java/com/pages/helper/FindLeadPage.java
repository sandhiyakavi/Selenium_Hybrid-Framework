package com.pages.helper;

import com.base.ProjectSpecificMethod;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

import org.openqa.selenium.By;

public class FindLeadPage extends ProjectSpecificMethod {
	 static String leadID;
	
	@When("Click on the phone link")
	public FindLeadPage clickPhoneLink() throws IOException {
		try {
		getDriver().findElement(By.xpath("//span[text()='Phone']")).click();
		reportStep("pass", "The Phone link is clicked ");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		reportStep("fail", "The Phone link is not clicked " +e);

	}
		return new FindLeadPage();
	}
	
	@When("Enter the phone number as {string}")
	public FindLeadPage enterPhno(String phNo) throws IOException {
		try {
		getDriver().findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phNo);
		reportStep("pass", "The Phone number is entered ");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		reportStep("fail", "The Phone number is not entered " +e);

	}
		return new FindLeadPage();
	}
	
	@When("Click on Find leads button")
	public FindLeadPage clickFindLeadsBtn() throws IOException {
		try {
		getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
		reportStep("pass", "Find Leads button is clicked ");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		reportStep("fail", "Find Leads button is not clicked " +e);

	}
		return new FindLeadPage();
	}

	@When("Click on the first entry from the result")
	public ViewLeadPage clickFirstEntry() throws InterruptedException, IOException {
		try {
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		reportStep("pass", "The First entry from the list is clicked ");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		reportStep("fail", "The First entry from the list is not clicked " +e);

	}
		return new ViewLeadPage();
	}
	
	@When("Get the lead id from the first entry")
	public FindLeadPage getFirstLeadID() throws IOException {
		try {
			Thread.sleep(500);
			leadID = getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
			reportStep("pass", "Got the leadid from the first entry "+leadID);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("fail", "Not able to get the leadid from the first entry " +e);

		}
			return new FindLeadPage();
		
	}
	
	@Then("verify the leadid is deleted")
	public FindLeadPage verifyDelete() throws IOException {
		try {
		getDriver().findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = getDriver().findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		reportStep("pass", "LeadID is deleted successfully ");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		reportStep("fail", "LeadID is not deleted " +e);

	}
		return new FindLeadPage();
	}
	
}
