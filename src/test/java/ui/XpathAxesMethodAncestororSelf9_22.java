package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxesMethodAncestororSelf9_22 {
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

		driver.get("https://codewithmosh.com/");
		
		// Xpath = //tagname[@Attribute='Value']//ancestor::tagname
		// not a good example to understand
		
		driver.findElement(By.xpath("//*[@id='link_text']//ancestor::div")).click();
		// the above line selects 6 options 
		
		
		//driver.findElement(By.xpath("//*[@id='link_text']//ancestor::div[@class='hb-cta qrdrmdeq-jjngnm']")).click();
		// the above code selects just one with class hb-cta qrdrmdeq-jjngnm			
		
		// Xpath = //tagname[@Attribute='Value']//ancestor-or-self::tagname
		
		//driver.findElement(By.xpath("//div[@id='link_text']//ancestor-or-self::div")).click();
		// the above line should select one more which is 7 but it only shows 6 for both. not sure why.
		
				
							
		//driver.close();

	}

}

