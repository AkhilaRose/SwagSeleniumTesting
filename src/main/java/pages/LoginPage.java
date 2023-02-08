package pages;


import org.openqa.selenium.By;

import configiration.Base;

public class LoginPage {

	By username=By.name("user-name");
	By password=By.name("password");
	By lognbuttn=By.id("login-button");
	
	public void loginApplication() {
		
		Base.driver.findElement(username).sendKeys("standard_user");
		Base.driver.findElement(password).sendKeys("secret_sauce");
		Base.driver.findElement(lognbuttn).click();
		
	}
	

public boolean loginButtonDisplayedorNot() {
		
		return Base.driver.findElement(lognbuttn).isDisplayed();
	}

public String loginButtonTextDisplayedorNot() {
	return  Base.driver.findElement(lognbuttn).getAttribute("value");
	
}
}
