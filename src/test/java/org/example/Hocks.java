package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hocks extends Utils{
    DriverManager driverManager = new DriverManager();
    @Before
    public void setup(){
        driverManager.openBrowser();
    }
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src, "image/png", "screenshot");
        }
        driverManager.closeBrowser();
    }
}
//@AfterMethod
//public void tearDown(ITestResult result){
//    if(!result.isSuccess()){
//        captureScreenshot(result.getName());
//    }
//
//    driverManager.closeBrowser();
//}