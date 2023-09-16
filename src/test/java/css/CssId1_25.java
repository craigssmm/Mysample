package css;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class CssId1_25 {
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

			driver.get("https://demoqa.com/login");
			// cssSelector = tagname[AttributeName='AttributeValue'] or tagName#AttributeValue
			
			driver.findElement(By.cssSelector("input[id='userName']")).sendKeys("Shree");
			//driver.findElement(By.cssSelector("input#userName")).sendKeys("Shree");
			
			// driver.close();

		}

	}


