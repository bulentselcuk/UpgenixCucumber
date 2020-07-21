package com.weborder.step_definition;
import com.weborder.utilities.ConfigurationReader;
import com.weborder.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
       Driver.getDriver().get ( ConfigurationReader.getProperty ( "url" ) );
    }



    @After()
    public void tearDown(){

        Driver.getDriver ().close ();
    }
}