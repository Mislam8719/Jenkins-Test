import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework {

	@Test	
	public void Website_Password() throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe"); // Object command for locating
		// Chrome driver.

		WebDriver driver = new ChromeDriver(); // Object that enables to open the Chrome driver.
		// driver object reference access all the built in function in selenium.

		driver.manage().window().maximize();
		
		driver.get("http://techfios.com/test/?ng=login/");
		
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		driver.findElement(By.name("login")).sendKeys("Sign in");
		
				
		Thread.sleep(2000);
		
		
		//driver.findElement(By.xpath("//a[@class='et_pb_newsletter_button']")).click();
		
		driver.findElement(By.xpath(".//*[@id='side-menu']/li[3]/a/span[1]")).click();// Transaction
		
		driver.findElement(By.xpath(".//*[@id='side-menu']/li[3]/ul/li[1]/a")).click();// New Deposit
		
	   // Select x=new Select(driver.findElement(By.id("select2-account-result-ch4r-Fixed")));
		
		
		//x.selectByVisibleText("checking");
		
		
		//driver.findElement(By.id("select2-account-result-ch4r-Fixed")).sendKeys("checking");
		//driver.findElement(By.xpath(".//*[@id='select2-account-container']")).click(); // Select Account
		//driver.findElement(By.xpath("html/body/span/span/span[1]/input")).sendKeys("checking");
		
		//driver.findElement(By.id("date")).sendKeys("");
		//driver.findElement(By.xpath(".//*[@id='date']")).click(); // Select Date
		driver.findElement(By.xpath(".//*[@id='description']")).sendKeys("Monthly Deposit"); // Description
    	driver.findElement(By.xpath(".//*[@id='amount']")).sendKeys("500.00"); // Select Amount
     	driver.findElement(By.xpath(".//*[@id='submit']")).click(); // Submit
		
		
		
/*		driver.findElement(By.xpath(".//*[@id='select2-account-container']")).click(); // Select Account
		
		driver.findElement(By.xpath(".//*[@id='select2-account-result-939u-checking']")).click(); // Checking
		driver.findElement(By.xpath(".//*[@id='date']")).click(); // Select Date
		driver.findElement(By.xpath(".//*[@id='description']")).click(); // Description
    	driver.findElement(By.xpath(".//*[@id='amount']")).click(); // Select Amount
     	driver.findElement(By.xpath(".//*[@id='submit']")).click(); // Submit
		
		
		driver.close();
		driver.quit();
*/		
	
	
	
	
	
	
	
	}

}
