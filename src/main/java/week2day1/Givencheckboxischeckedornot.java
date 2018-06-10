package week2day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Givencheckboxischeckedornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isChecked=true;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");	
		//		driver.manage().window().maximize();
		/*	WebElement checkbox = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[1]/input[1]");
		checkbox.click();
		 */
		
    	driver.findElementByXPath("//*[@id='contentblock']/section/div[2]/input").click();
		
		boolean ans = driver.findElementByXPath("//*[@id='contentblock']/section/div[2]/input").isSelected();
		boolean i = ans;
		if(ans=i)
		{
		System.out.println("Check box is selected..");
		}
		else
		{
		System.out.println("Check box is Unselected..");
		}
		
	}


}
