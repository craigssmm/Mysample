package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxesMethodParentChildSelf7_20 {
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
		
		// Xpath = //tagname[@Attribute='Value']//parent::tagname
		
		driver.findElement(By.xpath("//option[@value='CT']//parent::select")).click();
		driver.manage().window().maximize();
			
		
		
		// Xpath = //tagname[@Attribute='Value']//child::tagname
		
		//driver.findElement(By.xpath("//select[@name='cardCountry']//child::option[3]")).click();
		//driver.manage().window().maximize();
		
		
		// Xpath = //tagname[@Attribute='Value']//self::tagname
		
		driver.findElement(By.xpath("//select[@id='cardCountry']//self::select")).click();
		driver.manage().window().maximize();
			
					
		//driver.close();

	}

}

