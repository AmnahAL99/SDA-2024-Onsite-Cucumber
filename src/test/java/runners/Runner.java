package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "stepdefinitions", // take path
        features = "src/test/resources/features/Features.feature" , // path of my features or by tag
        plugin = {
                "html:cucumber_Rebort/report.html"
        },
        tags = " @mytag",
        dryRun = true

)
public class Runner {

}
