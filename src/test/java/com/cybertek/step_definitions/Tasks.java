package com.cybertek.step_definitions;

import com.cybertek.pages.ActivityStreamPage;
import com.cybertek.utilities.BrowserUtils;
import cucumber.api.java.en.Then;
import org.openqa.selenium.NoSuchElementException;

public class Tasks {
    @Then("I navigate to tasks")
    public void i_navigate_to_tasks() {
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        try {
            activityStreamPage.tasks.click();
        } catch (NoSuchElementException e){
            activityStreamPage.activityStream.click();
            activityStreamPage.tasks.click();
        }

    }

    @Then("I set {string} as the title")
    public void i_set_as_the_title(String string) {
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        BrowserUtils.waitForVisibility(activityStreamPage.tasksText, 10);
        activityStreamPage.tasksText.sendKeys(string);
    }

    @Then("I change deadline to {string} {string} {string} {string}")
    public void i_change_deadline_to(String year, String month, String day, String time) throws InterruptedException {
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.setDeadline(year, month, day, time);
        Thread.sleep(5000);
    }
    @Then("I submit the task")
    public void i_submit_the_task() {
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.taskSubmit.click();
    }

}
