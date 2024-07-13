package com.lao.step_definitions;

import com.lao.constants.constants;
import com.lao.pageobjects.Loginpage;
import com.lao.utils.loadproperties;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import webdriver_manager.driver_manager;

public class common_step_definitions {
    private static final Logger logger = LogManager.getLogger(common_step_definitions.class);
    private static String scenarioName =null;
    public static String getScenarioName() {
        return scenarioName;
    }



    @Before
    public void beforescenario(Scenario scenario) {
        logger.info("Execution started");
        try {
            scenarioName = scenario.getName();
            logger.info("loading the properties file");
            loadproperties.getLoadproperty().property();
            logger.info("checking if the driver is null or not");
           if (driver_manager.getDriver() == null) {
                logger.info("driver is null instantiating it");
                driver_manager.launch_browser();
               loadproperties.getLoadproperty().initelements();
              // login();
            }
        } catch (Exception e) {
            e.getMessage();
        }

    }

    private void login() {
        driver_manager.getDriver().get(constants.appurl);
        driver_manager.getDriver().manage().window().maximize();
        Loginpage.getLogininstance().enterusername(constants.username);
        Loginpage.getLogininstance().enterpassword(constants.password);
        Loginpage.getLogininstance().clicklbnbutton();
    }

    // @After
    public void afterscenario(){
        driver_manager.getDriver().quit();

    }
@AfterStep
    public void attachscreenshot(Scenario scenario){

        if(scenario.isFailed()){
           byte[] screenshottaken=  ((TakesScreenshot) driver_manager.getDriver()).getScreenshotAs(OutputType.BYTES);
       scenario.attach(screenshottaken,"image/png","error screen");
        }
    }
}


