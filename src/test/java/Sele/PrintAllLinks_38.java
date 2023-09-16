package Sele;

import java.util.List;
//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks_38 {
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

		//driver.get("https://www.courts.ca.gov/opinions-nonpub.htm");//230 links available on webpage only 92 shows.
		driver.get("https://only-testing-blog.blogspot.com/");//202 available and all 202 shows up
		driver.manage().window().maximize();

		//List<WebElement> alltags = driver.findElements(By.tagName("a"));
		List<WebElement> alltags = driver.findElements(By.tagName("option"));
		System.out.println("Total tags are:  "+ alltags.size());
		for(int i=0; i<alltags.size(); i++)
		{
			System.out.println("Links on page are " +alltags.get(i).getAttribute("value"));//81 options available and showed
			System.out.println("Texts on page are " +alltags.get(i).getText());
		
		}
		// driver.close();

	}
}