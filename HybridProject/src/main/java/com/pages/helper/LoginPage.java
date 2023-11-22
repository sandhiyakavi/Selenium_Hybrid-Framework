package com.pages.helper;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.base.ProjectSpecificMethod;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethod {
	
	@Given("Enter the username as {string}")
	public LoginPage enterUsername(String username) throws IOException {
		try {
			getDriver().findElement(By.id("username")).sendKeys(username);
			reportStep("pass", "Username is entered Successfully ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("fail", "Username is not entered Successfully " +e);

		}
		return new LoginPage();
	}
	@Given("Enter the password as {string}")	
	public LoginPage enterPassword(String password) throws IOException {
		try {
			getDriver().findElement(By.id("password")).sendKeys(password);
			reportStep("pass", "Password is entered Successfully ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("fail", "Password is not entered Successfully " +e);
		}
		return new LoginPage();
	
	}
	
	
	@When("click on the login button")
	public WelcomePage clickLogin() throws IOException {
		try {
			getDriver().findElement(By.className("decorativeSubmit")).click();
			reportStep("pass", "Login button is clicked Successfully ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			reportStep("fail", "Login button is not clicked Successfully "+e);
		}
		return new WelcomePage();
		
	}
	
	


}
