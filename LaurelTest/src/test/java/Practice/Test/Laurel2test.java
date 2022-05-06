package Practice.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Laurel2test extends LaurelTest{
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "E:\\Chrome99\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://stores.purplestores.in/demo_spangle/");
	
	Laurel2 obj = new Laurel2(driver);
	obj.Login().click();
//	obj.SignUp().click();
	obj.Email().sendKeys("akhilesh.b007@gmail.com");
	obj.Password().sendKeys("1234567890");
	obj.Submit().click();
	
	
}}
