package login_info;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Priceline {
	
	
    @Test
	
	public void Flight() {
	System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe"); // Object command for locating
																				 // Chrome driver.
	
	WebDriver Flight= new ChromeDriver();
	Flight.manage().window().maximize();
	Flight.get("https://www.priceline.com/");
	
    Flight.findElement(By.xpath(".//*[@id='search-products']/div/div[1]/button[3]")).click(); 
    
    Flight.findElement(By.xpath(".//*[@id='search-products']/div/div[2]/div[3]/div/div/div[1]/div/div/label[2]/span")).click();
    
    Flight.findElement(By.xpath(".//*[@id='search-products']/div/div[2]/div[3]/div/div/div[2]/div/div[1]/div[1]/div[1]/div[2]/div[1]/input")).sendKeys("Dallas, TX - Dallas/Fort Worth Intl Airport (DFW)");
	
	Flight.findElement(By.xpath(".//*[@id='search-products']/div/div[2]/div[3]/div/div/div[2]/div/div[1]/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("Mumbai, India - Mumbai (Bombay) Intl Airport (BOM)");
	
	Flight.findElement(By.xpath(".//*[@id='search-products']/div/div[2]/div[3]/div/div/div[2]/div/div[2]/div[2]/div[4]/div[1]/div[3]/div[4]/div[3]/span")).click();
	
	
    }
}
