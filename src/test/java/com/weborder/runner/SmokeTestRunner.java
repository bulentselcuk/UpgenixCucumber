package com.weborder.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith( Cucumber.class )
@CucumberOptions(

        features="src/test/resources/Features",
        glue="com/weborder/step_definition",
        dryRun =false,
        strict = false,
        tags="@smoke_test",
        plugin= {
                "html:target/default-report",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        }

)
public class SmokeTestRunner {


}
