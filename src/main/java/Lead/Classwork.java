package Lead;

import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class Classwork extends ProjectMethods{
	@Test(invocationCount = 2)
	public void createLead() {	
		login();
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), "TestLeaf");
		type(locateElement("id", "createLeadForm_firstName"), "Gopinath");
		type(locateElement("id", "createLeadForm_lastName"), "Jayakumar");
		type(locateElement("id", "createLeadForm_primaryEmail"), "gopinath@testleaf.com");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "9597704568");
		click(locateElement("name", "submitButton"));
		closeApp();


	}

	@Test (dependsOnMethods = "createLead")
	public void editLead() throws InterruptedException {
		login();
		click(locateElement("linkText", "Leads"));
		click(locateElement("linkText", "Find Leads"));
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"), "Gopinath");
		click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
		Thread.sleep(3000);
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		verifyTitle("View Lead | opentaps CRM");
		click(locateElement("xpath", "//a[contains(text(),'Edit')]"));
		selectDropDownUsingText(locateElement("id", "updateLeadForm_industryEnumId"), "Computer Software");
		click(locateElement("xpath", "//input[@class='smallSubmit']"));	
		closeApp();
	}

}



