package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPO {
	 WebDriver driver;
	 public LoginPO(WebDriver driver) 
	 {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
		 
	}
	@FindBy(xpath="//input[@id='identifierId']")
	WebElement email;
	
	@FindBy(xpath="//div[@id='identifierNext']")
	WebElement next;
	
	public void enterEmail()
	{
		email.sendKeys("prafull.deshmukh97@gmail.com");
	}
	public void clickNext()
	{
		next.click();
	}

}
