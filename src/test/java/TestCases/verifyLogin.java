package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import Resources.baseClass;

public class verifyLogin extends baseClass{
	@Test
	public void login() throws IOException {
		
		driverInitialize();
		//this driver have scope
		driver.get("https://login.salesforce.com/");
		
		//driver.findElement(By.xpath("username")).sendKeys("Hello");
		
		LoginPageObjects obj=new LoginPageObjects(driver);
		
		obj.enterUsername().sendKeys("Rahul");
		
		obj.enterPassword().sendKeys("test");
		
		obj.clickOnLogin().click();
		
	}

}
