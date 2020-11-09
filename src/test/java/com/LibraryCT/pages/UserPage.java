package com.LibraryCT.pages;

import com.LibraryCT.util.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/*
all web elements on user page go here
all methods that interact with this page go here
method example: click(), gettext()
 */
public class UserPage extends BasePage {

    @FindBy(xpath = "//a[@href='#users']")
    private WebElement usersButton;


    @FindBy(xpath = "//input[@class='form-control input-sm input-small input-inline']")
    private WebElement searchBox;

    @FindBy(xpath = "//select[@id='user_status']")
    private WebElement statusDropdown;


    public void clickUsers(){
        usersButton.click();
    }


    public void enterSearchName(){
        searchBox.sendKeys(ConfigurationReader.getProperty("searchedName")+ Keys.ENTER);
    }

    public void selectingActiveStatus(){
        Select select = new Select(statusDropdown);
        select.selectByVisibleText("ACTIVE");
    }


}

