package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class PageBase {

    @FindBy(xpath = "//a[@title='Activity Stream']")
    public WebElement activityStream;

    @FindBy(xpath = "//a[@title='Tasks']")
    public WebElement tasks;

    @FindBy(xpath = "//a[@title='Chat and Calls']")
    public WebElement chatAndCalls;

    @FindBy(xpath = "//a[@title='Workgroups']")
    public WebElement workGroups;

    @FindBy(xpath = "//a[@title='Drive']")
    public WebElement drive;

    @FindBy(xpath = "//a[@title='Calendar']")
    public WebElement calendar;

    @FindBy(xpath = "//a[@title='Mail']")
    public WebElement mail;

    @FindBy(xpath = "//a[@title='Contact Center']")
    public WebElement contactCenter;

    @FindBy(xpath = "//a[@title='Time and Reports']")
    public WebElement timeAndReports;

    @FindBy(xpath = "//a[@title='Employees']")
    public WebElement employees;

    @FindBy(xpath = "//a[@title='Services']")
    public WebElement services;

    @FindBy(xpath = "//a[@title='Company']")
    public WebElement company;



}
