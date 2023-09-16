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
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox_40 {
	public static String browser = "Chrome";// External configuration - XLS CSV
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

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
		
		//this block of code is so that the checkbox if present at the bottom of the screen is not hidden when it is executing. Not needed for the above site. 
		WebElement radio = driver.findElement(By.id("paypal"));
		Actions actions = new Actions(driver);
		actions.moveToElement(radio);
		actions.perform();
		
		driver.findElement(By.name("emailReceive")).click();
		System.out.println(driver.findElement(By.name("emailReceive")).isSelected());
		
		Thread.sleep(2000);
		driver.findElement(By.name("emailReceive")).click();
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

		
		
		// driver.close();

	}
}