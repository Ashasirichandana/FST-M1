package project;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.LoginPage;
import java.io.IOException;

public class PrActivity1 extends BaseClass {
    LoginPage loginPage;

    @BeforeMethod
    public void setUp(){
        initialization();
        loginPage = new LoginPage();
    }

    @Test(priority=1)
    public void loginPageTitleTest(){

        String title = loginPage.validateLoginPageTitle();
        Assert.assertEquals(title, "OrangeHRM");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}