package com.lao.utils;

import com.lao.constants.constants;
import com.lao.pageobjects.Loginpage;
import com.lao.pageobjects.reactburgermenu;
import com.lao.step_definitions.common_step_definitions;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import webdriver_manager.driver_manager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class loadproperties {
    private static Logger logger= LogManager.getLogger(loadproperties.class);

    private static loadproperties Loadproperty=null;

    private loadproperties(){};
    public static loadproperties getLoadproperty(){

        if (Loadproperty==null){
            Loadproperty= new loadproperties();
        }
        return Loadproperty;
    }

    public void property(){

        Properties properties =new Properties();
try {
    properties.load(getClass().getResourceAsStream("/config.properties"));

}catch (Exception e){
    e.printStackTrace();
}
        constants.appurl = properties.getProperty("App_url");
constants.username= properties.getProperty("Username");
constants.password = properties.getProperty("Password");
constants.driverlocation= properties.getProperty("driver_location");
constants.browserlocation= properties.getProperty("browser_location");
constants.browser = properties.getProperty("Browser");


    }

    public void initelements(){
        PageFactory.initElements(driver_manager.getDriver(), Loginpage.getLogininstance());
        PageFactory.initElements(driver_manager.getDriver(), reactburgermenu.getrbm());
    }
    public void takescreenshot(){
        File screenshot = ((TakesScreenshot)driver_manager.getDriver()).getScreenshotAs(OutputType.FILE);
try {
    FileUtils.copyFile(screenshot,new File(common_step_definitions.getScenarioName()+".png"));
}catch (IOException e){
    System.out.println(e.getMessage());
}

    }

    public void highlightWebElement(WebElement element){
        JavascriptExecutor executor = (JavascriptExecutor) driver_manager.getDriver();
        executor.executeScript("arguments[0].setAttribute('style','border: 3px solid blue');",element);

    }
    public void selectUtility(WebElement element,String HowTo, String value){
        Select select = new Select(element);
        switch (HowTo){
            case "index":
                select.selectByIndex(Integer.parseInt(value));
                break;
            case"text":
                select.selectByVisibleText(value);
                break;
            case"value":
                select.selectByValue(value);
                break;
            default:
                logger.info("enter correct locator");
                break;


        }
    }
}
