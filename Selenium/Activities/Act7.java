package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Activity7 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

        driver.get("https://v1.training-support.net/selenium/drag-drop");
        System.out.println("Tittle of home page" + driver.getTitle());

        Actions action = new Actions(driver);
        WebElement football = driver.findElement(By.id("draggable"));
        WebElement dropzone1 = driver.findElement(By.id("droppable"));
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));

        action.clickAndHold(football).moveToElement(dropzone1).pause(2000).release().build().perform();

        String dropzone1Verify = dropzone1.findElement(By.tagName("p")).getText();
        if (dropzone1Verify.equals("Dropped!")) {
            System.out.println("Ball was dropped in dropzone 1");
        }

        action.dragAndDrop(football, dropzone2).build().perform();
        String dropzone2Verify = dropzone2.findElement(By.tagName("p")).getText();
        if (dropzone2Verify.equals("Dropped!")) {
            System.out.println("Ball was dropped in dropzone 2");

        }
    }
}