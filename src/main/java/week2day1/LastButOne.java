package week2day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LastButOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://leafground.com/pages/Dropdown.html");
		int i = 0;
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		WebElement select = driver.findElementById("userRegistrationForm:securityQ");
  
//		WebElement drop1 = driver.findElementById("dropdown1");
		Select dro1=new Select(select);
		List<WebElement> dropp1 = dro1.getOptions();
		int siz = dropp1.size()-2;
		for (WebElement alloption : dropp1) 
		{
			if(i==siz)
			{
			alloption.click();
		    }
			i++;
		}	
		
//		System.out.println(dropp1.size());
//		dro1.selectByIndex(dropp1.size()-2);

	}

}
