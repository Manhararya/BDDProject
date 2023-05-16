package org.example;

import org.openqa.selenium.By;

public class AppleMacBookPro13Inch extends Utils{
    //Write xpath
    By _emailAFriend = By.className("email-a-friend");
    public void emailAFriend() {
        // click on email a friend button
        clickOnElement(_emailAFriend);
    }
}
