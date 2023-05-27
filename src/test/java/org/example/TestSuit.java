package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    // Create on connector
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    LoginPage loginPage = new LoginPage();
    AppleMacBookPro13Inch appleMacBookPro13Inch = new AppleMacBookPro13Inch();
    EmailAFriendResult emailAFriendResult = new EmailAFriendResult();
    EmailAFriend emailAFriend = new EmailAFriend();

    //Create all Test suit
    @Test
    public void verifyUserShouldBeAbleToRegisterSuccessfully() {
//        click on register button
        homePage.clickOnRegisterButton();
//        fill in registration details
        registerPage.enterRegistrationDetailsWithTimestamp();
//        verify user registered successfully
        registerResultPage.getRegistrationResult();
    }
    @Test
    public void verifyUserShouldBeAbleToReferAProductToFriend(){
        //click on register button
        homePage.clickOnRegisterButton();
        //fill in registration details
        registerPage.enterRegistrationDetailsWithoutTimestamp();
        homePage.clickOnLoginButton();
        loginPage.enterLoginAndPassword();
        homePage.clickOnAppleMacBookPro13InchName();
        appleMacBookPro13Inch.emailAFriend();
        emailAFriend.userEnterEmailDetails();
        emailAFriendResult.userSendAEmailToFriendResult();
    }
}
