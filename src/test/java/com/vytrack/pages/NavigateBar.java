package com.vytrack.pages;


import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigateBar {
    public NavigateBar(){
        PageFactory.initElements(Driver.get(), this);
    }
    //Fleet
    @FindBy(xpath = "//span[@class='title title-level-1'][contains(text(),'Fleet')]")
    public WebElement fleetMenu;
    @FindBy(xpath = "(//span[@class='title title-level-2'][contains(text(),'Vehicles')])[1]")
    public WebElement vehicleUnderFleet;
    //Customer
    @FindBy(xpath = "//span[@class='title title-level-1'][contains(text(),'Customers')]")
    public WebElement customersMenu;
    //    Activities
    @FindBy(xpath = "//span[@class='title title-level-1'][contains(text(),'Activities')]")
    public WebElement activitiesMenu;
    @FindBy(xpath = "//span[@class='title title-level-2'][contains(text(),'Calendar Events')]")
    public WebElement calendarEventsUnderActivities;
    //    System
    @FindBy(xpath = "//span[@class='title title-level-1'][contains(text(),'System')]")
    public WebElement systemMenu;
    //span[@class='title title-level-1'][contains(text(),'Activities')]
    //span[@class='title title-level-2'][contains(text(),'Calendar Events')]
    public void selectTabs(String module, String subModule) {
        Driver.get().findElement(By.xpath("//span[@class='title title-level-1'][contains(text(),'" + module + "')]")).click();
        Driver.get().findElement(By.xpath("//span[@class='title title-level-2'][contains(text(),'" + subModule + "')]")).click();
    }
}