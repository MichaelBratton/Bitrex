package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivityStreamPage extends PageBase {
    @FindBy(id = "feed-add-post-form-tab-tasks")
    public WebElement tasks;
    @FindBy(xpath = "//input[@data-bx-id='task-edit-title']")
    public WebElement tasksText;
    @FindBy(xpath = "//a[@class='bx-calendar-top-month']")
    public WebElement monthSelect;
    @FindBy(id = "blog-submit-button-save")
    public WebElement taskSubmit;
    @FindBy(xpath = "//input[@data-bx-id='datepicker-display']")
    public WebElement deadLineSelect;
    @FindBy(xpath = "//a[@class='bx-calendar-top-year']")
    public WebElement yearSelect;

    public ActivityStreamPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void setDeadline(String year, String month, String day, String time) {

        deadLineSelect.click();
        String[] timeray = time.split(":");
        List<WebElement> boxes = Driver.get().findElements(By.xpath("//input[@class='bx-calendar-form-input']"));
        boxes.get(1).sendKeys(timeray[1]);
        int hour = Integer.parseInt(timeray[0]);
        int x = -(19 - hour) * (-1);
        if (hour > 19) {
            for (int i = 0; i < x; i++) {
                drive.findElement(By.xpath("//a[@class='bx-calendar-form-arrow bx-calendar-form-arrow-top']")).click();
            }
        } else if (hour != 19) {
            for (int i = 0; i < x; i++) {
                drive.findElement(By.xpath("//a[@class='bx-calendar-form-arrow bx-calendar-form-arrow-bottom']")).click();
            }
        }
        Driver.get().findElement(By.xpath("//a[@class='bx-calendar-cell' and contains(text(), '" + day + "')]")).click();
        yearSelect.click();
        Driver.get().findElement(By.xpath("//input[@data-bx-year-input='Y']")).sendKeys(year);
        monthSelect.click();
        Driver.get().findElement(By.xpath("//span[@class='bx-calendar-month' and contains(text(), '" + month + "')]")).click();
        Driver.get().findElement(By.xpath("//span[@class='bx-calendar-button-text' and contains(text(),'Select')]")).click();

    }
}
