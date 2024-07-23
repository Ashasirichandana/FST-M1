package StepDefinitions;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.datatype.Duration;

public class FirstExample extends BaseClass {
    @BeforeAll
    public static void Setup() {
        //Geko driver setup
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();


    }

    @Given("User is on the homepage")
    public void OpenBrowser() {
        //Open browser
        driver.get("https://v1.training-support.net");
        //Assert if correct page is open
        Assertions.assertEquals("Training Support", driver.getTitle());
    }

    @When("the user clicks on the About Us link")
    public void clickLink() {
        //Click the About Us link
        driver.findElement(By.id("about-link")).click();
    }

    @Then("the user is redirected to the About page")
    public void aboutpage() {
        //Asssertion for page title
        Assertions.assertEquals("About Training Support", driver.getTitle());
    }

    @Then("close the browser")
    public void closebrowser() {
        driver.quit();
    }

}
