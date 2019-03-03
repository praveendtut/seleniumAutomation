package com.projects.seleniumchrome;

/**
 * Hello world!
 *
 */
public class AutomationTask 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Driver chromeDriverSetup = new Driver();
        chromeDriverSetup.initializeDriver(BrowserTypeEnum.CHROME);
        Driver.webDriver.get("https://www.facebook.com");
        //chromeDriverSetup.closeDriver();
    }
}
