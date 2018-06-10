package week2day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindMultibleElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver();		 
		driver.manage().window().maximize(); 
		driver.get("http://www.crystalcruises.com/travel-calendar?year=2018"); 
		List<WebElement> elements = driver.findElementsByLinkText("REQUEST A QUOTE");
		int size = elements.size();
		System.out.println(size);
		WebElement click = elements.get(1);
		click.click();
		
		

	}

}
