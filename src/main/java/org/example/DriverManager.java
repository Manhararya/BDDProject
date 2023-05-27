package org.example;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils {
    public boolean SAUCE_LAB = true;
    LoadProp loadProp = new LoadProp();
    public String USERNAME = loadProp.getProperty("SAUCE_USERNAME");
    public String ACCESS_KEY = loadProp.getProperty("SAUCE_ACCESS_KEY");
    public String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.eu-central-1.saucelabs.com/wd/hub";
    public String browserName = loadProp.getProperty("browser");
    MutableCapabilities sauceOptions = new MutableCapabilities();

    //String browserName =loadProp.getProperty("browser");
    public void openBrowser() {
        if (SAUCE_LAB) {
            System.out.println("Running in SauceLab........with browser " + browserName);

            if (browserName.equalsIgnoreCase("Chrome")) {
                ChromeOptions browserOptions = new ChromeOptions();
                browserOptions.setExperimentalOption("w3c", true);
                browserOptions.setCapability("platformName", "Windows 10");
                browserOptions.setCapability("browserVersion", "112");
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    driver = new RemoteWebDriver(new URL(URL), browserOptions);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            } else if (browserName.equalsIgnoreCase("Firefox")) {
                FirefoxOptions browserOptions = new FirefoxOptions();
                browserOptions.setCapability("platformName", "Windows 10");
                browserOptions.setCapability("browserVersion", "latest");
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    driver = new RemoteWebDriver(new URL(URL), browserOptions);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            } else if (browserName.equalsIgnoreCase("Edge")) {
                EdgeOptions browserOptions = new EdgeOptions();
                browserOptions.setCapability("platformName", "Windows 10");
                browserOptions.setCapability("browserVersion", "latest");
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    driver = new RemoteWebDriver(new URL(URL), browserOptions);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
        } else
            System.out.println("Running in local machine........with browser " + browserName);
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
            System.out.println("Your browser name is wrong or not implemented :" + browserName);
        }

        // Create URL driver
        driver.get(loadProp.getProperty("url"));
        // Create window maximize driver
        driver.manage().window().maximize();
        // Create timeout driver
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void closeBrowser() {
        driver.close();
    }
}
