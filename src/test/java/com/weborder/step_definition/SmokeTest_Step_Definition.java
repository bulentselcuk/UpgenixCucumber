package com.weborder.step_definition;

import com.weborder.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SmokeTest_Step_Definition {


    LoginPage loginPage=new LoginPage ();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        loginPage.login ();
    }


    @When("Verify all menu items and click logOut")
    public void verify_all_menu_items_and_click_logOut() {

        loginPage.logOut.click ();

    }

    @When("User click to {string} item")
    public void user_click_to_item(String Menu) {
        loginPage.navigateTo ( Menu );
    }

    @Then("Verify {string}")
    public void verify(String Subtitle) {
        Assert.assertEquals(Subtitle, loginPage.getPageSubtitleText ());

    }
}
