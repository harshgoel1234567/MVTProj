package Jpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {

	
	WebDriver d;
	@Test
	public void One()
	{
		WebDriverManager.chromedriver().setup();
		 d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("http://omayo.blogspot.com/");
		
		String actualtext=d.findElement(By.id("pah")).getText();
		System.out.println(actualtext);
		
		Assert.assertEquals("PracticeAutomationHer",actualtext);
	}
	@AfterMethod
	public void closure()
	{
		d.close();
	}
}
