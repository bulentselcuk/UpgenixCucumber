package com.weborder.step_definition;


import com.weborder.pages.LoginPage;
import com.weborder.pages.VAPage;
import com.weborder.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class VAP_Step_Definition {

    public WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();
    VAPage vap = new VAPage();

    @Given("User is on the login page and access with credential.")
    public void user_is_on_the_login_page_and_access_with_credential() {
        loginPage.login();
        vap.clickMenu.click();
    }

    @When("User should verify the subtitle is {string}")
    public void user_should_verify_the_subtitle_is(String title) {
        String expectedSubtitle = title;
        String actualSubtitle = vap.subTitle.getText();
        Assert.assertEquals(expectedSubtitle, actualSubtitle);

    }

    @Then("User should verify the table has three rows")
    public void user_should_verify_the_table_has_three_rows() {



        List<WebElement> rows = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/table[1]/tbody[1]/tr[1]/th"));
        Assert.assertEquals(3, rows.size());


    }
}
