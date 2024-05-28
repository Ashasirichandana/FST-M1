package activities;
// Imports
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1{
    public static void main(String[] args) throws InterruptedException {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();
        //create object for firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser page to test
        driver.get("https://training-support.net/");

        //Print title of page
        String pageTitle=driver.getTitle();
        System.out.println("Homepage title is" + pageTitle);
        //In case you want to slow the execution to see-but never use this in real executiion
        Thread.sleep(2000);
        //Find About Us link and click
        driver.findElement(By.linkText("About Us")).click();
        Thread.sleep(2000);
        //print title of new page
        String newpageTitle=driver.getTitle();
        System.out.println("About Us page title is" +newpageTitle);
        Thread.sleep(2000);


        //close the browser
        driver.quit();

    }
}
