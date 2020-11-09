package com.LibraryCT.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/features",
            glue = "com/LibraryCT/StepDefinitions",
            dryRun = false,
         tags = "@search_user",
            publish = true,
            plugin = {
                    "html:target/cucumber-html-report",
                    "json:target/cucumber2.json",
                    "rerun:target/rerun.txt"
            }

    )


    public class CucsRunner {

}


