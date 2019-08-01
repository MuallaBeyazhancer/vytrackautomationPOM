package com.vytrack.tests.loginTest;

import com.vytrack.pages.LoginPage;
import com.vytrack.tests.TestBase;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.VytrackUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @BeforeMethod
    public void setUp(){
        driver.get(ConfigurationReader.get("url"));
        driver.manage().window().maximize();
    }
    @Test
    public void loginTestMethod(){
        LoginPage loginPage = new LoginPage();
        VytrackUtils.waitForUIOverlay();
        String usernameStr = ConfigurationReader.get("driver_username");
        String passwordStr = ConfigurationReader.get("driver_password");
        loginPage.login(usernameStr, passwordStr);
    }
}
