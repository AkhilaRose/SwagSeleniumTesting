package Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import configiration.Base;
import pages.LoginPage;

public class LoginTest extends Base {
	
	LoginPage obj=new LoginPage();
	
	@BeforeMethod
	public void setup() {
		
		initialisation();
	}
	@Test
	
		 public void loginButtonDisplayTest() throws InterruptedException {
			Thread.sleep(5000);
				String textvalue = obj.loginButtonTextDisplayedorNot();
				System.out.println("value is :"+textvalue);
				Assert.assertEquals(textvalue,"LOGIN");
	}
	@AfterMethod
	
	public void cleanup() {
		driver.close();
	}

}
