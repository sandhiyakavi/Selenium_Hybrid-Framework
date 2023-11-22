package com.pages.helper;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.ProjectSpecificMethod;

import io.cucumber.java.en.When;

public class EditLeadPage extends ProjectSpecificMethod{
	
	@When("Update the company name as {string}")
	public EditLeadPage updateCompanyName(String companyName) throws IOException {
		try {
		WebElement company= getDriver().findElement(By.id("updateLeadForm_companyName"));
		company.clear();
		company.sendKeys(companyName);
		reportStep("pass", "The company name is changed in the field");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("fail", "The company name is not changed in the field " +e);

		}
		return new EditLeadPage();
	}
	
	@When("Click on the update button")
	public ViewLeadPage clickUpdateBtn() throws IOException {
		try {
		getDriver().findElement(By.name("submitButton")).click();
		reportStep("pass", "The Update button is clicked");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("fail", "The Update button is not clicked  " +e);

		}
		return new ViewLeadPage();
	}
	
}
