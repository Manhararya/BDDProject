package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    LoginPage loginPage = new LoginPage();
    AppleMacBookPro13Inch appleMacBookPro13Inch = new AppleMacBookPro13Inch();
    EmailAFriend emailAFriend = new EmailAFriend();
    EmailAFriendResult emailAFriendResult = new EmailAFriendResult();

    @Given("I am on registration page")
    public void i_am_on_registration_page() {
        homePage.clickOnRegisterButton();
    }
    @When("I enter required registration details with timestamp")
    public void i_enter_required_registration_details_with_timestamp() {
        registerPage.enterRegistrationDetailsWithTimestamp();
    }
    @And("I enter required registration details without timestamp")
    public void i_enter_required_registration_details_without_timestamp() {
        registerPage.enterRegistrationDetailsWithoutTimestamp();
    }
    @Then("I should able to register successfully")
    public void i_should_able_to_register_successfully() {
        registerResultPage.getRegistrationResult();
    }
    @And("I am on login page")
    public void i_am_on_login_page() {
        homePage.clickOnLoginButton();
    }
    @And("I enter valid email and password")
    public void i_enter_valid_email_and_password() {
        loginPage.enterLoginAndPassword();
    }
    @And("I click on Apple Mac Book Pro 13Inch")
    public void i_click_on_apple_mac_book_pro_13inch() {
        homePage.clickOnAppleMacBookPro13InchName();
    }
    @And("I click email a friend")
    public void i_click_email_a_friend() {
        appleMacBookPro13Inch.emailAFriend();
    }
    @And("I enter friend's email and message")
    public void i_enter_friend_s_email_and_message() {
        emailAFriend.userEnterEmailDetails();
    }
    @Then("I should email a friend successfully")
    public void i_should_email_a_friend_successfully() {
        emailAFriendResult.userSendAEmailToFriendResult();
    }
}
