package Sele;

//import java.util.List;
//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown_36 {
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

		driver.get("https://sso.teachable.com/secure/146684/checkout/2954151/all-access");
		driver.manage().window().maximize();
		WebElement ddown = driver.findElement(By.name("cardCountry")); 
		Select select = new Select(ddown);
		WebElement firstoption = select.getFirstSelectedOption();//output-- United States of America
		System.out.println(firstoption.getText());
		
		//select.selectByValue("AS");
		
		//select.selectByVisibleText("American Samoa");
		
		select.selectByIndex(4);
		
		
		
		


				
		//driver.close();
		
		}
}