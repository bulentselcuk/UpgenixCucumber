package com.weborder.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewAllOrdersPage extends BasePage{

    @FindBy(xpath="//a[.='View all orders']")
    public WebElement ViewAllOrder;

    @FindBy(id="ctl00_MainContent_btnCheckAll")
    public WebElement checkAll;
    @FindBy(xpath="//a[@id='ctl00_MainContent_btnUncheckAll']")
    public WebElement unceheckAll;
    @FindBy(xpath="//input[@id='ctl00_MainContent_btnDelete']")
    public WebElement deleteSelected;
//    @FindBy(xpath="//a[@id='ctl00_logout']")
//    public WebElement logOut;
    @FindBy(xpath="//tr[2]//td[13]//input[1]")
    public WebElement editOrder;
    @FindBy(xpath="//input[@class='btn_dark']")
    public WebElement calculate;
    @FindBy(xpath="//a[@id='ctl00_MainContent_fmwOrder_UpdateButton']")
    public WebElement update;
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
