package com.LibraryCT.pages;

import com.LibraryCT.util.ConfigurationReader;
import com.LibraryCT.util.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "inputEmail")
    private WebElement email;

    @FindBy(id = "inputPassword")
    private WebElement password;

    public String currentRole(String role){
        String roleXpath = "//span[.='"+ role +"']";
        return (Driver.getDriver().findElement(By.xpath(roleXpath))).getText();

    }



    public void openURL(){
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
    }

    public void login(String usernameValue, String passwordValue) {
        email.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }



    public void login() {
        String usernameValue = ConfigurationReader.getProperty("username");
        String passwordValue = ConfigurationReader.getProperty("password");

        email.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }


}
