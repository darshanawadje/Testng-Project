package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPagePage_Object {
	

//this driver dont  have scope
	 public WebDriver driver;
	
	// driver.finfElement(By.xpath("")).sendkeys("test1");
	
	By username=By.xpath("//input[@id='username']");
	By password=By.xpath("//input[@id='password']");
	By login=By.xpath("//input[@id='Login']");

	private Object tryFree;
	
	By.tryFree=By.xpath("//a[@id='signup_link']");
	
	public LoginPagePage_Object() {
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}
	public WebElement enterusername() {
		return  driver.findElement(username);
			}
	public WebElement enterPassworld() {
		return driver.findElement(password);
		
	}
	public WebElement clickonLogin() {
		return driver.findElement(login);
		
	}
	public WebElement tryforFree() {
		return driver.findElement(tryFree);
	
	

	
		
	}
}