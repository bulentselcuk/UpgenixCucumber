package com.weborder.step_definition;

import com.weborder.pages.LoginPage;
import com.weborder.pages.ViewAllOrdersPage;
import com.weborder.utilities.BrowserUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ViewAllOrdersPage_Step_Definition {
    LoginPage loginPage=new LoginPage ();
    ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage();

    @Given("User is on the login page and acces with credential.")
    public void user_is_on_the_login_page_and_acces_with_credential() {

        loginPage.login ();
        viewAllOrdersPage.ViewAllOrder.click ();

    }

    @When("User should click CheckAll button")
    public void user_should_click_CheckAll_button() {
        LoginPage loginPage=new LoginPage ();
        BrowserUtilities.wait ( 3 );

        viewAllOrdersPage.checkAll.click ();

    }

    @When("User should click UncheckAll button")
    public void user_should_click_UncheckAll_button() {

        viewAllOrdersPage.unceheckAll.click ();
    }

    @When("User should click FirstEdit button")
    public void user_should_click_FirstEdit_button() {

        viewAllOrdersPage.editOrder.click ();
    }

    @When("User should fill Product Information and click Calculate.")
    public void user_should_fill_Product_Information_and_click_Calculate() {

        Select s1=new Select ( viewAllOrdersPage.product );
        s1.selectByVisibleText ( "FamilyAlbum" );
        viewAllOrdersPage.quantity.clear ();
        viewAllOrdersPage.quantity.sendKeys ( "3" );
        viewAllOrdersPage.calculate.click ();

    }

    @When("User should fill Address Information and Payment Information then click Reset button.")
    public void user_should_fill_Address_Information_and_Payment_Information_then_click_Reset_button() {

        viewAllOrdersPage.customerName.clear ();
        viewAllOrdersPage.customerName.sendKeys ( "Michael Moore" );
        viewAllOrdersPage.street.clear ();
        viewAllOrdersPage.street.sendKeys ( "1923, Louetta Dr" );
        viewAllOrdersPage.city.clear ();
        viewAllOrdersPage.city.sendKeys ( "Austin" );
        viewAllOrdersPage.zip.clear ();
        viewAllOrdersPage.zip.sendKeys ( "77573" );
//        ***************************
        viewAllOrdersPage.card.click ();
        viewAllOrdersPage.cardNr.clear ();
        viewAllOrdersPage.cardNr.sendKeys ( "657473543219" );
        viewAllOrdersPage.expire.clear ();
        viewAllOrdersPage.expire.sendKeys ( "07/15" );
        viewAllOrdersPage.update.click ();

    }

    @When("User should click CheckAll button.")
    public void user_should_click_CheckAll_button2() {

        viewAllOrdersPage.checkAll.click ();
    }

    @Then("User should click Delete button")
    public void user_should_click_Delete_button() {

        viewAllOrdersPage.deleteSelected.click ();
    }

}