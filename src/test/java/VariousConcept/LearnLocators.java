package VariousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
	WebDriver driver;
	/*public  void main(String[] args) {
		
		//Scanner scn = new Scanner(System.in);
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\mustafa\\Selenium\\crm\\driver\\chromedriver.exe");
		// System.out.println("what browser you wanna go to :");
		// String url = scn.nextLine();
		//WebDriver driver = new ChromeDriver();
		
		//driver.manage().deleteAllCookies(); 
	//	driver.get("https://"+url+".com");
     	//driver.get("https://codefios.com/ebilling/login");
		//driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		//driver.findElement(By.id("password")).sendKeys("abc123");
		//driver.findElement(By.id("login_submit")).click();
		// driver.close();
		
		
	}*/

	public  void teardown () {
		driver.close();
	}
	
	@Before
	public  void inet() {
		
		//lunching browser
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void TestLocators() throws InterruptedException{
		// if the tag is input use .sendkeys
		//driver.findElement(By.id("photo")).sendKeys("C:\\Users\\mustafa\\Pictures\\Screenshots");
		
		//link text
		driver.findElement(By.linkText("TF-API Product Backend")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		//parcel link text
		driver.findElement(By.partialLinkText("OS-API")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.name("firstname")).sendKeys("L7awti");
		driver.findElement(By.name("lastname")).sendKeys("Zbinbou");
		driver.findElement(By.name("Password")).sendKeys("amir ellaws");
		
		driver.findElement(By.cssSelector("input#sex-1 ")).click();
		driver.findElement(By.cssSelector("input[id='profession-1']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("a[href='http://techfios.com/api-prod/api/']")).click();
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("wedidit");
	}
	
	public  void positlogintest() {
		driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.id("login_submit")).click();
	}
    public  void negativlogintest() {
    	driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		driver.findElement(By.id("password")).sendKeys("abc123wvwvw");
		driver.findElement(By.id("login_submit")).click();
	}
}
