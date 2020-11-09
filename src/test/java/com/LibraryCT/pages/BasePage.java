package com.LibraryCT.pages;

import com.LibraryCT.util.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


// it's abstract so no one can create an object from it, we don't need it for that purpose
public abstract class BasePage {

    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver,5);
    /*
all web elements on header/meny go here
all methods that interact with this page go here
method example: clickUser(), clickBooks(), clickDashboard()
 */


    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


}