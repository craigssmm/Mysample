package css;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class CssChildSubChild5_29 {
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
			// cssSelector = tagname[AttributeName^='AttributeValue']//Match prefix of the value
			// cssSelector = tagname[AttributeName$='AttributeValue']//Match suffix of the value
			// cssSelector = tagname[AttributeName*='AttributeValue']//Match sub-string of the value
			// these attributes can be used in combination too
			
			//driver.findElement(By.cssSelector("input[placeholder^='User']")).sendKeys("Shree");//working
			//driver.findElement(By.cssSelector("input[placeholder$='Name']")).sendKeys("Shree");
			driver.findElement(By.cssSelector("input[placeholder*='erNa']")).sendKeys("Shree");
			
					
			// driver.close();

		}

	}


