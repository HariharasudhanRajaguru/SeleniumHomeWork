package week2day1;

import java.util.List;

import org.junit.internal.runners.model.EachTestNotifier;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		
		/*WebElement add = driver.findElementByTagName("select");
		
		String val = add.getText();
		
		System.out.println(val);
		*/
		
		
		List<WebElement> allval = driver.findElementsByTagName("select");

        for (WebElement val : allval) {
        	
        	String drops = val.getText();
        	
        	System.out.println(drops);
			
		}
		
	}

}
