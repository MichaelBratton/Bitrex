package com.cybertek.step_definitions;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.junit.After;
import org.junit.Before;

public class Hooks {
    @Before
    public void before(){
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @After
    public void after(){
        Driver.closeDriver();
    }
}
