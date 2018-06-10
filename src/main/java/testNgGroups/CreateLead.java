package testNgGroups;

import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{

	@Test(groups= "smoke")
	public void createLead() {	
//		login();
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), "TestLeaf");
		type(locateElement("id", "createLeadForm_firstName"), "Gnanam");
		type(locateElement("id", "createLeadForm_lastName"), "Krishnamoorthy");
		type(locateElement("id", "createLeadForm_primaryEmail"), "gnanam@testleaf.com");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "9597704568");
		click(locateElement("name", "submitButton"));
//		closeApp();
		
	}
}












