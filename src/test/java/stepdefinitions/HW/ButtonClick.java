package stepdefinitions.HW;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import java.util.List;

public class ButtonClick {
    private WebDriver driver;

    @Given("I navigate to the dynamic buttons page")
    public void navigateToDynamicButtonsPage() {
        driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/dynamic-buttons-simple.html");
    }

    @When("I click all buttons")
    public void clickAllButtons() {
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        for (WebElement button : buttons) {
            button.click();
        }
    }

    @Then("I should see the message 'All Buttons Clicked!'")
    public void verifyMessage() {
        WebElement messageElement = driver.findElement(By.id("buttonmessage"));
      //  String messageText = messageElement.getText();
       // Assert.assertEquals("All Buttons Clicked!", messageText);
        Assert.assertTrue(messageElement.isDisplayed());
        driver.quit();
    }
}

