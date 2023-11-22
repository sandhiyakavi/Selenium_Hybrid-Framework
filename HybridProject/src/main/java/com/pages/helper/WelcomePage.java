package com.pages.helper;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WelcomePage  extends ProjectSpecificMethod{
	
//	public WelcomePage(ChromeDriver driver) {
//		this.driver=driver;
//	}
	
	@Then("Welcomepage is displayed")
	public void verifyWelcomePg() throws IOException {
		try {
		System.out.println(getDriver().getTitle());
		reportStep("pass", "Welcomepage is displayed ");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		reportStep("fail", "Welcomepage is not displayed " +e);

	}
	} 
	
	@When("click on the CRMSFA link")
	public MyHomePage clickCrmSFA() throws IOException {
		try {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		reportStep("pass", "Clicked  on the CRMSFA linkin the Welcomepage ");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		reportStep("fail", "Not able to click on the CRMSFA linkin the Welcomepage " +e);

	}
		return new MyHomePage();
	}

	public LoginPage clickLogout() throws IOException {
		try {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		reportStep("pass", "Logged out of the application ");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		reportStep("fail", "Not able to log out of the application " +e);

	}
		return new LoginPage();
	}
}
