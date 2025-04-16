package stepDefinitions.base;

import driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnhandledAlertException;

import java.io.File;
import java.sql.Timestamp;

import static driver.DriverFactory.getDriver;
;


public class Hooks {

    @Before
    public void setup() {

        getDriver();
    }
//    @AfterStep
//    public static void takeScreenshot() {
//        try {
//            File srcFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
//            File destFile = new File("screenshot_" + System.currentTimeMillis() + ".png");
//            FileUtils.copyFile(srcFile, destFile);
//        } catch (UnhandledAlertException e) {
//            System.out.println("Alert prevented screenshot: " + e.getAlertText());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    @After
    public void tearDown() {

        DriverFactory.cleanupDriver();
    }
}
