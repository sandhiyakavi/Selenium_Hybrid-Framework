package com.pages.helper;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.ProjectSpecificMethod;

import io.cucumber.java.en.When;

public class LeadsPage  extends ProjectSpecificMethod{
	
	/*
	 * public LeadsPage() { this.driver=driver; }
	 */
	@When("click on the Create Lead link")
	public CreateLeadPage clickCreateLead() throws IOException {
		try {
		getDriver().findElement(By.linkText("Create Lead")).click();
		reportStep("pass", "Clicked the Create Lead Link in the LeadsPage ");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		reportStep("fail", "Not able to click the Create Lead Link in the LeadsPage " +e);

	}
		return new CreateLeadPage();
	}
	
	@When("Click on the Find Leads link")
	public FindLeadPage clickFindLeads() throws IOException {
		try {
		getDriver().findElement(By.xpath("//a[text()='Find Leads']")).click();
		reportStep("pass", "Clicked the Find Lead Link in the LeadsPage ");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		reportStep("fail", "Not able to click the Find Lead Link in the LeadsPage " +e);

	}

		return new FindLeadPage();
		}
	

}
