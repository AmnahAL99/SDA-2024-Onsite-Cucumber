package stepdefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CommonStepDef {
    WebDriver driver;
    @Given("I open the browser")
    public void i_open_the_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Given("I am on the google homepage")
    public void i_am_on_the_google_homepage() {
        driver.get("https://www.google.com");
    }
    @When("I search for amazon on google")
    public void i_search_for_amazon_on_google() {
        driver.findElement(By.name("q")).sendKeys("amazon" + Keys.ENTER);
    }

    @When("I search for {string} on google")
    public void i_search_for_on_google(String searchInput) {
        driver.findElement(By.name("q")).sendKeys(searchInput + Keys.ENTER);
    }

    @Then("I should see amazon on the results")
    public void i_should_see_amazon_on_the_results() {
        Assert.assertFalse(driver.findElements(By.xpath("//*[contains(text(),'amazon')]")).isEmpty());
    }

    @Then("I should see {string} on the results")
    public void i_should_see_on_the_results(String string) {
        Assert.assertFalse(driver.findElements(By.xpath("//*[contains(text(),'"+string+"')]")).isEmpty());
    }

    @Then("I close the browser")
    public void i_close_the_browser() {
        driver.close();
    }

}
/*
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleAssertionTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Set up WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testTitle() {
        // Navigate to the webpage
        driver.get("https://www.example.com");

        // Get the actual title of the page
        String actualTitle = driver.getTitle();

        // Assert the title using JUnit's assertEquals method
        Assert.assertEquals("Expected title", "Actual title", actualTitle); // Replace "Expected title" and "Actual title" with your expected and actual titles
    }

    @After
    public void tearDown() {
        // Close the WebDriver
        if (driver != null) {
            driver.quit();
        }
    }
}
////////////////////////////////////////////////////////////////////////
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class TitleAssertionSteps {
    private WebDriver driver;
    private String actualTitle;

    @Given("I open the webpage")
    public void i_open_the_webpage() {
        // Set up WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the webpage
        driver.get("https://www.example.com");
    }

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String expectedTitle) {
        // Get the actual title of the page
        actualTitle = driver.getTitle();

        // Assert the title using JUnit's assertEquals method
        Assert.assertEquals(expectedTitle, actualTitle); // Assert the expected title against the actual title
    }


}

 */