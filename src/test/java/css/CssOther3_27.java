package css;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class CssOther3_27 {
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
			// cssSelector = tagname[AttributeName='AttributeValue']
			
			// if one identifier is not unique add multiple like below
			
			// cssSelector = tagname#idValue[AttributeName='AttributeValue']
			// cssSelector = tagname.classValue[AttributeName='AttributeValue']
			// cssSelector = tagname.classValue[AttributeName='AttributeValue'][AttributeName='AttributeValue']
			
			//driver.findElement(By.cssSelector("input[placeholder='UserName']")).sendKeys("Shree");//working
			//driver.findElement(By.cssSelector("input#userName[placeholder='UserName']")).sendKeys("Shree");//working
			//driver.findElement(By.cssSelector("input.mr-sm-2 form-control[placeholder='UserName']")).sendKeys("Shree");//not working
			driver.findElement(By.cssSelector("input#userName[placeholder='UserName'][class='mr-sm-2 form-control']")).sendKeys("Shree");//working
					
			// driver.close();

		}

	}


