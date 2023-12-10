package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.configuration.ConfigurationManager;
import com.utilities.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;




// TODO: Auto-generated Javadoc
/**
 * Class : ProjectSpecificMethod
 * author: Sandhiya
 */
public class ProjectSpecificMethod extends AbstractTestNGCucumberTests{
	

/** The file name. */
public String fileName;

/** The properties. */
public static Properties properties;

/** The extent. */
public static ExtentReports extent;

/** The node. */
public static ExtentTest test,node;

/** The category. */
public String testName, testDessc, author, category;

/** The scenario name. */
public static String scenarioName;

/** The Constant tlsdriver. */
private static final ThreadLocal<RemoteWebDriver> tlsdriver=new ThreadLocal<RemoteWebDriver>();



	/**
	 * Gets the driver.
	 *
	 * @return the driver
	 */
	public static RemoteWebDriver getDriver() {
	return tlsdriver.get();
}
	
	/**
	 * Sets the driver.
	 */
	public static void setDriver() {
		tlsdriver.set(new ChromeDriver());
	}


	/**
	 * Pre condition.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@BeforeMethod
	public void preCondition() throws IOException {
		//public void preCondition(String language) throws IOException {
		node = test.createNode(testName);
		
		//driver = new ChromeDriver();
		setDriver();
		getDriver().manage().window().maximize();
		getDriver().get(ConfigurationManager.configuration().getAppURL());
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT));

	}
	
	/**
	 * Post condition.
	 */
	@AfterMethod
	public void postCondition() {
		getDriver().close();
	}
	
	/**
	 * Send data.
	 *
	 * @return the string[][]
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
//	@DataProvider(name="fetchData",indices= {0})
//	public String[][] sendData() throws IOException{
//		String[][] data= ReadExcel.readData(fileName);
//		return data;
//	}

	/**
	 * Start report.
	 */
	@BeforeSuite
	public void startReport() {
		 ExtentHtmlReporter reporter = new ExtentHtmlReporter(Constants.REPORT_URL);
	        // to keep the report history
	        reporter.setAppendExisting(true);
	        // Create object for ExtentReports
	         extent = new ExtentReports();
	        // attach data with physical path
	        extent.attachReporter(reporter);
	}
	
	/**
	 * Test details.
	 */
	@BeforeClass
	public void testDetails() {
//		 testName = "Login Functionality";
//		 testDessc = scenarioName;
//		 author = "Sandhiya";
//		 category = "Smoke";

		test = extent.createTest(testName,testDessc);
		test.assignCategory(category);
        test.assignAuthor(author);
	}
	
	/**
	 * Take snap.
	 *
	 * @return the int
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public int takeSnap() throws IOException {
		int random = (int) (Math.random() * 999);
		File screenshotAs = getDriver().getScreenshotAs(OutputType.FILE);
		File destnfile = new File("./snap/shot" + random + ".jpg");// empty
		FileUtils.copyFile(screenshotAs, destnfile);
		return random;
	}
	
	/**
	 * Report step.
	 *
	 * @param status the status
	 * @param message the message
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void reportStep(String status, String message) throws IOException {
		if (status.equalsIgnoreCase("pass")) {
			node.pass(message);
//			node.pass(message,
//					MediaEntityBuilder.createScreenCaptureFromPath(".././snap/shot" + takeSnap() + ".jpg").build());
		} else if (status.equalsIgnoreCase("fail")) {
			node.fail(message,
					MediaEntityBuilder.createScreenCaptureFromPath(".././snap/shot" + takeSnap() + ".jpg").build());
		}

	} 
	
	/**
	 * End report.
	 */
	@AfterSuite
	public void endReport() {
		extent.flush();
	}
	

	

}

