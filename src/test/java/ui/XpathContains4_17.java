package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathContains4_17 {
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

		driver.get("https://www.saucedemo.com/");
		// Xpath = //tagname[contains(@Attribute,'Value')]
		
		
		driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[contains(@id,'button')]")).click();
		
		
		
		
		// driver.close();

	}

}

