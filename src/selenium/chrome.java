package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args) throws InterruptedException  
	{
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demo.actitime.com/login.do");
		
		
		Thread.sleep(2000);
		
		driver.quit();
				

	}

}
