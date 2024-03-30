package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {

	WebDriver Driver;

	public DashboardPage(WebDriver driver) {
		this.Driver = driver;
	}
	
	@FindBy(how = How.XPATH,using = "/html/body/div[1]/section/div/div[2]/div/div/header/div/strong") WebElement DASHBOARD_VALIDATION_ELEMENT;
	
	public void validatedashboardpage(String dashboardvaltext) {
		
		Assert.assertEquals(DASHBOARD_VALIDATION_ELEMENT.getText(), dashboardvaltext, "Dashboard not avaolable");
		
	}
}
