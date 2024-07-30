package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Activity4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

        driver.get("https://v1.training-support.net/selenium/target-practice");
        System.out.println("Tittle of home page" + driver.getTitle());

        System.out.println("3rd header: " + driver.findElement(By.id("third-header")).getText());

        System.out.println("5th header: " + driver.findElement(By.cssSelector(".ui.green.header"))
                .getCssValue("color"));

        System.out.println("Violet Button : " + driver.findElement(By.xpath("//*[text()='Violet']"))
                .getAttribute("class"));
        System.out.println("Violet Button : " + driver.findElement(By.cssSelector(".ui.grey.button")).getText());
        driver.close();
    }
}