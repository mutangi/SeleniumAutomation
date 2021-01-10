/*
    Copyright (c) Experian, 2019. All rights reserved.
*/
package com.bunev.sample;

import com.bunev.sample.infrastructure.driver.Setup;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * This is a test runner class which is used to run all the cucumber tests at once. It can be
 * configured (using different parameters) to run only a specific suite of tests. This is done via
 * the CucumberOptions parameters.
 */
@Test
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/com/bunev/sample/features/XFashion.feature",
        glue = "com.bunev.sample.step_definitions",
        plugin = {"pretty"},
        strict = true,
        monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {

    /**
     * This method will be executed before the first cucumber test to be started. When executed it
     * will create the Driver instance required for performing the tests.
     */
    @BeforeClass
    public static void openTheBrowser() {
        Setup.getInstance();
        System.out.println("===driver created from test runner===");
    }

    /**
     * This method will be executed after the last cucumber test is finished. When executed it will
     * close the Driver instance required for performing the tests.
     */
    @AfterClass
    public static void closeTheBrowser() {
        Setup.getInstance().quit();
        System.out.println("===driver closed from test runner===");
    }
}
