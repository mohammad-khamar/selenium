package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testngdemo 
{
	final int i=3;// it should be a constant if you are using this variable for invocationCount
	@Test
	public void A()
	{
		Reporter.log("My name is Sudeer");//it will write this information only in html repot 
		Reporter.log("Automation trainer",true);//it will write this information in both console and html repot 
		Reporter.log("Selenium WebDriver",false);//it will write this information only in html repot 
	
	}
	@Test(invocationCount=i)
	public void B()
	{
		Reporter.log("Test2 method",true);//it will write this information in both console and html repot 	
	}
}



