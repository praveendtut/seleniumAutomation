package com.projects.seleniumchrome;

import org.openqa.selenium.WebDriver;

public class Driver {
	
	public static WebDriver webDriver;
	
    public void initializeDriver(BrowserTypeEnum browserTypeEnum){
        webDriver = DriverFactory.getDriver(browserTypeEnum);
    }
    
    public void closeDriver(){
        webDriver.quit();
    }
}
