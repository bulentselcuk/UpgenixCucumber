package com.weborder.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPages extends BasePage{

    @FindBy(xpath="//a[contains(text(),'Order')]")
    public WebElement order;





    @FindBy(xpath="//div[@class='buttons_process']//input[@class='btn_dark']")
    public WebElement reset;
    @FindBy(xpath="//a[@id='ctl00_MainContent_fmwOrder_InsertButton']")
    public WebElement process;

    @FindBy(xpath="//input[@class='btn_dark']")
    public WebElement calculate;

    @FindBy(xpath="//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")
    public WebElement product;
    @FindBy(xpath="//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']")
    public WebElement quantity;
    //        ************************************
//        Address Information
    @FindBy(xpath="//input[@id='ctl00_MainContent_fmwOrder_txtName']")
    public WebElement customerName;
    @FindBy(xpath="//input[@id='ctl00_MainContent_fmwOrder_TextBox2']")
    public WebElement street;
    @FindBy(xpath="//input[@id='ctl00_MainContent_fmwOrder_TextBox3']")
    public WebElement city;
    @FindBy (xpath="//input[@id='ctl00_MainContent_fmwOrder_TextBox5']")
    public WebElement zip;
    //        *************************************
//         Payment Information
    @FindBy(xpath="//input[@id='ctl00_MainContent_fmwOrder_cardList_2']")
    public WebElement card;
    @FindBy(xpath="//input[@id='ctl00_MainContent_fmwOrder_TextBox6']")
    public WebElement cardNr;
    @FindBy(xpath="//input[@id='ctl00_MainContent_fmwOrder_TextBox1']")
    public WebElement expire;


}
