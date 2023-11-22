package com.testcases;

import org.testng.annotations.BeforeTest;

import com.base.ProjectSpecificMethod;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="./src/main/java/com/feature/TC003_EditLead.feature", glue={"com.pages.helper"}, monochrome=true, publish=true)
public class EditLead extends ProjectSpecificMethod{
	@BeforeTest
	public void setValues() {
		testName = "Edit Lead Functionality";
		testDessc = "Edit Lead Details";
		author = "Sandhiya";
		category = "Smoke";
		//System.out.println("scenario name is "+scenarioName);
	}
}
