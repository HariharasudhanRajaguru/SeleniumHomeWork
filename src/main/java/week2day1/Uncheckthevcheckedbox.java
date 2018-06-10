package week2day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Uncheckthevcheckedbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
	boolean select = driver.findElementByXPath("//*[@id='contentblock']/section/div[2]/input").isSelected();
	System.out.println(select);
	if(select=true)
	{
	driver.findElementByXPath("//*[@id='contentblock']/section/div[2]/input").click();;
	System.out.println("Check box is unselected");
	}
	}
}
