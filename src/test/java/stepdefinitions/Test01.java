package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
public class Test01 {

        private WebDriver driver;

        @Given("I am on the Google search page")
        public void iAmOnTheGoogleSearchPage() {
            driver = new ChromeDriver();
            driver.get("https://www.google.com");
        }

        @When("I enter {string} in the search bar")
        public void iEnterTermInTheSearchBar(String term) {
            driver.findElement(By.name("q")).sendKeys(term);
        }

        @When("I submit the search")
        public void iSubmitTheSearch() {
            driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
        }

        @Then("I should see results for {string}")
        public void iShouldSeeResultsForTerm(String term) {
            String pageTitle = driver.getTitle();
            Assert.assertTrue(pageTitle.contains(term));
            driver.quit();
        }
    }


