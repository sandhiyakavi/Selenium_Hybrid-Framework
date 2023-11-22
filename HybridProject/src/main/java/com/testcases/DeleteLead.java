package com.testcases;

import org.testng.annotations.BeforeTest;

import com.base.ProjectSpecificMethod;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="./src/main/java/com/feature/TC004_DeleteLead.feature", glue={"com.pages.helper"}, monochrome=true, publish=true)
public class DeleteLead extends ProjectSpecificMethod{
	@BeforeTest
	public void setValues() {
		testName = "Delete Lead Functionality";
		testDessc = "Delete Lead Details";
		author = "Sandhiya";
		category = "Smoke";
		//System.out.println("scenario name is "+scenarioName);
	}
}
