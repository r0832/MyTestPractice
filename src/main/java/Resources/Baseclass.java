package Resources;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + 	"\\src\\main\\java\\resources\\data.properties");
		prop = new Properties();
		prop.load(fis);	
		//Open chrome Browser
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();			
		}
		
		else if (browserName.equals("firefox")) {
			
		}
		
		else {
			System.out.println("Please choose valid browser name");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		return driver;
		
	}
	
	@BeforeMethod
	public void launchBrowser() throws IOException {
		
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		
	}
	
	@AfterClass
	public void quitBrowser() {
		driver.quit();
		
	}
	
	

}
