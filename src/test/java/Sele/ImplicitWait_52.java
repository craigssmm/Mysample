package Sele;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

//import java.util.List;
//import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait_52 {
	public static String browser = "Chrome";// External configuration - XLS CSV
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

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

		driver.get("https://www.ebay.com.au/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(10)));//if element found in 1 sec it will not wait 10 secs.it will move on 
		WebElement element = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
		driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[6]/a")).click();
		
				
		//driver.close();

	}
}