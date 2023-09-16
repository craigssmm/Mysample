package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathRelativeVsAbsolute2_15 {
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

		driver.get("https://demoqa.com/login");
		// Absolute xpath= /html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[2]/div[2]/input
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[2]/div[2]/input")).sendKeys("Shree");
		
		// Relative xpath = //tagname[@Attribute='Value']  //input[@placeholder='UserName']
		
		driver.findElement(By.xpath("//input[@placeholder='UserName']")).sendKeys("Shree");
		
		
		// driver.close();
		
		

	}

}

