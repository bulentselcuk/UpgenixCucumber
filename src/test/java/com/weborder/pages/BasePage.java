package com.weborder.pages;

import com.weborder.utilities.BrowserUtilities;
import com.weborder.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 25);

    @FindBy(tagName = "h1")
    public WebElement pageLogo;

    @FindBy(xpath="//a[.='Logout']")
    public WebElement logOut;


//    @FindBy(tagName = "h2")
//    public WebElement pageSubtitle;

//    public String getPageSubtitleText(){
//        BrowserUtilities.waitForPageToLoad(10);
//        return pageSubtitle.getText().trim();
//    }

    public String getPageLogoText() {
        return pageLogo.getText();
    }

    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}
