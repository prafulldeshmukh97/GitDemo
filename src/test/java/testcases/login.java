package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POM.LoginPO;
import Pkg1.BaseClass;

public class login extends BaseClass{

	@Test
	public void login1() throws InterruptedException {
LoginPO l=new LoginPO(driver);
l.enterEmail();
Thread.sleep(3000);
l.clickNext();
		
		
	}
}
