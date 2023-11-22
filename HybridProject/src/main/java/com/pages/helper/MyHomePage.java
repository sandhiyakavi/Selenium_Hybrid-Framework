package com.pages.helper;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.ProjectSpecificMethod;

import io.cucumber.java.en.When;

public class MyHomePage extends ProjectSpecificMethod {

	/*
	 * public MyHomePage(ChromeDriver driver) { this.driver=driver; }
	 */
	@When("click on the Leads link")
	public LeadsPage clickLeads() throws IOException {
		try {
			getDriver().findElement(By.linkText("Leads")).click();
			reportStep("pass", "Leads link in the My Homepage is clicked ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("fail", "Leads link in the My Homepage is not clicked " + e);

		}
		return new LeadsPage();
	}

}
