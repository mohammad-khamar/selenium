package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S41_POM_LoginPage 
{
	//Declaration
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
	
	//Initialization
	public S41_POM_LoginPage(WebDriver driver)   //Constructor
	{
		PageFactory.initElements(driver,this);
	}
	//Utilization
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
	public void setPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void clickLogin()
	{
		loginBTN.click();
	}
	
	
	
	/*
	  public void login(String un, String pw) 
	  {
	   	unTB.sendKeys(un);
	 	pwTB.sendKeys(pw);
	  	loginBTN.click(); 
	  }
	 */
}


