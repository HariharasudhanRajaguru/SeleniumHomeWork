package week2day1;

import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LoginAutomation {

	@Test
	public  void main() {
		//Launch Chrome Browser//
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Calling Url Test Leaf//
		driver.get("http://leaftaps.com/opentaps/control/main");
		//			//Logo Size//
		//		WebElement img = driver.findElementByTagName("img");
		//		System.out.println(img.getSize());
		//User Name//
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Password//
		driver.findElementById("password").sendKeys("crmsfa");
		//Login
		driver.findElementByClassName("decorativeSubmit").click();
		//Clicking CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
		//Create Lead
		driver.findElementByLinkText("Create Lead").click();
		driver.close();
		//Company Name
		driver.findElementById("createLeadForm_companyName").sendKeys("Tata Consultansy");
		//Assign First Name
		driver.findElementById("createLeadForm_firstName").sendKeys("Gnanaprakasam");
		//Assign Surname
		driver.findElementById("createLeadForm_lastName").sendKeys("Krishnamoorthy");
		//Create Lead
		//		driver.findElementByName("submitButton").click();
		//Source Select By Visible Text
		WebElement text = driver.findElementById("createLeadForm_dataSourceId");
		Select Source = new Select(text);
		Source.selectByVisibleText("Existing Customer");
		//Mark Select By Index
		WebElement Mark = driver.findElementById("createLeadForm_marketingCampaignId");
		Select Mak = new Select(Mark);
		Mak.selectByIndex(1);
		//Show All Dropdown by list & Count
		WebElement ind = driver.findElementById("createLeadForm_industryEnumId");
		Select inds = new Select(ind);
		System.out.println(inds.getOptions().size());
		List<WebElement> items = inds.getOptions();
		for (WebElement alltheitems : items) {
			System.out.println(alltheitems.getText());
		}		
	}

}

