package Generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class General {
	public WebDriver driver;
	@BeforeMethod
	public void start()
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@AfterMethod
	public void end(ITestResult res) throws IOException
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			Generic_photo.photo(driver);
		}
		driver.close();
	}

}
