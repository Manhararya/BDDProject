package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    // Write Xpath as per requirement
    By _registerButton = By.className("ico-register");
    By _loginButton = By.className("ico-login");
    By _appleMacBookPro13Inch = By.linkText("Apple MacBook Pro 13-inch");

    public void clickOnRegisterButton(){
        //connect with Xpath
        clickOnElement(_registerButton);
    }
    public void clickOnLoginButton(){
        //connect with Xpath
        clickOnElement(_loginButton);
    }
    public void clickOnAppleMacBookPro13InchName(){
        //connect with Xpath
        clickOnElement( _appleMacBookPro13Inch);
    }
}
