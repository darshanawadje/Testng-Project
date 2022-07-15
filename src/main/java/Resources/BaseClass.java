package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	


	public WebDriver driver;
	public  WebDriver driverInitialization()throws IOException {
		
		// to read the file-data.properties
FileInputStream fis=new FileInputStream("C:\\Users\\akshay\\eclipse-workspace\\E2TestNGFramwork\\src\\main\\java\\Resources\\data.properties");
 
       // to access the data.properties
       Properties prop=new Properties();
       
       prop.load(fis);
       
        String browserName=prop.getProperty("browser");
        
        
        
        if(browserName.equalsIgnoreCase("chrome")) {
        	
        	System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\eclipse-workspace\\selenium\\src\\chromedriver.exe");
    		  driver = new ChromeDriver(); 
    		
        }
        else if(browserName.equalsIgnoreCase("firefox")) {
        	
        	//firefox code
        }
        else if(browserName.equalsIgnoreCase("edge")) {
        	// edge code
        	
        }
        else {
        	System.out.println("please enter valid browser name");       
        }
        
        
    		return driver;
    		
    		
    		
    		
    		
    		
        }
	}
	


