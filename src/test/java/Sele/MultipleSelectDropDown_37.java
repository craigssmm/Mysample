package Sele;

import java.util.List;
//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleSelectDropDown_37 {
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

		driver.get("https://only-testing-blog.blogspot.com/");
		driver.manage().window().maximize();

		WebElement ddown = driver.findElement(By.name("FromLB"));
		Select select = new Select(ddown);
		select.selectByValue("Japan");
		select.selectByValue("Germany");
		// not sure how to use sleep without try catch as per the video

		Thread.sleep(2000);

		select.selectByIndex(4);
		Thread.sleep(2000);

		List<WebElement> allItems = select.getAllSelectedOptions();
		System.out.println(allItems.size());
		select.deselectAll();

		Thread.sleep(2000);

		select.selectByValue("India");

		Thread.sleep(2000);

		select.selectByIndex(7);

		Thread.sleep(2000);
		List<WebElement> allItems1 = select.getAllSelectedOptions();
		System.out.println(allItems1.size());
		WebElement firstoption = select.getFirstSelectedOption();//at final execution first selected option is India. This is helpful to select default option
		System.out.println(firstoption.getText());

		// driver.close();

	}
}