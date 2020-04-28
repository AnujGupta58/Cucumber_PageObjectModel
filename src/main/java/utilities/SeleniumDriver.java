package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {

	private static SeleniumDriver seleniumDriver;
	
	private static WebDriver driver;
	
	private static WebDriverWait webDriverWait;
	
	private final static int TIMEOUT = 30;
	
	private final static int PAGE_LOAD_TIMEOUT = 30; 	
	
	private SeleniumDriver() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		webDriverWait = new WebDriverWait(driver, TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	}
	
	public static void openPage(String url) {
		driver.get(url);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setUpDriver() {
		if(seleniumDriver==null) {
			seleniumDriver = new SeleniumDriver();
		}
	}
	
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
		}
		seleniumDriver = null;
	}
}
