package Project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class PrActivity7 {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Test
    public void addQualifications() {
        // Open OrangeHRM page
        driver.get("http://alchemy.hguy.co/orangehrm");

        // Login with credentials
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("orange");

        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("orangepassword123");

        WebElement loginBtn = driver.findElement(By.id("btnLogin"));
        loginBtn.click();

        // Click on My Info menu
        WebElement myInfoMenu = driver.findElement(By.id("menu_pim_viewMyDetails"));
        myInfoMenu.click();

        // Click on Qualifications option
        WebElement qualificationsOption = driver.findElement(By.xpath("//ul[@id='sidenav']//a[contains(text(),'Qualifications')]"));
        qualificationsOption.click();

        // Click on Add Work Experience
        WebElement addWorkExperienceBtn = driver.findElement(By.id("addWorkExperience"));
        addWorkExperienceBtn.click();

        // Fill in Work Experience details
        WebElement companyName = driver.findElement(By.id("experience_employer"));
        companyName.sendKeys("ABC Company");

        WebElement jobTitle = driver.findElement(By.id("experience_jobtitle"));
        jobTitle.sendKeys("Software Engineer");

        WebElement fromDate = driver.findElement(By.id("experience_from_date"));
        fromDate.sendKeys("2024-01-01");

        WebElement toDate = driver.findElement(By.id("experience_to_date"));
        toDate.sendKeys("2024-12-31");

        // Save the work experience
        WebElement saveBtn = driver.findElement(By.id("btnWorkExpSave"));
        saveBtn.click();
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
