package com.weborder.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VAPage extends BasePage{

    @FindBy(xpath="//a[.='View all products']")
    public WebElement viewAllProducts;

    @FindBy(xpath="//a[contains(text(),'View all products')]")
    public WebElement clickMenu;
    @FindBy (tagName="h2")
    public WebElement subTitle;
    @FindBy (xpath="//body//tr//tr[1]")
    public WebElement table;
}
