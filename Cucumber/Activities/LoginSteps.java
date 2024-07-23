package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;

import static StepDefinitions.BaseClass.driver;

public class LoginSteps extends BaseClass {
    @Given("User is on Login page")
    public void openLoginPage() {
        //open the page
        driver.get("https://v1.training-support.net/selenium/login-form");
        //Assertion
        Assertions.assertEquals("Login Form", driver.getTitle());
    }

    @When("user enters username and password")
    public void enterCredentials() {
        //find input elements
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        //Find and click login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }


    @When("user enters {string} and {string}")
            public void enterCredentials(String username, String password) {
        //find input elements
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        //Find and click login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("Read the page title and confirmation page")
    public void verifyLoginMessage() {
        //find login message and assert
        String LoginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assertions.assertEquals("Welcome Back, admin", LoginMessage);

    }

}