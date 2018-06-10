package week3day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class DealWithmultiplewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");		
		ChromeDriver driver= new ChromeDriver();		
		//Calling Url
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Contact Us").click();
		
		Set<String> handles = driver.getWindowHandles();
		
		int size = handles.size();
		
		System.out.println(size);
		
		List<String> handles1 = new ArrayList<String>();
		
		handles1.addAll(handles);
		
		String secWindow = handles1.get(1);
		//String secWindow = driver.getWindowHandle();
		
		driver.switchTo().window(secWindow);
		
		System.out.println(driver.getCurrentUrl());
		
		//driver.close();
		
		String First = handles1.get(0);
		
		driver.switchTo().window(First);
		
		System.out.println(driver.getCurrentUrl());

		driver.quit();

	}

}
