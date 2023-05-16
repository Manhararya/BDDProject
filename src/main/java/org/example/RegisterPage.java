package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends Utils{
    // Write all mandatory details xpath
    By _firstName = By.id("FirstName");
    By _lastName = By.id("LastName");
    By _email = By.name("Email");
    By _password = By.id("Password");
    By _confirmPassword = By.id("ConfirmPassword");
    By _registerButton = By.id("register-button");
    By _dateOfBirth =By.name("DateOfBirthDay");
    By _monthOFBirth =By.name("DateOfBirthMonth");
    By _yearOfBirth =By.name("DateOfBirthYear");
    LoadProp loadProp = new LoadProp();

    public void enterRegistrationDetailsWithTimestamp(){
        // Fill all mandatory details
        typeText(_firstName, loadProp.getProperty("firstName"));
        typeText(_lastName, loadProp.getProperty("lastName"));
        selectDropdownByValue(_dateOfBirth, loadProp.getProperty("birthDate"));
        selectDropdownByIndex(_monthOFBirth, Integer.parseInt(loadProp.getProperty("birthMonth")));
        selectDropdownByText(_yearOfBirth,loadProp.getProperty("birthYear"));
        typeText(_email, (loadProp.getProperty("email"))+timestamp()+(loadProp.getProperty("emailDomain")));
        typeText(_password, loadProp.getProperty("password"));
        typeText(_confirmPassword, loadProp.getProperty("confirmPassword"));
        // Click register submit button
        clickOnElement(_registerButton);
    }
    public void enterRegistrationDetailsWithoutTimestamp(){
        // Fill all mandatory details
        typeText(_firstName, loadProp.getProperty("firstName"));
        typeText(_lastName, loadProp.getProperty("lastName"));
        selectDropdownByValue(_dateOfBirth, loadProp.getProperty("birthDate"));
        selectDropdownByIndex(_monthOFBirth, Integer.parseInt(loadProp.getProperty("birthMonth")));
        selectDropdownByText(_yearOfBirth,loadProp.getProperty("birthYear"));
        typeText(_email, loadProp.getProperty("emailWithoutTimestamp"));
        typeText(_password, loadProp.getProperty("password"));
        typeText(_confirmPassword, loadProp.getProperty("confirmPassword"));
        // Click register submit button
        clickOnElement(_registerButton);
    }

    public static void main(String[] args) {
        Select select = new Select(driver.findElement(By.name("country")));
    }
}
