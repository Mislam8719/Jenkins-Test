import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Graphs {
	
	@Test
	public void All_Graphs() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe"); // Object command for locating
		// Chrome driver.

		WebDriver driver = new ChromeDriver(); // Object that enables to open the Chrome driver.
		// driver object reference access all the built in function in selenium.

		driver.manage().window().maximize();
		
		driver.get("http://techfios.com/test/?ng=login/");
		
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		driver.findElement(By.name("login")).sendKeys("Sign in");
		
		driver.findElement(By.xpath(".//*[@id='sort_3']/div/div/div[2]")).isDisplayed();   // Income & Expense graph will Display
		
		Thread.sleep(3000);
	
		driver.findElement(By.xpath(".//*[@id='sort_2']/div[2]/div/div[2]")).isDisplayed(); // Income Vs Expense graph will display 
		
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
		
		
		
			
			
			
		}
		
		
		

}
