package week2day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch Chrome Browser//
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Calling Url
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		//Maximize
		driver.manage().window().maximize();
		int i=0;
		//Username
		driver.findElementById("userRegistrationForm:userName").sendKeys("Gnanaprakasam");
		//Password
		driver.findElementById("userRegistrationForm:password").sendKeys("Krishnamoorthy");
		//Confirm Password
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Krishnamoorthy");
		//Security Questions
		WebElement SecurityQ = driver.findElementById("userRegistrationForm:securityQ");
		Select SectyQ = new Select(SecurityQ);
		SectyQ.selectByIndex(1);
		//Security Answer
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Prakash");
		//Language
		WebElement lang = driver.findElementById("userRegistrationForm:prelan");
		Select lan = new Select(lang);
		lan.selectByVisibleText("English");
		//First/Middle/Last Name
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Gnana");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("prakasam");
		driver.findElementById("userRegistrationForm:lastName").sendKeys(".K");
		//Gender
		driver.findElementById("userRegistrationForm:gender:0").click();
		//Marital Status
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		//Date of Birth(Date)
		WebElement Date = driver.findElementById("userRegistrationForm:dobDay");
		Select Dat = new Select(Date);
		Dat.selectByVisibleText("23");
		//Date of Birth(Month)
		WebElement month = driver.findElementById("userRegistrationForm:dobMonth");
		Select mon = new Select(month);
		mon.selectByIndex(10);
		//Date of Birth(Year)
		WebElement year = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select yea = new Select(year);
		yea.selectByVisibleText("1989");
		//Occupation
		WebElement occup = driver.findElementById("userRegistrationForm:occupation");
		Select occu = new Select(occup);
		occu.selectByVisibleText("Professional");
		//Aadhar Card No
		driver.findElementById("userRegistrationForm:uidno").sendKeys("9876543210");
		//PAN Card No
		driver.findElementById("userRegistrationForm:idno").sendKeys("0123456789");
		//Country
		WebElement country = driver.findElementById("userRegistrationForm:countries");	
		Select cnty = new Select(country);	
		List<WebElement> cnt = cnty.getOptions();
		for (WebElement options : cnt) 
		{
			if(options.getText().startsWith("E"))
			{
			i++;
			if(i==2)
			{
			System.out.println(options.getText());
			options.click();
			break;
			}
			}			
		}
//		cnty.selectByValue("55");
//		cnty.selectByVisibleText("India");
		//Mail Id
		driver.findElementById("userRegistrationForm:email").sendKeys("prakash@gmail.com");
		//Mobile No
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9876543210");
		//Nationality
		WebElement naty = driver.findElementById("userRegistrationForm:nationalityId");
		Select nanolty = new Select(naty);
		nanolty.selectByVisibleText("India");
		//Door No
		driver.findElementById("userRegistrationForm:address").sendKeys("4/23B");
		//Street Name
		driver.findElementById("userRegistrationForm:street").sendKeys("Middle Street");
		//Area
		driver.findElementById("userRegistrationForm:area").sendKeys("Sendurai");
		//Pincode
		driver.findElementById("userRegistrationForm:pincode").sendKeys("621719",Keys.TAB);
		Thread.sleep(3000); 
		//State
		//		driver.findElementById("userRegistrationForm:statesName").sendKeys("Tamil Nadu");
		//City/Town
		WebElement city = driver.findElementById("userRegistrationForm:cityName");
		Select cty = new Select(city);
		cty.selectByVisibleText("Ariyalur");
		Thread.sleep(4000);
		//		Post Office
		WebElement post = driver.findElementById("userRegistrationForm:postofficeName");
		Select pos = new Select(post);
		pos.selectByVisibleText("Adhanakurichi B.O");
		//Landline
		driver.findElementById("userRegistrationForm:landline").sendKeys("04142248622");		
		//Copy Residense to office address
		driver.findElementById("userRegistrationForm:resAndOff:0").click();
		//Textid
//		driver.findElementById("nlpAnswer").sendKeys("JGS3");
		//SubScription to Irctc
		driver.findElementById("userRegistrationForm:newsletter:1").click();
		driver.findElementById("userRegistrationForm:commercialpromo:1").click();
		driver.findElementById("userRegistrationForm:irctcsbicard:0").click();
		//Submit
		driver.findElementById("c").click();
	}

}
