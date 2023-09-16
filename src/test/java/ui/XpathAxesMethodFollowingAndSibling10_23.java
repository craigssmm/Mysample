package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxesMethodFollowingAndSibling10_23 {
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

		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		// Xpath = //tagname[@Attribute='Value']//following::tagname
	
		
		driver.findElement(By.xpath("//option[text()='Asia']//following::option"));
		// the above line selects 11 options which is 6 options from the sameset another 5 below.
		
		
		//driver.findElement(By.xpath("//option[text()='Asia']//following::option[text()='Europe']"));
		// the above code selects just one with text Europe			
		
		// Xpath = //tagname[@Attribute='Value']//following-sibling::tagname
		
		//driver.findElement(By.xpath("//option[text()='Asia']//following-sibling::option"));
		// the above line selects 6 options from that set only
				
							
		//driver.close();

	}

}

