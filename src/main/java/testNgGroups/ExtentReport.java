package testNgGroups;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	public static void main(String[] args) throws IOException {
		
		ExtentHtmlReporter html = new ExtentHtmlReporter("./report/result1.html");
		html.setAppendExisting(true);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		ExtentTest test = extent.createTest("TC--01.CreateLead", "Create A New LeafTaps");
		test.assignCategory("smoke");
		test.assignAuthor("Prakash");
		test.pass("Username Entered Succesfully",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
		test.pass("Password Enterer Succesfully",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img0.png").build());
		test.pass("Login Button Clicked  Succesfully",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img9.png").build());
		extent.flush();
		}

}
