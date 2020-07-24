package com.weborder.step_definition;

import com.weborder.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmokeTest_Step_Definition {

    LoginPage loginPage=new LoginPage ();
    ViewAllOrdersPage viewAllOrdersPage=new ViewAllOrdersPage ();
    VAPage vap=new VAPage ();
    OrderPages orderPages=new OrderPages ();


    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        loginPage.login ();
    }

    @When("User should click to all menu items")
    public void user_should_click_to_all_menu_items() {
        viewAllOrdersPage.ViewAllOrder.click ();
        vap.viewAllProducts.click ();
        orderPages.order.click ();

    }

    @Then("Verify all menu items and click logOut")
    public void verify_all_menu_items_and_click_logOut() {

        loginPage.logOut.click ();

    }

}
