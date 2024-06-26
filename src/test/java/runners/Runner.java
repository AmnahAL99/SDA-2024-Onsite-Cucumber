package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "stepdefinitions", // take path
        features = "src/test/resources/features/Features.feature" , // path of my features or by tag
        plugin = {
                "html:cucumber_Rebort/report.html" ,
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
              //  "junit:cucumber_Rebort/report.xml"
        },
        tags = " @mytag",
        dryRun = true

)
public class Runner {

}
