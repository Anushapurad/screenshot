package Generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Generic_photo {
	
	@Test
	public static void photo(WebDriver driver) throws IOException
	{
		String pic="./Photos/";
		Date d=new Date();
		String d1 = d.toString();
		String d2=d1.replaceAll(":", "-");
		TakesScreenshot ts=(TakesScreenshot)driver;
        File Src = ts.getScreenshotAs(OutputType.FILE);
        File dst=new File(pic+d2+".jpeg");
        FileHandler.copy(Src, dst);
		
		
	}

}
