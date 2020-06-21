package com.cucumber.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.cucumber.Base.SetUpMethod;
import com.cucumber.Util.GetUtil;

public class LoginPage extends SetUpMethod {
    public LoginPage(WebDriver driver) {
		super(driver);
	}
    WebDriver driver=setBrowser();
	//find the elements by eg:xpath,id,name
    public static final By testxt=By.xpath("//span[text()='TestYou Login']");
    public static final By username=By.name("ctl00$CPHContainer$txtUserLogin");
    public static final By password=By.name("ctl00$CPHContainer$txtPassword");
    public static final By loginbutton=By.name("ctl00$CPHContainer$btnLoginn");
    
    public static final By examiner=By.id("ctl00_headerTopStudent_HyperLink2");
    public static final By logout=By.id("ctl00_headerTopStudent_lnkbtnSignout");
    
    public void open_url(String url) {
    	driver.get(url);
    }
    public void page_load() {
    	getUtil.waitElemetVisible(30, driver, testxt);
    	WebElement testel=driver.findElement(testxt);
    	Assert.assertTrue(testel.isDisplayed(), "Page not loads proprly");
    }
    public void enterUser(String uname) {
    	getUtil.waitElemetVisible(30, driver, username);
    	driver.findElement(username).clear();
    	driver.findElement(username).sendKeys(uname);
    }
    public void enterPassword(String passw) {
    	getUtil.waitElemetVisible(30, driver, password);
    	driver.findElement(password).clear();
    	driver.findElement(password).sendKeys(passw);
    }
    public void clickButton() {
    	getUtil.waitElemetClick(30, driver, password);
    	driver.findElement(loginbutton).click();
    }
    public void login_success() {
    	getUtil.waitElemetVisible(30, driver, examiner);
    	WebElement testexam=driver.findElement(examiner);
    	Assert.assertTrue(testexam.isDisplayed(), "Page not loads perfectly");
    }
    
    public void log_out() {
    	getUtil.waitElemetClick(60, driver, logout);
    	driver.findElement(logout).click();
    	getUtil.waitElemetVisible(30, driver, username);
    	driver.quit();
    }
    
    
}
