package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "stepdefinition",
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        tags = "@ExpenseApp"
)
public class Runner {
}
