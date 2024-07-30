package activities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args){
// Set GecoDriver
        WebDriverManager.firefoxdriver().setup();
// Create object of FirefoxDriver
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/");
        System.out.println("Home page tittle" + driver.getTitle());
        driver.findElement(By.cssSelector("#about-link")).click();
        System.out.println("Tittle after clicking about link" + driver.getTitle());
        driver.quit();
    }
}