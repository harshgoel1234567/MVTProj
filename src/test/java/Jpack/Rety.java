package Jpack;


import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Rety {



	@Test
	public void rt(){
		 WebDriverManager.chromedriver().setup();

	        // Initialize ChromeDriver
	        WebDriver driver = new ChromeDriver();

	       
	        // Open amazon.in
	        driver.get("https://www.amazon.in");

	        // Optional: Maximize the browser window
	        driver.manage().window().maximize();

	        // Close the browser
	        driver.quit();
	}
}
