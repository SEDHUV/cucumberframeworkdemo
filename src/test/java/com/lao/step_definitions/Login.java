package com.lao.step_definitions;


import com.lao.constants.constants;
import com.lao.pageobjects.Loginpage;
import com.lao.utils.loadproperties;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeOptions;
import webdriver_manager.driver_manager;

public class Login {

   private static final Logger logger = LogManager.getLogger(Login.class) ;
    @Given("^user on login page$")
    public void user_on_login_page() throws InterruptedException {
        try {
            logger.info("url opening");
            driver_manager.getDriver().get(constants.appurl);
            driver_manager.getDriver().manage().window().maximize();
        } catch (Exception e) {
            logger.error(e);
//            loadproperties.getLoadproperty().takescreenshot();
        }
    }


    @When("^user enters below credentials header\"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_below_credentials_header_and(String arg1, String arg2) {
        try {
            logger.info("entering credentials");
            Loginpage.getLogininstance().enterusername(arg1);
            Loginpage.getLogininstance().enterpassword(arg2);
            logger.info("credentials entered successfully");
        } catch (Exception e) {
            logger.error(e);
//            loadproperties.getLoadproperty().takescreenshot();
        }
    }

    @When("^clicked login button$")
    public void clicked_login_button() throws InterruptedException {
        try {
            logger.info("clicking log button");
            Loginpage.getLogininstance().clicklbnbutton();
            Thread.sleep(2000);
        }
        catch (Exception e){
            logger.error(e);
//            loadproperties.getLoadproperty().takescreenshot();
        }

    }

    @Then("^user should be navigated to the  homepage$")
    public void user_should_be_navigated_to_the_homepage() throws InterruptedException {
        try {
            String homapage_title= driver_manager.getDriver().getCurrentUrl();
            System.out.println(homapage_title);
            Thread.sleep(2000);
        }catch (Exception e){
            logger.error(e);
//            loadproperties.getLoadproperty().takescreenshot();
        }

    }
    @Then("^user should be locked in the homepage$")
    public void user_should_be_locked_in_the_homepage(){
        String homapage_title= driver_manager.getDriver().getCurrentUrl();
        System.out.println(homapage_title);
        logger.info("captured homepage title");
    }



}
