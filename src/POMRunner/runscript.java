package POMRunner;


import org.testng.annotations.Test;

import Generic.General;
import POMScripts.script;

public class runscript extends General{
	
	@Test
	public void login()
	{
	  script s=new script(driver);
	  s.passdata("anusha");
	  s.passdata("2323");
	  //Assert.fail();
	}

}
