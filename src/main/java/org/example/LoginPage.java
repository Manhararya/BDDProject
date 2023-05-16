package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils{
    //Click on email button
    By _email = By.id("Email");
    //Click on password button
    By _password = By.id("Password");
    //Click on login button
    By _login = By.xpath("//button[contains(@class,\"button-1 login-button\")]");
    LoadProp loadProp = new LoadProp();
    public void enterLoginAndPassword(){
        // Enter your email address
        typeText(_email, loadProp.getProperty("emailWithoutTimestamp"));
        // Enter Password
        typeText(_password, loadProp.getProperty("password"));
        // Click Log in button
        clickOnElement(_login);
    }
}
