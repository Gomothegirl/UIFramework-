package stepDefinitions.base;

import driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.sql.Timestamp;

import static driver.DriverFactory.getDriver;


public class Hooks {

    @Before
    public void setup() {

        getDriver();
    }
    @AfterStep
    public void captureExeptionImage(Scenario scenario){
        if(scenario.isFailed()){
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String timeMilliSeconds = Long.toString(timestamp.getTime());

            byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", timeMilliSeconds);
        }

    }

    @After
    public void tearDown() {

        DriverFactory.cleanupDriver();
    }
}
