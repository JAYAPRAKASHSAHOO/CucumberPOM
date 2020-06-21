package com.cucumber.Base;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cucumber.Util.GetUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetUpMethod {
	protected WebDriver driver;
	protected GetUtil getUtil;
	public static final String projectpath=System.getProperty("user.dir");
	public SetUpMethod(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebDriver setBrowser() {
		getUtil=new GetUtil();
		String propertypath=projectpath+"//Global.properties";
		switch(getUtil.getProperties("browser")) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			break;
		case "mozila":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		default:
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			break;
	  }
		return driver;
   }
}
