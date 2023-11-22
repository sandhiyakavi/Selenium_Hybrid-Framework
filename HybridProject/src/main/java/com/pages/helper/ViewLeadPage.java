package com.pages.helper;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.ProjectSpecificMethod;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewLeadPage extends ProjectSpecificMethod {
	
	/*
	 * public ViewLeadPage() { this.driver=driver; }
	 */
	@Then("Viewleadpage is displayed")
	public ViewLeadPage checkPageTitle() throws IOException {
		try {
		String pageTitle=getDriver().getTitle();
		if(pageTitle.contains("View Lead")) {
			System.out.println("The page is correctly displayed");
		}
		else {
			System.out.println("The page is not correctly displayed");
		}
		reportStep("pass", "View Lead page is displayed ");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		reportStep("fail", "View Lead page is not displayed " +e);

	}
		return new ViewLeadPage();
	}
	
	@When("Click on the Edit button")
	public EditLeadPage clickEditBtn() throws IOException {
		try {
		getDriver().findElement(By.linkText("Edit")).click();
		reportStep("pass", "Edit button in the View Lead page is clicked ");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		reportStep("fail", "Edit button in the View Lead page is not clicked " +e);

	}
		return new EditLeadPage();
		
	}
	
	@When("Click on the Delete button")
	public FindLeadPage clickDeleteBtn() throws IOException {
		try {
		getDriver().findElement(By.linkText("Delete")).click();
		reportStep("pass", "Delete button in the View Lead page is clicked ");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		reportStep("fail", "Delete button in the View Lead page is not clicked " +e);

	}
		return new FindLeadPage();
	}

}
