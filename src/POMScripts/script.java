package POMScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class script {

	
	//declaration
	@FindBy(id="email")
	private WebElement uname;
	
	@FindBy(id="pass")
	private WebElement psw;
	
	@FindBy(name="login")
	private WebElement button;
	
	//Initialization
	public script(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
    }
	
	//utilization
	public void passdata(String un) {
		uname.sendKeys(un);
		button.click();
	}
	
	public void password(String pwd) {
		psw.sendKeys(pwd);
		
	}
}
