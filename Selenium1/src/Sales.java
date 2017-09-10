import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sales {
	
	@Test
	public void Sales_Invoice() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe"); // Object command for locating
		// Chrome driver.

		WebDriver driver = new ChromeDriver(); // Object that enables to open the Chrome driver.
		// driver object reference access all the built in function in selenium.

		driver.manage().window().maximize();
		
		driver.get("http://techfios.com/test/?ng=login/");
		
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		driver.findElement(By.name("login")).sendKeys("Sign in");
		driver.findElement(By.xpath(".//*[@id='side-menu']/li[4]/a/span[1]")).click();// clicking on Sales
		driver.findElement(By.xpath(".//*[@id='side-menu']/li[4]/ul/li[2]/a")).click();// clicking on new Invoice
		driver.findElement(By.xpath(".//*[@id='invoice_items']/tbody/tr/td[2]/textarea")).sendKeys("0007");// Entering Invoice number
		driver.findElement(By.xpath(".//*[@id='invoice_items']/tbody/tr/td[3]/input")).sendKeys("100");// Entering Quantity
		driver.findElement(By.xpath(".//*[@id='invoice_items']/tbody/tr/td[4]/input")).sendKeys("500");// Entering Price
		driver.findElement(By.xpath(".//*[@id='invoice_items']/tbody/tr/td[6]/select")).sendKeys("Yes + \n");// Select Yes
		driver.findElement(By.xpath(".//*[@id='select2-cid-container']")).click();// Adding contact
		driver.findElement(By.xpath("html/body/span[13]/span/span[1]/input")).sendKeys("MD" + "\n");
		driver.findElement(By.xpath(".//*[@id='cn']")).sendKeys("20170826");
		driver.findElement(By.xpath(".//*[@id='duedate']")).sendKeys("+30days"+"\n");
		driver.findElement(By.xpath(".//*[@id='tid']")).sendKeys("Sales Tax(1.50%)"+"\n");
		driver.findElement(By.className(".//*[@id='submit']")).click();
	    driver.findElement(By.id("save_n_close")).click();
		
		
		
		
		
	
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
