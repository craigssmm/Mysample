package Sele;

//import java.util.List;
//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements35 {
	public static String browser = "Chrome";// External configuration - XLS CSV
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
		driver.manage().window().maximize();
				
		driver.findElement(By.id("user-name")).sendKeys("Testing");
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		System.out.println(driver.findElement(By.id("user-name")).getAttribute("class"));
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		System.out.println(driver.findElement(By.id("login-button")).getCssValue("background-color"));
		System.out.println(driver.findElement(By.id("login-button")).getSize());
		System.out.println(driver.findElement(By.id("login-button")).getLocation());
		System.out.println(driver.findElement(By.id("login-button")).getTagName());
		System.out.println(driver.findElement(By.id("login_credentials")).getText());
		System.out.println(driver.findElement(By.id("login-button")).isDisplayed());
		System.out.println(driver.findElement(By.id("login-button")).isEnabled());
		System.out.println(driver.findElement(By.id("login-button")).isSelected());
		//driver.findElement(By.id("login-button")).click();
		
		


				
		//driver.close();
		
		}
}