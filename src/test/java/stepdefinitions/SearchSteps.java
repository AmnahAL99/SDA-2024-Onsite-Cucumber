package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;

import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class SearchSteps {
    @Given("the user navigates to the {string} page")
    public void the_user_navigates_to_the_page(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
    @Then("the user waits for {int} seconds")
    public void the_user_waits_for_seconds(Integer sec) throws InterruptedException {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
    }
    @Then("the user verifies that the page title contains {string}")
    public void the_user_verifies_that_the_page_title_contains(String title) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(title));
    }
    @Then("the user closes the page")
    public void the_user_closes_the_page() {
        Driver.closeDriver();
    }

}


