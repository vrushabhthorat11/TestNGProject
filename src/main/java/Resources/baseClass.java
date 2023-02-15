package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {
	
	public WebDriver driver;
	
	public void driverInitialize() throws IOException {
		
	//This will read the properties file--	
	FileInputStream fis=new FileInputStream("C:\\Users\\vrush\\eclipse-workspace\\SeleniumTestNGProject\\src\\main\\java\\Resources\\data.properties");
	
	//access the properties file--
			
    Properties prop=new Properties();
	prop.load(fis);
	
	String browserName= prop.getProperty("browser");
	
	if(browserName.equalsIgnoreCase("chrome")) {
		 driver=new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("firefox")) {
		//firefox code
	}
	else if(browserName.equalsIgnoreCase("edge")) {
		//Edge code
	}
	else {
		System.out.println("Please make sure you have correct browser");
		
		
	}
	
	}
}
