package login_info;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap_dropdown {

	@Test

	public void Bootstrap() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe"); // Object command for locating
		// Chrome driver.

		WebDriver driver = new ChromeDriver(); // Object that enables to open the Chrome driver.
											   // driver object reference access all the built in function in selenium.

		driver.manage().window().maximize(); // To maximize the window

		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		//Clicking the Tutorial button
		driver.findElement(By.xpath(".//*[@id='menu1']")).click();
		
		Thread.sleep(2000);
		
		//Capturing dropdown list
		List<WebElement>dd_menu=driver.findElements(By.xpath(".//*[@id='post-body-4615304122771162527']/div[1]/div/ul"));
		
		
		//store all the web elements of x path and from their print all the innerhtml
		
		for(int i=0; i<dd_menu.size();i++){
		
		//for every elements it will print the name using innerHTML
		
	   WebElement element=dd_menu.get(i);
	   
	   String innerhtml=element.getAttribute("innerHTML");
	   
	   System.out.println(innerhtml);
	   
	   
	   //Here we will verify if link (item ) is equal to JavaScrip
	   if(element.getAttribute("innerHTML").contains("JavaScrip")) {
		  
		   
		   // if yes then click on link(item)
		   element.click();
		   
		   //break the loop or come out of loop
		   
		  // break;
		   
		   
			  
		   Thread.sleep(2000);
		   
		   
		   driver.close();
		   driver.quit();
	   
	   }
		}
	}

	   
	   
	   
		}
	
		
	
		
	
	
	

