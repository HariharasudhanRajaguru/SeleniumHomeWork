package week2day1;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindinglinksinIRCTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		launching chrome

		int result = 0;

		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();

		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");

		List<WebElement> links = driver.findElementsByTagName("a");

		for(WebElement alllinks : links) 
		{
			String link = alllinks.getText();
			if (link.contains("a")) 
//			{
				result++;	
				System.out.println(link);
//			}
		}
		System.out.println(result);


	}
}







