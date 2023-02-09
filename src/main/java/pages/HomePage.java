package pages;

import org.openqa.selenium.By;

import configiration.Base;

public class HomePage {
	

	By harmburgermenu=By.xpath("//button[@id='react-burger-menu-btn']");
	By Logout =By.xpath("//a[@id='logout_sidebar_link']");
	
	

public void harmburgermenuButtonClick() {
	Base.driver.findElement(harmburgermenu).click();
	
}

public boolean logoutButtonDisplayedorNot()
{
	return Base.driver.findElement(Logout).isDisplayed();
}

}