package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class WomenPage extends Utility {
    // Mouse Hover on Women Menu

    @CacheLookup
            @FindBy(xpath = "//a[@id='ui-id-4']//span[contains(text(),'Women')]")
    WebElement womenMenu;
    // Mouse Hover on Tops

    @CacheLookup
            @FindBy(linkText = "Tops")
    WebElement tops;
    // Click on Jackets

    @CacheLookup
            @FindBy(linkText ="Jackets")
    WebElement clickOnJackets;


    @CacheLookup
           @FindBy(xpath = "//div[2]//div[3]//select[1]")
    WebElement selectByFilterProductName;


    @CacheLookup
    @FindBy
    WebElement selectByFilterPrice;

    public void mouseHoverOnWomen() {

        mouseHoverToElement(womenMenu);
        CustomListeners.test.log(Status.PASS,"mouseHover on women Menu " + (womenMenu));
        Reporter.log("MouseHover"+  womenMenu.toString());

    }
    public void mouseHoverOnTop() {
        mouseHoverToElement(tops);
        CustomListeners.test.log(Status.PASS,"MouseHover"+(tops));
        Reporter.log("MouseHover"+tops.toString());
    }
    public void clickOnJacket(){
        clickOnElement(clickOnJackets);
        CustomListeners.test.log(Status.PASS,"clickOnJackets" +(clickOnJackets) );
        Reporter.log("click On jacket"+clickOnJackets.toString() );
    }
    public void selectFiletrFromDropDownList() {
        clickOnElement(selectByFilterProductName);
        CustomListeners.test.log(Status.PASS,"selectByFilterProductName" +(selectByFilterProductName));
        Reporter.log("select ProductName"+ selectByFilterProductName.toString());
    }
    public  void setSelectByFilterPrice() {
        selectByValueFromDropDown(selectByFilterPrice, "price");
        CustomListeners.test.log(Status.PASS, "selectByFilterPrice" + (selectByFilterPrice));
        Reporter.log("select ProductName" + selectByFilterProductName.toString());
    }
}


