package com.pages.helper;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.ProjectSpecificMethod;

import io.cucumber.java.en.When;

public class CreateLeadPage  extends ProjectSpecificMethod{
	
	//to make driver accessible across all classes else null pointer exception occurs
	/*
	 * public CreateLeadPage() { this.driver=driver; }
	 */
	By companyNameID =By.id("createLeadForm_companyName");
	
	@When("Enter the company name as {string}")
	public CreateLeadPage typeCompanyName(String cName) throws IOException {
		try {
		getDriver().findElement(companyNameID).sendKeys(cName);
		reportStep("pass", "Entered the Company name");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("fail", "Not able to enter the company name "+e);
		}  
		return new CreateLeadPage();
	}
	
	@When("Enter the first name as {string}")
	public CreateLeadPage typeFirstName(String fName) throws IOException {
		try {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		reportStep("pass", "Entered the First name");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("fail", "Not able to enter the first name "+e);
		}  
		return new CreateLeadPage();
	}
	
	@When("Enter the last name as {string}")
	public CreateLeadPage typeLastName(String lName) throws IOException {
		try {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		reportStep("pass", "Entered the Last name");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("fail", "Not able to enter the last name "+e);
		} 
		return new CreateLeadPage();
	}
	
	@When("click on create button")
	public ViewLeadPage clickCreateLeadbtn() throws IOException {
		try {
		getDriver().findElement(By.name("submitButton")).click();
		reportStep("pass", "Clicked the Create button in CreateLead page");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("fail", "Not able to click the Create button in CreateLead page "+e);
		} 
		return new ViewLeadPage();
	}



}
