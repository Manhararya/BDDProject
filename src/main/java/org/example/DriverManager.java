package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils{
    LoadProp loadProp = new LoadProp();
    String browserName =loadProp.getProperty("browser");
    public void openBrowser() {
        // Create ChromeDriver dependency
        if (browserName.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } // Create FireFox dependency
        else if (browserName.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } // Create Edge dependency
        else if (browserName.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } // If browser name is wrong or not implemented
        else {
            System.out.println("Your browser name is wrong or not implemented :"+browserName);
        }
        // Create URL driver
        driver.get(loadProp.getProperty("url"));
        // Create window maximize driver
        driver.manage().window().maximize();
        // Create timeout driver
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void closeBrowser(){
        driver.close();
    }
}
