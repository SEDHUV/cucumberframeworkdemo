package com.lao.pageobjects;

import com.lao.utils.loadproperties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class reactburgermenu {

    private static reactburgermenu rbm;

    private reactburgermenu(){};

    public static reactburgermenu getrbm(){
        if(rbm==null){

            rbm = new reactburgermenu();
        }
        return rbm;

    }


    @FindBy(className = "bm-burger-button")
    private WebElement burgerbutton;

    @FindBy(xpath= "//a[@class='bm-item menu-item'][1]")
    private WebElement Allitems;

    @FindBy(xpath = "//a[@class='bm-item menu-item'][2]")
    private WebElement about;

    @FindBy(xpath = "//a[@class='bm-item menu-item'][3]")
    private WebElement logout;

    @FindBy(xpath = "//a[@class='bm-item menu-item'][4]")
   private WebElement reset;
//    public WebElement getBurgerbutton() {
//        return burgerbutton;
//    }
//
//    public WebElement getAbout() {
//        return about;
//    }
//
//    public WebElement getAllitems() {
//        return Allitems;
//    }
//
//    public WebElement getLogout() {
//        return logout;
//    }
//
//    public WebElement getReset() {
//        return reset;
//    }

    public void clickreactburgerbtn(){
        //loadproperties.getLoadproperty().highlightWebElement(burgerbutton);
        burgerbutton.click();
    }
    public void clicklogoutbtn(){
       // loadproperties.getLoadproperty().highlightWebElement(logout);
        logout.click();
    }
}
