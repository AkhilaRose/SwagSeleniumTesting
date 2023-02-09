package Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import configiration.Base;
import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends Base{ 
	LoginPage obj =new LoginPage();
	HomePage objhome =new HomePage();
	
	@BeforeMethod
	public void setUp() {
		initialisation();
	}
	
	@Test
	public void logutButtonDisplayTest() throws InterruptedException {
		
		obj.loginApplication();
		Thread.sleep(2000);
		objhome.harmburgermenuButtonClick();
		Thread.sleep(2000);
		boolean logoutdata=objhome.logoutButtonDisplayedorNot();
		Assert.assertEquals(logoutdata, true);	
		
		}
	@AfterMethod
	public void cleanup()
	{
		driver.close();
	}
	}
