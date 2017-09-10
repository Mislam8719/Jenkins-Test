package login_info;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Facebook {
	
	@Test

	public void login() {

		System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe"); // Object command for locating
		// Chrome driver.

		WebDriver driver = new ChromeDriver(); // Object that enables to open the Chrome driver.
											   // driver object reference access all the built in function in selenium.

		driver.manage().window().maximize(); // To maximize the window

		driver.get("https://www.facebook.com/");// Go to facebook website
		
		// Using X-path with Sendkeys and Click
		
		driver.findElement(By.xpath(".//*[@id='u_0_7']")).sendKeys("Techfios"); // Entering first name
		
		driver.findElement(By.xpath(".//*[@id='u_0_9']")).sendKeys("Spring"); // Entering last name
		
		driver.findElement(By.xpath(".//*[@id='u_0_c']")).sendKeys("123456789");// Entering phone number
		
		driver.findElement(By.xpath(".//*[@id='u_0_5']")).click();// selecting gender
		
		// Using Select method
		
		Select BD_month =new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		BD_month.selectByIndex(1);
		
		Select BD_day=new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		BD_day.selectByVisibleText("20");
		
		Select BD_year=new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		BD_year.selectByValue("2001");
		
		
		driver.findElement(By.xpath(".//*[@id='u_0_p']")).click();// for click Create Account 
		
		
		
		
		
		
	
	
	
	

}
}