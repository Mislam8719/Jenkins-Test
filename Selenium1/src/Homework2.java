import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework2 {

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
		
		driver.findElement(By.xpath(".//*[@id='side-menu']/li[3]/a/span[1]")).click();// Transaction
		
		driver.findElement(By.xpath(".//*[@id='side-menu']/li[3]/ul/li[1]/a")).click();// New Deposit
		
		driver.findElement(By.xpath(".//*[@id='select2-account-container']")).click();//Choose an account
		driver.findElement(By.xpath("html/body/span/span/span[1]/input")).sendKeys("checking"+"\n");
		//driver.findElement(By.xpath(xpathExpression))
		
		driver.findElement(By.xpath(".//*[@id='description']")).sendKeys("Bi-Weekly");
		
		driver.findElement(By.xpath(".//*[@id='amount']")).sendKeys("3500.00");
		
		driver.findElement(By.xpath(".//*[@id='submit']")).click();
		
		
		
		
		
		
		Thread.sleep(2000);
	}
	}
		
		
	