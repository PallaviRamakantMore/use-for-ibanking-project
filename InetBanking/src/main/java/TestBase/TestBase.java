package TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	public WebDriver driver;
	
	@BeforeTest
	@Parameters({"brname","appUrl"})
	
	public void setUp(@Optional("chrome") String browser,
			@Optional("https://demo.guru99.com/v4/index.php") String url)
	{
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver();
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@AfterMethod
	public void tearDown()
	{
		 try
			{
				 Thread.sleep(5000);
			 }
			catch (InterruptedException  e)
			{
				e.printStackTrace();
			}
		 
	//	 driver.quit();
	}

	
}