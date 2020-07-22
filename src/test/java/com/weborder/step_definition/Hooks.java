package com.weborder.step_definition;
import com.weborder.utilities.ConfigurationReader;
import com.weborder.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("Test setup");
        Driver.getDriver().manage().window().maximize();
        String URL = ConfigurationReader.getProperty("qa1");
        System.out.println("URL : " + URL);
        Driver.getDriver().get(URL);

    }
    @After
    public void tearDown(Scenario scenario) {
        //how to check if scenario failed
        if (scenario.isFailed()) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
            byte[] image = takesScreenshot.getScreenshotAs( OutputType.BYTES);
            //attach screenshot to the report
            scenario.embed(image, "image/png", scenario.getName());
        }
        System.out.println("Test Clean Up");
        Driver.closeDriver();

    }
}