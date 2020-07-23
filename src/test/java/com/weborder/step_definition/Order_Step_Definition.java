package com.weborder.step_definition;


import com.weborder.pages.LoginPage;
import com.weborder.pages.OrderPages;
import com.weborder.pages.ViewAllOrdersPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class Order_Step_Definition {

    LoginPage loginPage=new LoginPage ();
    OrderPages orderPages=new OrderPages ();

    @Given("User is on the login page and acces with credential and click Order menu")
    public void user_is_on_the_login_page_and_acces_with_credential_and_click_Order_menu() {
        loginPage.login ();
        orderPages.order.click ();
    }

    @When("User should fill Product Information and click Calculate")
    public void user_should_fill_Product_Information_and_click_Calculate() {
        Select sel = new Select(orderPages.product);
        sel.selectByVisibleText ( "ScreenSaver" );
        orderPages.quantity.clear ();
        orderPages.quantity.sendKeys ( "5" );
        orderPages.calculate.click ();

    }
    @When("User should fill Address Information and Payment Information then click Reset button")
    public void user_should_fill_Address_Information_and_Payment_Information_then_click_Reset_button() {

        orderPages.customerName.clear ();
        orderPages.customerName.sendKeys ( "Michael Moore" );
        orderPages.street.clear ();
        orderPages.street.sendKeys ( "1923, Louetta Dr" );
        orderPages.city.clear ();
        orderPages.city.sendKeys ( "Austin" );
        orderPages.zip.clear ();
        orderPages.zip.sendKeys ( "77573" );
        //        ***************************
        orderPages.card.click ();
        orderPages.cardNr.clear ();
        orderPages.cardNr.sendKeys ( "657473543219" );
        orderPages.expire.clear ();
        orderPages.expire.sendKeys ( "07/15" );
        orderPages.reset.click ();

    }

    @When("user should fill Product Information and click Calculate2")
    public void user_should_fill_Product_Information_and_click_Calculate2() {

        Select sel = new Select(orderPages.product);
        sel.selectByVisibleText ( "ScreenSaver" );
        orderPages.quantity.clear ();
        orderPages.quantity.sendKeys ( "5" );
        orderPages.calculate.click ();

    }

    @Then("User should fill Address Information and Payment Information then click Process button")
    public void user_should_fill_Address_Information_and_Payment_Information_then_click_Process_button() {

        orderPages.customerName.clear ();
        orderPages.customerName.sendKeys ( "Michael Moore" );
        orderPages.street.clear ();
        orderPages.street.sendKeys ( "1923, Louetta Dr" );
        orderPages.city.clear ();
        orderPages.city.sendKeys ( "Austin" );
        orderPages.zip.clear ();
        orderPages.zip.sendKeys ( "77573" );
        //        ***************************
        orderPages.card.click ();
        orderPages.cardNr.clear ();
        orderPages.cardNr.sendKeys ( "657473543219" );
        orderPages.expire.clear ();
        orderPages.expire.sendKeys ( "07/15" );
        orderPages.process.click ();
    }

}
