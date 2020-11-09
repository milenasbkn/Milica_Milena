package com.LibraryCT.StepDefinitions;

import com.LibraryCT.pages.UserPage;
import com.LibraryCT.util.ConfigurationReader;
import com.LibraryCT.util.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class UserStepDefinitions {

    UserPage userPage = new UserPage();

    @When("user click on Users in the top-menu bar")
    public void userClickOnUsersInTheTopMenuBar() {
        userPage.clickUsers();
    }

    @And("user select ACTIVE in Status dropdown")
    public void userSelectACTIVEInStatusDropdown() {
        userPage.selectingActiveStatus();
    }

    @And("user navigates to search box to enter desirable name")
    public void userNavigatesToSearchButtonToEnterDesirableName() {
      userPage.enterSearchName();
    }

    @Then("user is able to see searched result got filtered out")
    public void userIsAbleToSeeSearchedResultGotFilteredOut() {
        String actualName = Driver.getDriver().findElement(By.xpath("//td[.='Zula Hudson']")).getText();

        String expectedName = ConfigurationReader.getProperty("searchedName");
        Assert.assertEquals(actualName, expectedName);
    }




}
