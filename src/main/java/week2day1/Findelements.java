package week2day1;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Findelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		List<WebElement> electall = driver.findElementsByClassName("select");
		
		for (WebElement nex : electall) {
			
			System.out.println(nex);
			
		}
		
//		int size = electall.size();
//		
//		System.out.println(size);
//		
//		String lectall = electall.toString();
		
//		System.out.println(lectall);
	}

}
