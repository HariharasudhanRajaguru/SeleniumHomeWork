package week3day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mongodb.operation.ListCollectionsOperation;

public class MergeLeadHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Leads").click();
	driver.findElementByLinkText("Merge Leads");
	*/
		
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
//		driver.findElementByLinkText("Create Lead").click();
		
//		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Merge Leads").click();
		
		driver.findElementByXPath(" //table[@id='widget_ComboBox_partyIdFrom']/following-sibling::a ").click();
		
		Set<String> window = driver.getWindowHandles();
		
	    List<String> window1= new ArrayList<String>();	
	    
	    window1.addAll(window);
	    
	    for (String all : window1) {
	    	
	    	System.out.println(all);
			
		}
	    
	    String secWindow = window1.get(1);
	    
	    driver.switchTo().window(secWindow);
		
		System.out.println(driver.getTitle());
		
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'] //a").click();
		
		String fstWindow = window1.get(0);
		
		driver.switchTo().window(fstWindow);
		
		driver.findElementByXPath("//a[@class='buttonDangerous']").click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		driver.findElementByXPath("//ul[@class='shortcuts']/li[3]/a").click();
		
		driver.findElementByName("id").sendKeys("123455");
		
		driver.findElementByLinkText("Find Leads").click();
		
		
		
//		driver.findElementByLinkText("Find Leads");
		
//		driver.quit();
		
		
		
	
	}

}
