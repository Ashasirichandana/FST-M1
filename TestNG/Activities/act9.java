package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity9 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();

        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.switchTo().defaultContent();
    }

    @Test
    public void simpleAlertTestCase() {
        driver.findElement(By.id("simple")).click();
        Alert simpleAlert = driver.switchTo().alert();
        Assert.assertEquals(simpleAlert.getText(), "This is a JavaScript Alert!");
        simpleAlert.accept();
    }

    @Test
    public void confirmAlertTestCase(){
        driver.findElement(By.id("confirm")).click();
        Alert confirmAlert = driver.switchTo().alert();
        Assert.assertEquals(confirmAlert.getText(), "This is a JavaScript Confirmation!");
        confirmAlert.accept();
    }

    @Test
    public void promptAlertTestCase(){
        driver.findElement(By.id("prompt")).click();
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("Test");
        Assert.assertEquals(promptAlert.getText(), "This is a JavaScript Prompt!");
        promptAlert.accept();
    }

    @AfterClass
    public void tearDown() {
        //Close the browser
        driver.quit();
    }

}