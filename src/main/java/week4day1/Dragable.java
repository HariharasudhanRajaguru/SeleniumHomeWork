package week4day1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch Chrome Browser//
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Calling Url Test Leaf//
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		WebElement demoframe = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(demoframe);
		WebElement dragable = driver.findElementById("draggable");
		Point location = dragable.getLocation();
		System.out.println(location);
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(dragable, 25, 16).release().perform();
		builder.dragAndDropBy(dragable, 17, 8).release().perform();
		



	}

}
