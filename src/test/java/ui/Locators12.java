package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators12 {
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
		
		//driver.get("https://www.saucedemo.com/");
		
		// *[@id="user-name"]//*[@id="password"]//*[@id="login-button"]
		//driver.findElement(By.className("form_input")).sendKeys("Testing");//class not is not unique. It will pick the first one
		//driver.findElement(By.cssSelector("#user-name")).sendKeys("Testing");
		//driver.findElement(By.id("user-name")).sendKeys("Testing");
		//driver.findElement(By.name("user-name")).sendKeys("Testing");
		//driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("Testing");
		//driver.findElement(By.tagName("input")).sendKeys("Testing");
		
		driver.get("https://stackoverflow.com/questions/5178411/how-to-rename-a-class-and-its-corresponding-file-in-eclipse");
		
		driver.findElement(By.linkText("Ask Question")).click();
		//driver.findElement(By.partialLinkText("Ask")).click();
		
		
		

		
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//driver.findElement(By.id("login-button")).click();
		// driver.close();

	}

}

