package Practice.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LaurelTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Chrome99\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	String path =System.getProperty("user.dir")+ "\\reports\\index.html";
	ExtentSparkReporter rep = new ExtentSparkReporter(path);
	rep.config().setReportName("Web Automation Report");
	rep.config().setDocumentTitle("sauce demo test");
	
	
	ExtentReports ex = new ExtentReports();
	ex.attachReporter(rep);
	ex.setSystemInfo("Laurel Pereira", "TESTER");
	Laurel obj = new Laurel(driver);
	obj.Login().click();
	ex.createTest("Text Box");
	obj.Login().sendKeys("standard_user");
	obj.Password.click();
	ex.createTest("Password");
	obj.Password.sendKeys("secret_sauce");
	ex.createTest("Submit");
   obj.sub().click();
   
   ex.flush();
}
}
