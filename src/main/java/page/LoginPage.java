package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
   
	
	public LoginPage(WebDriver driver) {
		this.Driver = driver;
		  
	}
	WebDriver Driver;
//	Webelements
	@FindBy(how = How.XPATH, using = "//*[@id=\"user_name\"]") WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH,using = "//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH,using = "//*[@id=\"login_submit\"]") WebElement SIGNIN_BUTTON;
//	related action or methods 
	 public void insertUserName(String userName) {
		 USER_NAME_ELEMENT.sendKeys(userName);
		
	}
	 public void insertPassword(String passWord) {
		 PASSWORD_ELEMENT.sendKeys(passWord);
		
	}
	 public void clicksigninbutton() {
		 SIGNIN_BUTTON.click();
		
	}
}
