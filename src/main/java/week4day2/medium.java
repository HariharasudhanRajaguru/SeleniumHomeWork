package week4day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class medium{

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");

		ChromeOptions op =new ChromeOptions();

		op.addArguments("--disable-notifications");



		ChromeDriver driver= new ChromeDriver(op);


		driver.get("https://www.myntra.com/");



		driver.manage().window().maximize();

		driver.findElementByClassName("desktop-searchBar").sendKeys("Sunglasses");

		driver.findElementByXPath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']").click();

		List<WebElement> listOfBrand = driver.findElementsByXPath("//div[@class='product-brand']");

		//		WebElement listOfBrand = driver.findElementByXPath("//div[@class='product-brand']");

		//		Set set= new HashSet(listOfBrand);

		Set<String> set = new HashSet<String>();



		for (WebElement options : listOfBrand) {

			String brands = options.getText();

			set.add(brands);



		}

		System.out.println(set);

		List<WebElement> offBrands = driver.findElementsByXPath("//span[text()='(40% OFF)']");

		System.out.println("Count of 40% off sunglasses is :"+offBrands.size());


		List<WebElement> unisex = driver.findElementsByXPath("//div[@class='product-productMetaInfo']");

		int count=0;

		for (WebElement all : unisex) {

			String text = all.getText();

			if (text.contains("40%") && text.contains("Unisex")) {

				count++;


			}

		}
		System.out.println("40%off & unisexGlasses count is: "+count);
		/*driver.getKeyboard().sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@data-colorhex='green']/label/input"))).click();
		*///		driver.findElementByXPath("//input[@value='green']").click();
		
		driver.findElementByXPath("//li[@data-colorhex='green']");
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",col);
		//col.click();
		
		driver.findElementByXPath("(//li[@class='product-base'])[2]").click();
		
		WebElement pname = driver.findElementByXPath("//h1[@class='pdp-title']");
		String name = pname.getText();
		System.out.println(name);
		
		WebElement price = driver.findElementByXPath("//p[@class='pdp-selling-price']/strong");
		String pricee = price.getText();
		System.out.println(pricee);
		
		
		driver.findElementByXPath("//button[@class='pdp-add-to-bag pdp-button']").click();
		
		Thread.sleep(1000);
		
		driver.findElementByXPath("//a[@class='pdp-goToCart pdp-add-to-bag pdp-button']/span[2]").click();
		
		WebElement verifyName = driver.findElementByXPath("//div[@class='prod-name']");
		String vfname = verifyName.getText();
		System.out.println(vfname);
		
		WebElement verifyPrice = driver.findElementByXPath("//div[@class='c-dblue total-rupees']");
		String priceee = verifyPrice.getText();
		System.out.println(priceee);
		
		
		
		if(name.equalsIgnoreCase(vfname)&&(pricee.equalsIgnoreCase(priceee)))
		{
			System.out.println("verified successfully");
			
		}else {
			System.out.println("mismatch");
		}
		
		driver.close();
		
		

	}










}


