package login_info;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumtest_login {

	@Test

	public void login() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe"); // Object command for locating
		// Chrome driver.

		WebDriver driver = new ChromeDriver(); // Object that enables to open the Chrome driver.
												// driver object reference access all the built in function in selenium.

		driver.manage().window().maximize(); // To maximize the window

		driver.get("http://demosite.center/wordpress/wp-login.php?loggedout=true");

		driver.findElement(By.id("User_Login")).sendKeys("admin");
		driver.findElement(By.id("User_Pass")).sendKeys("demo123");
		driver.findElement(By.id("wp_submit"));
		
		
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
		
	}

}
