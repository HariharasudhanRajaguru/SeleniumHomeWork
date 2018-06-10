package week4day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class complex {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		
		driver.findElementByXPath("//button[@class='_2AkmmA _29YdH8']").click();
		
		driver.findElementByXPath("//span[contains(text(),'TVs & Appliances')]").click();
		
		driver.findElementByXPath("(//span[text()='Samsung'])[2]").click();
		
		/*driver.findElementByXPath("//div[@class='_3Njdz7']/button").click();
		driver.findElementByXPath("//li[@class='Wbt_B2']/following::a").click();

		
		driver.findElementByXPath("(//span[text()='Samsung'])[2]").click();
		List<WebElement> min = driver.findElementsByXPath("//div[@class='_1qKb_B']");
		for (WebElement all : min) {
			String text = all.getText();
			System.out.println(text);
			
		}
*/	
		 
		

	}

}
