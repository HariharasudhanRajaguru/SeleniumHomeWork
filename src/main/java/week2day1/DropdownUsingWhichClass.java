package week2day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownUsingWhichClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();

		/*System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 */
		driver.get("http://leaftaps.com/crmsfa/control/createLeadForm;jsessionid=6EBE359795EEAF189D6571AF5EDCB54C.jvm1");	
		
		
//		List<WebElement> elemen = driver.findElementsByXPath;
        
//		for (WebElement all : elemen) {
			
//			System.out.println(all.getText());
			
//		}
	}

}
