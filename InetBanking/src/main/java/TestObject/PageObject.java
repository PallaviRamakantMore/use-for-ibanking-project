package TestObject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject 
{
	public WebDriver driver;
	
	public PageObject (WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[1]/td[2]/input")
	WebElement UserID;
	
	public void UserID()
	{
		UserID.click();
		UserID.clear();
		UserID.sendKeys("mngr448494");
		
	}
	
	public boolean UserIDText()
	
	{
		return UserID.isDisplayed();
	}
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[2]/td[2]/input")
	WebElement Password;
	
	public void Password()
	{
		Password.click();
		Password.clear();
		Password.sendKeys("ynUtemE");
		
	}
	
	public boolean PasswordText()
	
	{
		return Password.isDisplayed();
	}
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[3]/td[2]/input[1]")
	WebElement LOGIN;
	
	public void LOGIN()
	{
		LOGIN.click();
	}
	public boolean LOGINText()
	
	{
		return Password.isDisplayed();
	}
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[3]/td[2]/input[1]")
	WebElement RESET;
	
	public boolean RESETText()
	
	{
		return RESET.isDisplayed();
	}
}
	