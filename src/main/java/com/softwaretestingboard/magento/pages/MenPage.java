package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;



    public class MenPage extends Utility {

        // Mouse Hover on Men Menu

           @CacheLookup
                @FindBy(xpath = "//a[@id='ui-id-5']//span[contains(text(),'Men')]")
           WebElement menMenu;
        // Mouse Hover on Bottoms
        @CacheLookup
                @FindBy(xpath ="//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]")
                        WebElement bottoms;
                        //Click on Pants
        @CacheLookup
                @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
                WebElement clickOnPants;
        @CacheLookup
                @FindBy(xpath ="//select[@id='sorter']" )
                WebElement selectFromDropDown;
       // By selectFromDropDown=By.xpath ("//select[@id='sorter']");
        @CacheLookup
                @FindBy(xpath = "//strong[@class='product name product-item-name']//a[@class='product-item-link']")
                WebElement cronusYogaPant;
        // Click on Pants
      //  By CronusPant32 = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");
        @CacheLookup
                @FindBy(xpath ="//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']" )
                WebElement CronusPant32;
       // By blackColour=By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-LnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9tZW4vYm90dG9tcy1tZW4vcGFudHMtbWVuLmh0bWw_cHJvZHVjdF9saXN0X29yZGVyPW5hbWU%2C/product/880/']//button[@class='action tocart primary'] ");
        @CacheLookup
               @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-color-93-LnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9tZW4vYm90dG9tcy1tZW4vcGFudHMtbWVuLmh0bWw_cHJvZHVjdF9saXN0X29yZGVyPW5hbWU%2C/product/880/']//button[@class='action tocart primary'] ")
               WebElement blackColour;
       // By CronusBlackColour = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");
        @CacheLookup
               @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']")
               WebElement CronusBlackColour;

        //By buttonAddToCart = By.xpath("//form[@action='https://magento.softwaretestingboard.com/checkout/cart/add/uenc/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9tZW4vYm90dG9tcy1tZW4vcGFudHMtbWVuLmh0bWw_cHJvZHVjdF9saXN0X29yZGVyPW5hbWU%2C/product/880/']//button[@class='action tocart primary']");
        @CacheLookup
                @FindBy(xpath = "\"//form[@action='https://magento.softwaretestingboard.com/checkout/cart/add/uenc/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9tZW4vYm90dG9tcy1tZW4vcGFudHMtbWVuLmh0bWw_cHJvZHVjdF9saXN0X29yZGVyPW5hbWU%2C/product/880/']//button[@class='action tocart primary']")
                WebElement buttonAddToCart;
       // By addToCart = By.xpath("(//span[text() ='Add to Cart'])[1]");
        @CacheLookup
               @FindBy(xpath ="//div[@data-product-id='880']" )
               WebElement addToCart;
       // By productName =By.xpath("//div[@data-product-id='880']");
        @CacheLookup
               @FindBy(xpath ="//div[@data-product-id='880']" )
          WebElement productName;
        //By shoppingCart = By.xpath("//div[@class='page messages']//a[contains(text(),'shopping cart')]");
        @CacheLookup
                @FindBy(xpath ="//div[@class='page messages']//a[contains(text(),'shopping cart')]" )
                        WebElement shoppingCart;
       // By selectByProductName = By.xpath("//select[@id='sorter']");
        @CacheLookup
               @FindBy(xpath ="//select[@id='sorter']" )
               WebElement selectByProductName;
       // By successMessage = By.xpath("//div[@class='message-success success message']");
        @CacheLookup
               @FindBy(xpath ="//div[@class='message-success success message']" )
               WebElement successMessage;
       // By verifyShoppingCartText = By.xpath("//main[@id='maincontent']//h1");
        @CacheLookup
               @FindBy(xpath ="//main[@id='maincontent']//h1" )
               WebElement verifyShoppingCartText;

      //  By verifyProductName = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
        @CacheLookup
              @FindBy(xpath ="//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']" )
              WebElement verifyProductName;
        //By verifyProductSize = By.xpath("//dd[contains(text(),'32')]");
        @CacheLookup
                @FindBy(xpath = "//dd[contains(text(),'32')]")
                WebElement verifyProductSize;
       // By verifyProductColour = By.xpath("//dd[contains(text(),'Black')]");
        @CacheLookup
        @FindBy(xpath ="//dd[contains(text(),'Black')]" )
        WebElement verifyProductColour;

        public void mouseHoverOnMenMenu(){
            mouseHoverToElement(menMenu);
            CustomListeners.test.log(Status.PASS,"menMenu");
            Reporter.log("mouse hover on menMenu"+ menMenu.toString());
        }
        public void mouseHoverOnBottoms(){
            mouseHoverToElement(bottoms);
            CustomListeners.test.log(Status.PASS,"bottoms");
            Reporter.log("mouseHoverOnBottoms"+bottoms.toString());
        }
        public void clickOnPants(){
            clickOnElement(clickOnPants);
            CustomListeners.test.log(Status.PASS,"clickOnPants");
            Reporter.log("click on Element"+clickOnPants.toString());
        }
        // Mouse Hover on product name‘Cronus Yoga Pant’ and click on size 32.
        public void cronusYogaPantAndClickOnSize32(){
            mouseHoverToElementAndClick(cronusYogaPant);
            CustomListeners.test.log(Status.PASS,"mouse hover to Element and Click");
            Reporter.log("mouseHoverToElement"+cronusYogaPant.toString());
        }
//Mouse Hover on product name‘Cronus Yoga Pant’ and click on colour Black.

        public void cronusYogaPantAndColourBlack(){
            mouseHoverToElementAndClick(blackColour);
            CustomListeners.test.log(Status.PASS,"blackColour");
            Reporter.log("mouse hover to element and click"+blackColour.toString());
        }
        public void mouseHoverOnProductName(){
            mouseHoverToElementAndClick(productName);
            CustomListeners.test.log(Status.PASS,"productName");
            Reporter.log("mouse hover to element and click"+productName.toString() );
        }
        public void addToCart(){
            clickOnElement(addToCart);
            CustomListeners.test.log(Status.PASS,"addToCart");
            Reporter.log("click on Element"+addToCart.toString());
            //mouseHoverToElementAndClick(addToCart,"Add to Cart");
            List<WebElement> multiElement = driver.findElements(By.xpath("//div[@class='message-success success message']");

            System.out.println("Total Items are: " + multiElement.size());
            for (WebElement list : multiElement) {
                String name1 = list.getText();
                System.out.println(name1);

            }

        }

        public String getSuccessMsgText() {
            return getTextFromElement(successMessage);
        }

        public String getShoppingCartText() {
            return getTextFromElement(verifyShoppingCartText);
        }
    }

