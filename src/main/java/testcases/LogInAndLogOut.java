package testcases;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class LogInAndLogOut extends SeMethods{

	@Test
	public void login() {
		startApp("chrome", "http://leaftaps.com/opentaps");	
		WebElement uName = locateElement("id", "username");
		type(uName, "DemoSalesManager");
		WebElement pwd = locateElement("id", "password");
		type(pwd, "crmsfa");
		WebElement loginButton = locateElement("class", "decorativeSubmit");
		click(loginButton);
		WebElement lnkTxt = locateElement("linktext", "CRM/SFA");
		click(lnkTxt);
//		closeAllBrowsers();
		WebElement lnkTxt1 = locateElement("linktext", "Create Lead");
		click(lnkTxt1);
		WebElement compName = locateElement("id", "createLeadForm_companyName");
		type(compName, "Clarisys Technology");
		WebElement firName = locateElement("id", "createLeadForm_firstName");
		type(firName, "Hariharasudhan");
		WebElement surName = locateElement("id", "createLeadForm_lastName");
		type(surName, "Rajaguru");
		WebElement selSou = locateElement("id", "createLeadForm_dataSourceId");
		//click(selSou);
		selectDropDownUsingText(selSou, "Direct Mail");
		WebElement selsou1 = locateElement("id", "createLeadForm_marketingCampaignId");
		//click(selsou1);
		selectDropDownUsingIndex(selsou1, 2);
		WebElement createLeadbtn = locateElement("class", "smallSubmit");
		click(createLeadbtn);
		
		WebElement fLeads = locateElement("linktext","Find Leads");
		click(fLeads);
		
		
		WebElement edit = locateElement("linktext", "Edit");
		click(edit);
		WebElement edit1 = locateElement("id", "updateLeadForm_firstName");
		edit1.clear();
		type(edit1, "harish");
		WebElement upDate = locateElement("class", "smallSubmit");
		click(upDate);
		
	}



}
