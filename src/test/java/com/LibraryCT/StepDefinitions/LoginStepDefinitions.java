package com.LibraryCT.StepDefinitions;

import com.LibraryCT.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        loginPage.openURL();
    }


    @And("user logs in with {string} and {string}")
    public void userLogsInWithAnd(String arg0, String arg1) {
        loginPage.login(arg0, arg1);
    }

    @Then("user should be logged in as {string}")
    public void userShouldBeLoggedInAs(String arg0) {
        Assert.assertEquals(arg0, loginPage.currentRole(arg0) );

    }


    @Given("user is on login page")
    public void userIsOnLoginPage() {
        loginPage.openURL();
    }


    @And("user logs in as librarian")
    public void userLogsInAsLibrarian() {
        loginPage.login();
    }
}




