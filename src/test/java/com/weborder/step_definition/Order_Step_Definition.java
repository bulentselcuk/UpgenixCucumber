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
    }

    @When("User should fill Product Information and click Calculate")
    public void user_should_fill_Product_Information_and_click_Calculate() {


    }
    @When("User should fill Address Information and Payment Information then click Reset button")
    public void user_should_fill_Address_Information_and_Payment_Information_then_click_Reset_button() {

    }

    @When("user should fill Product Information and click Calculate2")
    public void user_should_fill_Product_Information_and_click_Calculate2() {

    }

    @Then("User should fill Address Information and Payment Information then click Process button")
    public void user_should_fill_Address_Information_and_Payment_Information_then_click_Process_button() {

    }


}
