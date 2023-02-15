package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signupPageObjects {
	
	public WebDriver driver;
	
	private By FirstName=By.xpath("//input[@id='UserFirstName-DHQj']");
	private By LastName=By.xpath("//input[@id='UserLastName-KFUY']");
	private By WorkEmail=By.xpath("//input[@id='UserEmail-k54F']");
	
	
	
	public signupPageObjects(WebDriver driver2) {
		
		this.driver=driver2;
	}
	
	public WebElement enterFirstName() {
		return driver.findElement(FirstName);
	}
	public WebElement enterLastName() {
		return driver.findElement(LastName);
	}
	public WebElement enterWorkEmail() {
		return driver.findElement(WorkEmail);
	}
	

}
