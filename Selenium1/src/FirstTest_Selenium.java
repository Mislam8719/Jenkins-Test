import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest_Selenium {
	
	

	@Test // J-unit annotation. It is a test runner and view results
	public void Test() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe"); // Object command for locating
																						// Chrome driver.

		WebDriver driver = new ChromeDriver(); // Object that enables to open the Chrome driver.
		// driver object reference access all the built in function in selenium.

		driver.manage().window().maximize();

		driver.get("http://www.qtptutorial.net/automation-practice/");// get function help us to go url.

		if (driver.findElement(By.id("idExample")).isDisplayed()) { // Display the webpage

			System.out.println("Webpage is working");
		} else {
			System.out.println("Webpage is not working");
		}

		driver.findElement(By.id("idExample")).click();// Identify the id element and

		if (driver.findElement(By.className("main_title")).isDisplayed()) {
			System.out.println("First button is taking me to webpage ");
		} else {
			System.out.println("First button is not working");
		}

		Thread.sleep(2000);// Pause your test for two seconds

		driver.navigate().back();// Takes me to back page

		driver.findElement(By.className("buttonClassExample")).click();
		driver.findElement(By.className("main_title")).isDisplayed();
		System.out.println("Second button is working");
		driver.navigate().back();

		driver.findElement(By.name("NameExample")).click();
		driver.findElement(By.className("main_title")).isDisplayed();
		System.out.println("Third button is working");
		driver.navigate().back();

		driver.close();// driver will close the browser
		driver.quit(); // and the driver will stop
	}

	@Test

	public void Email() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.qtptutorial.net/automation-practice/");// get function help us to go url.
		
		//Identifying with the Xpath
		
		
		// Relative Xpath
		
		driver.findElement(By.xpath("//input[@id='et_pb_signup_firstname']")).sendKeys("tom");

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='et_pb_signup_email']")).sendKeys("tom@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='et_pb_newsletter_button']")).click();
		
		//Absolute Xpath
		
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
				
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/article/div/div[4]/div/div/div/form[1]/input")).click();
		
		
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();		
	}

}
