package com.cucumber.Util;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetUtil {
	//get property by key
	public String getProperties(String keyname) {
		String getdetails = null;
		Properties prop=new Properties();
		String propertypath=System.getProperty("user.dir")+"//Global.properties";
		try {
			FileInputStream file=new FileInputStream(propertypath);
			prop.load(file);
			getdetails=prop.getProperty(keyname);
			file.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return getdetails;
	}
	//element visible
	public void waitElemetVisible(int timeout,WebDriver driver,By element) {
	new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOfElementLocated(element));
	}
	//element visible
	public void waitElemetClick(int timeout,WebDriver driver,By element) {
	new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	
}
