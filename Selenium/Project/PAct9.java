package hrmProject;

import base.BaseClass;
import org.testng.annotations.*;
import pages.HomePage;
import pages.LoginPage;
import pages.MyInfoPage;

import java.util.List;

public class Activity9RetrieveEmergencyContactTest extends BaseClass {
    LoginPage loginPage;
    HomePage homePage;
    MyInfoPage myInfoPage;

    @BeforeTest
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        loginPage.enterLoginCredentials();
        homePage = loginPage.clickLogin();
    }

    @Test(priority = 1)
    public void navigateEditInfoPage() {
        myInfoPage = homePage.selectMyInfoMenu();
    }

    @Test(priority = 2)
    public void openEmergencyContactSection() {
        myInfoPage.selectEmergencyContactOption();
    }

    @Test(priority = 3)
    public void retrieveEmergencyContactDetails() {
        myInfoPage.getEmergencyContact();
    }

    @AfterTest
    public void tearUP() {
        driver.quit();
    }

}