package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.signupPageObjects;
import Resources.baseClass;

public class verifySignup extends baseClass {
	@Test
	public void signup() throws IOException {
		
		driverInitialize();
		
		driver.get("https://login.salesforce.com/");
		
		signupPageObjects obj=new signupPageObjects(driver);
	    obj.clickOnTryForFree
		obj.enterFirstName().sendKeys("Vrushabh");
		obj.enterLastName().sendKeys("Thorat");
		obj.enterWorkEmail().sendKeys("vrushabhthorat11@gmail.com");
	}

}
