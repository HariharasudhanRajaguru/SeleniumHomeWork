package week2day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://erail.in/");
		driver.manage().window().maximize();	
		//From Station
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS", Keys.TAB);
		//To Station
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("MDU", Keys.TAB);
		//Check Select Date Only
//		System.out.println(driver.findElementById("chkSelectDateOnly").isSelected());
		boolean selected = driver.findElementById("chkSelectDateOnly").isSelected();
		if(selected)
		{
			driver.findElementById("chkSelectDateOnly").click();
		}
		WebElement table = driver.findElementByXPath("//*[@id='divTrainsList']/table[1]");
		List<WebElement> row = table.findElements(By.tagName("tr"));
		System.out.println(row.size());
		WebElement rows = row.get(0);
		List<WebElement> cols = rows.findElements(By.tagName("td"));
		WebElement colu = cols.get(1);
		System.out.println(colu.getText());
			
	}

}
