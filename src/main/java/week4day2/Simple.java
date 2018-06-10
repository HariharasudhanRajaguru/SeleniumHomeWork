package week4day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Simple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");

		ChromeOptions op =new ChromeOptions();

		op.addArguments("--disable-notifications");



		ChromeDriver driver= new ChromeDriver(op);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElementById("email").sendKeys("cyril.gnanam@gmail.com",Keys.TAB);
		
		driver.findElementById("pass").sendKeys("krishnamoorthy");
		
		driver.findElementByXPath("//input[@type='submit']").click();
		
		driver.findElementByClassName("_1frb").sendKeys("TestLeaf");
		
		
		
		driver.findElementByXPath("//button[@class='_42ft _4jy0 _4w98 _4jy3 _517h _51sy _4w97']/i").click();
		
		driver.findElementByXPath("(//div[text()='TestLeaf'])[1]").click();
		
		driver.findElementByXPath("(//div[@class='_51xa _5hgz']/button)[1]").click();
		
		Thread.sleep(1000);
		
		driver.findElementByXPath("//a[@class='_42ft _5upp _50zy layerCancel _51-t _50-0 _50z-']").click();
		
		
		driver.findElementByXPath("(//span[text()='Reviews'])[1]").click();
		
		WebElement reviews = driver.findElementByXPath("//div[contains(text(),'reviews')]");
		
		String text = reviews.getText();
		
		System.out.println(text);
		
		




	}

}
