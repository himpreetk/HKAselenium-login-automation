package packageLoginAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raman\\eclipse-workspace\\testerr\\HKAseleniumLoginAutomation\\server\\chromedriver.exe");
	    
		//launch the Chrome browser
		WebDriver driver = new ChromeDriver();
		
		// Navigate to a demo login page
		driver.get("https://practice.expandtesting.com/login#google_vignette");
		
		//Maximise the window
		driver.manage().window().maximize();
		
		//Enter the invalid credentials
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("invalid username");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("invalidpassword");
		
		// Submit the form
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]/button"));
		login.click();
		
		//Verify error message
		WebElement errormessage = driver.findElement(By.xpath("//*[@id=\"flash\"]/b"));
		System.out.println("Error Message: " + errormessage.getText());
	    
		//close the entire browser window
		driver.quit();
	
	}

}
