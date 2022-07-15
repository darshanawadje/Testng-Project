package TestCases;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;

import Resources.BaseClass;
import pageobjectmodel.LoginPagePage_Object;

public class VerifyLoginPage extends BaseClass{
	
	

	@Test
	public void loginverification() throws IOException {
		//browser launch
		//url launch
		//username and passworld
		//click on log in button
		
		driver=driverInitialization();
		//this driver has scope
		driver.get("https://login.salesforce.com/?locale=in");
		
		LoginPagePage_Object Lp=new LoginPagePage_Object(driver);
        Lp.enterusername().sendKeys("test");
		Lp.enterPassworld().sendKeys("secure123");
		Lp.clickonLogin().click();

}
}