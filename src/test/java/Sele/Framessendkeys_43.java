package Sele;

//import java.util.List;
//import java.util.Set;

import org.openqa.selenium.Alert;
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

public class Framessendkeys_43 {
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

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		//works on the video. works for me only after a long break
		WebElement frame1 = driver.findElement(By.id("iframeResult"));
		//driver.switchTo().frame(0);
		driver.switchTo().frame(frame1);
        //driver.findElement(By.xpath("//button[text()='Try it']")).click(); 
		driver.findElement(By.xpath("/html/body/button")).click();
		//Thread.sleep(2000);
		Alert alertonpage = driver.switchTo().alert();
		alertonpage.sendKeys("Shree");
		alertonpage.accept();
		
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
		
		//Thread.sleep(9000);
		//driver.close();

	}
}