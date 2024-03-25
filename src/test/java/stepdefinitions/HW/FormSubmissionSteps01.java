package stepdefinitions.HW;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class FormSubmissionSteps01 {
    private WebDriver driver;

    @Given("I navigate to the form page")
    public void navigateToFormPage() {
        driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
    }

    @When("I fill in the form with {string}, {string}, {string}, {string}")
    public void fillInForm(String firstname, String username, String age, String country) {
        WebElement firstnameInput = driver.findElement(By.id("firstname"));
        firstnameInput.sendKeys(firstname);

        WebElement usernameInput = driver.findElement(By.id("surname"));
        usernameInput.sendKeys(username);

        WebElement ageInput = driver.findElement(By.id("age"));
        ageInput.sendKeys(age);

        WebElement countrySelect = driver.findElement(By.id("country"));
        countrySelect.sendKeys(country);
    }

    @When("I submit the form")
    public void submitForm() {
        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
        submitButton.click();
    }

    @Then("I should see a success message")
    public void verifySuccessMessage() {
        WebElement successMessage = driver.findElement(By.xpath("//h1[normalize-space()='Input Validation Response']"));
        Assert.assertTrue(successMessage.isDisplayed());
        driver.quit();
    }
}
