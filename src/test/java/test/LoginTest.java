package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver Driver;
    String userName = "demo@codefios.com";
    String passWord = "abc123";
    String dashboardvaltext = "Dashboard";
	@Test(priority = 1)
	public void validusershouldbeabletologin() {

		Driver = BrowserFactory.init();
		
//		LoginPage loginpage1 = new LoginPage();
//		Creating Object with selenium
		LoginPage loginpage =PageFactory.initElements(Driver, LoginPage.class );
		loginpage.insertUserName(userName);
		loginpage.insertPassword(passWord);
		loginpage.clicksigninbutton();
		DashboardPage dashboardpage = PageFactory.initElements(Driver,DashboardPage.class);
		dashboardpage.validatedashboardpage(dashboardvaltext);
		
		BrowserFactory.teardown();
		

	}

}
