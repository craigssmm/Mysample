package ui;

//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.WebElement;
public class DemoAutomation1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse-workspace\\RCVDemo\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", "C:\\Program Files\\eclipse-workspace\\RCVDemo\\msedgedriver.exe");
		// System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\eclipse-workspace\\RCVDemo\\geckodriver.exe");
		// WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		// WebDriver driver = new FirefoxDriver();
		// ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");
		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		//driver.close();
		//driver.quit();

	}

}
