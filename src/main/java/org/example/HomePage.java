package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HomePage extends Utils{
    // Write Xpath as per requirement
    By _registerButton = By.className("ico-register");
    By _loginButton = By.className("ico-login");
    By _appleMacBookPro13Inch = By.linkText("Apple MacBook Pro 13-inch");
    public String getExpectedBeforeHoverColor="rgba(85, 85, 85, 1)";
    public String getExpectedAfterHoverColor="rgba(74, 178, 241, 1)";

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
    public void mouseHoverOverAction(String category){
        WebElement element = driver.findElement(By.linkText(category));
        Assert.assertEquals(element.getCssValue("color"),getExpectedBeforeHoverColor);

        // Create object of an Actions class
        Actions action = new Actions(driver);
        // Performing the mouse hover action on the target element.
        action.moveToElement(element).perform();

        Assert.assertEquals(element.getCssValue("color"),getExpectedAfterHoverColor);
    }
    public void verifySubcategory(String subCategory){
        clickOnElement(By.linkText(subCategory));
    }
    public void subCategoryOfComputerResult (String subCategoryResult){
        Assert.assertTrue(getCurrentURL().contains(subCategoryResult));
    }
}
