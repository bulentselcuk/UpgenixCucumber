package com.weborder.pages;

import com.weborder.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy (id="ctl00_MainContent_username")
    public WebElement username;
    @FindBy (id="ctl00_MainContent_password")
    public WebElement password;
    @FindBy (id="ctl00_MainContent_login_button")
    public WebElement loginButton;

    public void login (){
        String usernameValue =ConfigurationReader.getProperty ( "admin_username" );
        String passwordValue = ConfigurationReader.getProperty ( "admin_password" );
        username.sendKeys ( usernameValue );
        password.sendKeys ( passwordValue, Keys.ENTER );
    }
}
