package hrmProject;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.HomePage;
import pages.LoginPage;
import pages.PIMPage;

public class Activity8ApplyLeavesTest extends BaseClass {
    LoginPage loginPage;
    HomePage homePage;
    DashboardPage dashboardPage;


    @BeforeTest
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        loginPage.enterLoginCredentials();
        homePage = loginPage.clickLogin();
    }

    @Test(priority = 1)
    public void navigateToDashboardMenu() {
        dashboardPage = homePage.selectDashboardMenu();
    }

    @Test(priority = 2)
    public void applyLeave() {
        dashboardPage.EnterLeaveDetailsAndApply();
    }

    @Test(priority = 3)
    public void validateAppliedLeaveStatus() {
        dashboardPage.searchAppliedLeave();
        Assert.assertTrue(dashboardPage.getLeaveStatus().contains("Pending Approval"),
                "Applied leave status is not as expected");
    }

    @AfterTest
    public void tearUP() {
        driver.quit();
    }

}