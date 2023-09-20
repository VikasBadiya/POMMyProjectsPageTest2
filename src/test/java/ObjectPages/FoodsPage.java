package ObjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FoodsPage {
    @FindBy(how = How.XPATH,using = "//*[@id='sectionMyProjectsHome']/div/div[2]/img[1]")
    @CacheLookup
    WebElement FoodPageImageLocator;

    //Title of the Food page
    @FindBy(how = How.XPATH,using = "//*[@id='sectionFoodOrder']/div/div/h1")
    @CacheLookup
    WebElement TitleFoodPageLocator;

    //Description Of FoodPage
    @FindBy(how = How.XPATH,using = "//*[@id='sectionFoodOrder']/div/div/p")
    @CacheLookup
    WebElement DescriptionFoodPageLocator;

    //  Book Now
    @FindBy(how = How.XPATH,using = "//*[@id='sectionFoodOrder']/div/div/button[1]")
    @CacheLookup
    WebElement   BookNowButtonLocator;

    //Back Button
    @FindBy(how = How.XPATH,using = "//*[@id='sectionFoodOrder']/div/div/button[2]")
    @CacheLookup
    WebElement  BackButtonLocator;


    //____________________________________________________________
    WebDriver driver;

    public FoodsPage(WebDriver driver){
        this.driver  = driver;
        PageFactory.initElements(driver,this);

    }

    //Click on FoodsPage

    public void clickOnFoodsPage(){
        FoodPageImageLocator.click();
    }

    //get title FoodsPage

    public String getTitleFoodsPage(){
        return TitleFoodPageLocator.getText();
    }

    // get Description FoodsPage

    public String getDescriptionFoodsPage(){
        return DescriptionFoodPageLocator.getText();
    }

    //Book Now Text
    public String getTextBookNow(){
        return BookNowButtonLocator.getText();
    }

    //back Button
    public void clickOnBackButton(){
        BackButtonLocator.click();
    }


}
