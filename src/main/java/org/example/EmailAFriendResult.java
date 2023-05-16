package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriendResult extends Utils{
    // Write xpath
    By _userGetMessage = By.xpath("//div[@class=\"result\"]");
    LoadProp loadProp = new LoadProp();

    public void userSendAEmailToFriendResult () {
        // Get result message
        Assert.assertEquals(getTextFromElement(_userGetMessage),loadProp.getProperty("expectedEmailMessageResult"));
    }
}
