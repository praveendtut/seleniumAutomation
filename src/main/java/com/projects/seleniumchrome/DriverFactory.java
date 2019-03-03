package com.projects.seleniumchrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

	
    public static WebDriver getDriver(BrowserTypeEnum browserTypeEnum) {

        if (browserTypeEnum == null) {
            return new ChromeDriver();
        }
        switch (browserTypeEnum)
        {
            case INTERNET_EXPLORER:
                return new InternetExplorerDriver();
            case FIREFOX:
                return new FirefoxDriver();
            default:
                return new ChromeDriver();
        }
    }
}
