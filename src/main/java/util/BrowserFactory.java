package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	static WebDriver Driver;


	public static WebDriver init() {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.manage().deleteAllCookies();
		Driver.get("https://codefios.com/ebilling/login");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return Driver;
	}
	
	public static void teardown() {
		Driver.close();
		Driver.quit();
	}

}
