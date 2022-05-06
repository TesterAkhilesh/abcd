package Practice.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Laurel {

	WebDriver driver;
public Laurel(WebDriver driver)
{
	this.driver= driver;
	PageFactory.initElements(driver, this);
}

@FindBy (xpath = "//input[@id='user-name']")
WebElement textbox;
public WebElement Login()
{
	return textbox;
}

@FindBy (id ="password")
WebElement Password;
public WebElement Pass()
{
	return Password;
	
}

@FindBy (id ="login-button")
WebElement submit;
public WebElement sub()
{
	return submit;
	
}
}
