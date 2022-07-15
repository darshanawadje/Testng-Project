package TestCases;


import java.io.IOException;

import org.junit.Test;

import Resources.BaseClass;
import pageobjectmodel.LoginPagePage_Object;

public class VerifySignup extends BaseClass{

 @Test	
	public void signup() throws IOException {
	 
	 driverInitialization();
	 driver.get("https://login.salesforce.com/?locale=in");
	 
	 LoginPagePage_Object lp=new  LoginPagePage_Object();
	 lp.tryforFree().click();
 }
}
