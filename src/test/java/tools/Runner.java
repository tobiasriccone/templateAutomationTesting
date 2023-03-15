package tools;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps"
)

public class Runner {

    @AfterClass
    public static void closeDriver(){
        BasePage.quitDriver();
    }

}