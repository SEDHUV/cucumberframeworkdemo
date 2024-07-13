package com.lao.step_definitions;


import com.lao.pageobjects.Loginpage;
import com.lao.pageobjects.reactburgermenu;
import com.lao.utils.loadproperties;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import webdriver_manager.driver_manager;


public class Logout {
   private static final Logger logger = LogManager.getLogger(Logout.class) ;

   @Then("user should able to logout")
   public void user_should_able_to_logout() throws InterruptedException {
      try {
         logger.info("clicking burger button");
         reactburgermenu.getrbm().clickreactburgerbtn();
         Thread.sleep(2000);
         logger.info("clicking logout button");
         reactburgermenu.getrbm().clicklogoutbtn();
         System.out.println(driver_manager.getDriver().getCurrentUrl());

      }catch (Exception e){
         logger.error(e);
//         loadproperties.getLoadproperty().takescreenshot();
         Assert.fail(e.getMessage());
      }

   }


}
