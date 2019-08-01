package com.vytrack.pages.activities;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCalendarEventsPage {
    public CreateCalendarEventsPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css ="input[id^='date_selector_oro_calendar_event_form_start-uid']")
    public WebElement startDateTable;

    @FindBy(xpath = "//a[.='31']")
    public WebElement startDate;

    @FindBy(css ="input[id^='date_selector_oro_calendar_event_form_end-uid")
    public WebElement endDateTable;

    @FindBy(css = "//a[.='31']")
    public WebElement endDate;

}
