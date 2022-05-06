package Practice.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Laurel2 {

	WebDriver driver;
public Laurel2(WebDriver driver)
{
	this.driver= driver;
	
}
By Login= By.xpath("//*[@class= 'h-login-label']");
By SignUp = By.xpath("//*[@class= 'create_account_popup_link']");
By Email = By.xpath("//body/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/form[1]/div[1]/div[4]/input[2]");
By Password =By.xpath("//*[@id=\"login_popup_form\"]/div/div[5]/input");
By Submit = By.xpath("//*[@type='submit']");
public WebElement Login()
{
	return driver.findElement(Login);
	
}
public WebElement SignUp()
{
	return driver.findElement(SignUp);
	
}
public WebElement Email()
{
	return driver.findElement(Email);
	
}
public WebElement Password()
{
	return driver.findElement(Password);
	
}
public WebElement Submit()
{
	return driver.findElement(Submit);
	
}
}