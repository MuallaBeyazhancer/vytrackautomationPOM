package com.vytrack.tests;

import com.vytrack.pages.LoginPage;
import com.vytrack.pages.NavigateBar;
import com.vytrack.pages.activities.CalendarEventsPage;
import com.vytrack.pages.activities.CreateCalendarEventsPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.VytrackUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DateAndTimeTests extends TestBase {
    @BeforeMethod
    public void setUp() {
        driver.get(ConfigurationReader.get("url"));
        driver.manage().window().maximize();
    }
    //    1) Date Time, End date auto adjust
//        1. Log in as Valid user
//        2. Go to Activities -> Calendar Events
//        3. Click on create new calendar event
//        4. Change the start date to future date
//        5. Verify that end date changes to the same date
//        6. Change back the start date to today’s date
//        7. Verify that end date changes back to today’s date
    @Test
    public void dateTime1() {
//        1. Log in as Valid user
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        loginPage.login(username, password);
//        2. Go to Activities -> Calendar Events
        NavigateBar navigateToMenuAndTabPages = new NavigateBar();
        navigateToMenuAndTabPages.selectTabs("Activities", "Calendar Events");
//        3. Click on create new calendar event
        CalendarEventsPage createCalendarPages = new CalendarEventsPage();
        VytrackUtils.waitForUIOverlay();
        createCalendarPages.createCalendarEvent.click();
//        4. Change the start date to future date
        CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();
        createCalendarEventsPage.startDateTable.click();
        VytrackUtils.waitForUIOverlay();
        createCalendarEventsPage.startDate.click();
        VytrackUtils.waitForUIOverlay();
        String startDatestr = createCalendarEventsPage.startDate.getText();
        VytrackUtils.waitForUIOverlay();
        createCalendarEventsPage.endDateTable.click();
        String endDateStr = createCalendarEventsPage.endDate.getText();

//        5. Verify that end date changes to the same date
//        6. Change back the start date to today’s date
//        7. Verify that end date changes back to today’s date
    }
}
