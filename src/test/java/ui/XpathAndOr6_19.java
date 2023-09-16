package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAndOr6_19 {
	public static String browser = "Chrome";//External configuration - XLS CSV
	public static WebDriver driver;

	public static void main(String[] args) {

		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.get("https://sso.teachable.com/secure/146684/checkout/2954151/all-access");
		
		// Xpath = //tagname[@Attribut='Value' or @Attribute='Value']
		
		driver.findElement(By.xpath("//input[@type='email' or @id='email']")).sendKeys("Shree");
		driver.manage().window().maximize();
			
		// Xpath = //tagname[@Attribut='Value' and @Attribute='Value']
		
		//driver.findElement(By.xpath("//input[@type='email' and @id='email']")).sendKeys("Shree");
		//driver.manage().window().maximize();
					
		//driver.close();

	}

}

