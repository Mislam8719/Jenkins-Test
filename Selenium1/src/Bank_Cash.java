import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Bank_Cash {
	@Test
	public void BankCash() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe"); // Object command for locating
	// Chrome driver.

	WebDriver driver = new ChromeDriver(); // Object that enables to open the Chrome driver.
	// driver object reference access all the built in function in selenium.

	driver.manage().window().maximize();
	
	driver.get("http://techfios.com/test/?ng=login/");
	
	driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
	
	driver.findElement(By.id("password")).sendKeys("abc123");
	
	driver.findElement(By.name("login")).sendKeys("Sign in");
	
	driver.findElement(By.xpath(".//*[@id='side-menu']/li[5]/a/span[1]")).click();// Bank & Cash
	
	driver.findElement(By.xpath(".//*[@id='side-menu']/li[5]/ul/li[1]/a")).click();// New Account
	
	driver.findElement(By.xpath(".//*[@id='account']")).sendKeys("Business1");// Account Title
	
	driver.findElement(By.xpath(".//*[@id='description']")).sendKeys("Monthly");
	//driver.findElement(By.xpath(xpathExpression))
	
	driver.findElement(By.xpath(".//*[@id='balance']")).sendKeys("30,500.00");
	
	driver.findElement(By.xpath(".//*[@id='page-wrapper']/div[3]/div[1]/div/div/div[2]/form/button")).click();
	
	
	
	
	
	
	Thread.sleep(2000);
}

	/*
				
			@FindBy(how=How.XPATH,using=".//*[@id='side-menu']/li[5]/a/span[1]")
			WebElement Bank_Cash;
			
			@FindBy(how=How.XPATH,using=".//*[@id='side-menu']/li[5]/ul/li[1]/a")
			WebElement New_Account;

			@FindBy(how=How.XPATH,using=".//*[@id='account']")
			WebElement Account_Tittle;
			
			@FindBy(how=How.XPATH,using=".//*[@id='description']")
			WebElement Description;
			
			@FindBy(how=How.ID,using="amount")
			WebElement Amount;
			
			@FindBy(how=How.ID, using="submit")
			WebElement Submit;
			 
				  
			
		public void submit_Transaction() {
						  
					 Bank_Cash.click();
					 New_Account.click();
					 Account_Tittle.sendKeys("Business");
					 Description.sendKeys("Bonus");
					 Amount.sendKeys("15000");
					 Submit.click();*/
							 
			
		
	
	
	
	
	
	
		}


