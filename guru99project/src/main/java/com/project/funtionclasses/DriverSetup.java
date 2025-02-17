package com.project.funtionclasses;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
	public  WebDriver driver;

	/*method purpose - to initiate browser
	 * return type - Web driver
	 * parameters - browser name
	 */
	public WebDriver  openBrowser(String browserName) {
		//using web driver manager instead of adding drivers
		try {
			if(browserName.equalsIgnoreCase("Chrome")) {
				WebDriverManager.chromedriver().clearDriverCache().setup();
				//calling chrome driver using driver manager
				ChromeOptions option = new ChromeOptions();
				//chrome options to disable notification
				option.addArguments("--disable-notifications"); 
				driver = new ChromeDriver();
				System.out.println("Opening "+browserName +" browser.................");
				// to enter maximized screen
				driver.manage().window().maximize();
			}else if (browserName.equalsIgnoreCase("mozilla")) {
				//calling firefox driver
				WebDriverManager.firefoxdriver().setup();
				System.out.println("Opening "+browserName +" browser.................");
				driver = new FirefoxDriver();
				// to maximize browser window
				driver.manage().window().maximize();
			}else if(browserName.equalsIgnoreCase("msedge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				driver.manage().window().maximize();
			}else if(browserName.equalsIgnoreCase("safari")) {
				//instatiate driver with safari browser driver
				driver = new SafariDriver();
				// to enter maximized screen
				driver.manage().window().maximize();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		//wait for element before throwing null pointer exception
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		//wait for page load
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		System.out.println("Browser Launch Success!");
		//return driver value
		return driver;
	}

}
