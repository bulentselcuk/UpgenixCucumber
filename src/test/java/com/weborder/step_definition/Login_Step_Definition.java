package com.weborder.step_definition;

import com.weborder.pages.LoginPage;
import com.weborder.utilities.ConfigurationReader;
import com.weborder.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_Step_Definition {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("Open login page");
        String env = "url";
        if (System.getProperty("env") != null) {
            env = System.getProperty("env");
        }
        String URL = ConfigurationReader.getProperty(env);
        System.out.println("URL :: " + URL);
        Driver.getDriver().get(URL);
    }

    @When("user logs in with {string} username and {string} password")
    public void user_logs_in_with_username_and_password(String username, String password) {
        LoginPage loginPage = new LoginPage ();
        loginPage.login ();
    }

    @Then("user should verify that page logo {string} is displayed")
    public void user_should_verify_that_page_logo_is_displayed(String logo) {
        LoginPage loginPage = new LoginPage ();
        Assert.assertEquals ("Web Orders", loginPage.getPageLogoText ()) ;
    }
}
