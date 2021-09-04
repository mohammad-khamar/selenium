package selenium2;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class browseActions 
{

	public static void main(String[] args) throws InterruptedException 
	
	{
	
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");// ucan use "//" also
		//Open the browser
		WebDriver driver=new ChromeDriver();
		
		//WebDriver driver=new FirefoxDriver();
		System.out.println("browser is launched");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		//https://demo.actitime.com/login.do
		driver.get("https://demo.actitime.com/login.do");
		//use the above URL insted of below url
		//driver.get("http://localhost:8080/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Entered the URL in the addressbar of the browser");
		//driver.get("http://demo.actitime.com/");
		
		String title = driver.getTitle();
		System.out.println("Title of the browseris: "+title);
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		System.out.println("Entered the username");
		Thread.sleep(2000);
        driver.findElement(By.name("pwd")).sendKeys("manager");
        System.out.println("Entered the password ");
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//div[text()='Login ']")).click();
        driver.findElement(By.xpath("//div[.='Login ']")).click();
        System.out.println("Clicked on login button");
        Thread.sleep(2000);
        driver.navigate().refresh();
        System.out.println("Refreshed the browser");
        
        Thread.sleep(5000);
        System.out.println("Waited 2 seconds after refresh");
        Thread.sleep(2000);
        WebElement logout = driver.findElement(By.id("logoutLink"));
        String text = logout.getText();
        System.out.println("Got the text of the logout button and the text is :"+text);
      
        logout.click();
        System.out.println("Cliked on logout button");
        Thread.sleep(3000);
        driver.quit();
        System.out.println("Closed the browser");
        
	}
}








