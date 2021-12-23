import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"E:/Eclipse/Cucumber/src/test/resources/Features/Adactin_1.feature"},
        plugin = {"json:E:/Eclipse/Cucumber/src/test/resources/Reports/1.json"},
        monochrome = false,
        tags = {"not tag"},
        glue = {"stepdefinitions"})
public class Parallel01IT {
}
