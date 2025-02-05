package com.project.pageclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.funtionclasses.DriverSetup;


public class LoginPage {
	public static WebDriver driver;
	
	@FindBy(xpath = "//td/child::input[@name='uid']")
	WebElement userId;
	@FindBy(xpath = "//td/child::input[@name='password']")
	WebElement password;
	@FindBy(name = "btnLogin")
	WebElement loginBtn;
	public void navigateToUrl() {
		DriverSetup driverSetup = new DriverSetup();
		driver = driverSetup.openBrowser("Chrome");
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	
	public void doLogin() throws InterruptedException {
		PageFactory.initElements(driver, this);
		userId.sendKeys("mngr336440");
		password.sendKeys("tutYtAd");
		loginBtn.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
	}
	
	public void tearDown() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}
