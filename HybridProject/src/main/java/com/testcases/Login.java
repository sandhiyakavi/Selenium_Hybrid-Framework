package com.testcases;

import org.testng.annotations.BeforeTest;
import com.base.ProjectSpecificMethod;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features="./src/main/java/com/feature/TC001_Login.feature", glue={"com.pages.helper"}, monochrome=true, publish=true)
//tags="@LoginTest") //execute one scenario
// tags="not @Sanity")//ignore the scenario from execution
// tags="@Smoke and @Regression") //check for both the conditions to be
// satisfied
//tags = "@Smoke or @Regression")//If either of the condition is satisfied tags="@sandhiya")//, tags="not @Sandhiya" )
public class Login extends ProjectSpecificMethod{


	@BeforeTest
	public void setValues() {
		testName = "Login Functionality";
		testDessc = "Login using valid credentials";
		author = "Sandhiya";
		category = "Smoke";
		//System.out.println("scenario name is "+scenarioName);
	}
}
