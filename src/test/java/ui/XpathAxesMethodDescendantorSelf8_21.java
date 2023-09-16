package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxesMethodDescendantorSelf8_21 {
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
		
		// Xpath = //tagname[@Attribute='Value']//descendant::tagname
		
		driver.findElement(By.xpath("//div[@class='form_section m-b-5-xs']//descendant::div")).click();
		// the above line selects 52 options which is 26 for two of these class
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='form_section m-b-5-xs']//descendant::div[@class='C-pQc']")).click();
		// the above code selects just one with class C-pQc			
		
		// Xpath = //tagname[@Attribute='Value']//descendant-or-self::tagname
		
		driver.findElement(By.xpath("//div[@class='form_section m-b-5-xs']//descendant-or-self::div")).click();
		// the above line selects 54 options which is 26 for two of these class and two self 
		
		driver.manage().window().maximize();
		
							
		//driver.close();

	}

}

