package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils {
    // Create maven dependency for Driver manager
    DriverManager driverManager = new DriverManager();

    //Create before method
    @BeforeMethod
    public void setUp(){
        driverManager.openBrowser();
    }

    //Create after method
    @AfterMethod
    public void tearDown(){
        driverManager.closeBrowser();
    }
}
