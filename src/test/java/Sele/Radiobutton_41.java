package Sele;

//import java.util.List;
//import java.util.Set;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobutton_41 {
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

		

		driver.get("https://sso.teachable.com/secure/146684/checkout/2954151/all-access");
		driver.manage().window().maximize();
		
		WebElement radio2 = driver.findElement(By.id("credit-card-with-images"));
		WebElement radio1 = driver.findElement(By.id("paypal"));
		radio1.click();
		
		System.out.println(radio2.isSelected());
		System.out.println(radio1.isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size());
		
		
		
		// driver.close();

	}
}