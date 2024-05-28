package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Actions object
        Actions builder = new Actions(driver);

        // Open the page
        driver.get("https://v1.training-support.net/selenium/drag-drop");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // Find the football
        WebElement Football = driver.findElement(By.id("draggable"));
        //Find Dropzone1
        WebElement Drop1 = driver.findElement(By.id("droppable"));
        //Find Dropzne 2
        WebElement Drop2 = driver.findElement(By.id("dropzone2"));

        // Perform drag and drop to dropzone 1
        builder.clickAndHold(Football).moveToElement(Drop1).pause(2000).release().build().perform();
        // Verify that the ball was dropped in dropzone 1
        String dropzone1Verify = Drop1.findElement(By.tagName("p")).getText();
        if(dropzone1Verify.equals("Dropped!")) {
            System.out.println("Ball was dropped in dropzone 1");

        }

        // Perform drag and drop to dropzone 2
        builder.dragAndDrop(Football, Drop2).build().perform();
        // Verify that the ball was dropped in dropzone 2
        String dropzone2Verify = Drop2.findElement(By.tagName("p")).getText();
        if(dropzone2Verify.equals("Dropped!")) {
            System.out.println("Ball was dropped in dropzone 2");
        }

        // Close the browser
        driver.quit();
    }
}
