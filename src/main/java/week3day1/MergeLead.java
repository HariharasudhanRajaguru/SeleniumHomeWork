package week3day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		//	FirefoxDriver driver = new FirefoxDriver();	
		//	driver.get("http://leaftaps.com/opentaps/control/main");
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("//table[@id='widget_ComboBox_partyIdFrom']/following-sibling::a").click();
		Set<String> windows = driver.getWindowHandles();
		List<String> windows1 =new ArrayList<String>();
		windows1.addAll(windows);
		for (String all : windows1) {

			System.out.println(all+driver.getTitle());
		}

		String secWin= windows1.get(1);	
		driver.switchTo().window(secWin);
		System.out.println(driver.getTitle());
		driver.findElementByName("id").sendKeys("10118");
		Thread.sleep(2000);	
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		Set<String> windo = driver.getWindowHandles();
		List<String> windo1= new ArrayList<String>();
		windo1.addAll(windo);
		for (String al : windo1) {

			System.out.println(al);


			String firstwindow = windows1.get(0);
			driver.switchTo().window(firstwindow);
			System.out.println(driver.getTitle());
			driver.findElementByXPath("//table[@id='widget_ComboBox_partyIdTo']/following-sibling::a").click();


			Set<String> win = driver.getWindowHandles();
			List<String> win1 =new ArrayList<String>();
			win1.addAll(win);

			String towindow = win1.get(1);
			driver.switchTo().window(towindow);
			driver.findElementByName("id").sendKeys("10150");
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(3000);
			driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
			
			Set<String> winnew = driver.getWindowHandles();
			List<String> winnew1 =new ArrayList<String>();
			winnew1.addAll(winnew);

			
			String towindw = winnew1.get(0);
			driver.switchTo().window(towindw);
			
			driver.findElementByClassName("buttonDangerous").click();
			
			driver.switchTo().alert().accept();
			
			WebElement errMsg = driver.findElementByClassName("errorMessage");
			String errMess = errMsg.getText();
			System.out.println(errMess);
			driver.close();
			

		}
	}
}
