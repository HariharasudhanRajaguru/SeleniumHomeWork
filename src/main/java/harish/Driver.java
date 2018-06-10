package harish;

import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
	    ChromeDriver driver= new ChromeDriver();
	    driver.get("https://stackoverflow.com/questions/28366463/chrome-driver-with-selenium-render-error");
	    driver.manage().window().maximize();

	}

}
