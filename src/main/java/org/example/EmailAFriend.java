package org.example;

import org.openqa.selenium.By;

public class EmailAFriend extends Utils{
    // Enter friend's email
    By _friendEmail = By.className("friend-email");
    // Type message
    By _writeMessage = By.id("PersonalMessage");
    // Click on send email button
    By _sendEmail = By.name("send-email");
    LoadProp loadProp = new LoadProp();

    public void userEnterEmailDetails() {
        //connect with Xpath
        typeText(_friendEmail, loadProp.getProperty("friendEmail"));
        // Type message
        typeText(_writeMessage, loadProp.getProperty("writeMessage"));
        // Click on Send email button
        clickOnElement(_sendEmail);
    }
}
