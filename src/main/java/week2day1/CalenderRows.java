package week2day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderRows {

	public static void main(String[] args) {
		// Launch Chrome//
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		//Login Enter User Name
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Password
		driver.findElementById("password").sendKeys("crmsfa");
		//Click Login
		driver.findElementByClassName("decorativeSubmit").click();
		//OpenCRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
		//Create Lead
		driver.findElementByLinkText("Create Lead").click();
		//calender rows
		driver.findElementById("createLeadForm_birthDate-button").click();
		List<WebElement> daysrow = driver.findElementsByClassName("daysrow");
		//System.out.println(daysrow.size());
		WebElement daysrow1=daysrow.get(4);
		List<WebElement> day = daysrow1.findElements(By.className("day"));
		day.get(2).click();
	}

}
