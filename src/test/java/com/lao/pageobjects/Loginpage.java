package com.lao.pageobjects;

import com.lao.utils.loadproperties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {

    private static Loginpage logininstance;

    private Loginpage(){};

    public static Loginpage getLogininstance(){
        if(logininstance==null){

            logininstance = new Loginpage();
        }
          return logininstance;

    }


    @FindBy(id = "user-name")
   private WebElement username;
    @FindBy(id="password")
  private WebElement password;

    @FindBy(id="login-button")
    private WebElement loginbtn;

//we can only create webelements like below
//    public WebElement getUsername() {
//        return username;
//    }
//    public WebElement getPassword() {
//        return password;
//    }
//    public WebElement getLoginbtn() {
//        return loginbtn;
//    }

    public void enterusername(String Username){
        loadproperties.getLoadproperty().highlightWebElement(username);
        username.sendKeys(Username);

    }
    public void enterpassword(String Password){
        loadproperties.getLoadproperty().highlightWebElement(password);
        password.sendKeys(Password);

    }
    public void clicklbnbutton(){
        loadproperties.getLoadproperty().highlightWebElement(loginbtn);
        loginbtn.click();

    }
}
