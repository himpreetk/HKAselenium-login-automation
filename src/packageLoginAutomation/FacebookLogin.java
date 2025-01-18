package packageLoginAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raman\\eclipse-workspace\\testerr\\HKAseleniumLoginAutomation\\server\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		
		// Navigate to a demo login page
		driver.get("https://www.facebook.com/");
		
		//Maximise the window
		driver.manage().window().maximize();
		
		//Enter the invalid credentials
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("ab@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("testinginvalidpassword");
		
		// Submit the form
		WebElement llogin = driver.findElement(By.name("login"));
		llogin.click();
		
		//Verify error message
		WebElement errormessage = driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]"));
		System.out.println("The Error message is : " + errormessage.getText());
		
	    driver.quit();
	}

}
