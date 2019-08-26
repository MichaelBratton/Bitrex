package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class LoginSteps {




    @Given("I login as user")
    public void i_login_as_user() throws InterruptedException{
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        loginPage.login(username, password);


    }

    @Then("I should be on the activity stream")
    public void i_should_be_on_the_activity_stream() {
        Assert.assertTrue(Driver.get().getCurrentUrl().contains("https://login.nextbasecrm.com/stream/"));
    }

}
