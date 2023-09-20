package ObjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;

public class DiwaliPage {

    //diwali page

    @FindBy(how = How.XPATH,using = "//*[@id='sectionMyProjectsHome']/div/div[1]/img[2]")
    @CacheLookup
    WebElement DiwaliImageLocator;


    // Heading Of Diwali Page

    @FindBy(how = How.XPATH,using = "//*[@id='sectionDiwali']/div[1]/h1")
    @CacheLookup
    WebElement HeadingDiwaliLocator;

    //Diwali Page Image

    @FindBy(how = How.CSS,using = ".diwali-top-section")
    @CacheLookup
    WebElement DiwaliBGImageLocator;

    @FindBy(how = How.CLASS_NAME,using = "diwali-card-name")
    @CacheLookup
    List<WebElement> ListDiwaliCardName;


    @FindBy(how = How.CLASS_NAME,using = "diwali-card-price")
    @CacheLookup
    List<WebElement> ListDiwaliCardPrice;

    //Back Button
    @FindBy(how = How.XPATH,using = "//*[@id='sectionDiwali']/div[2]/div[3]/button")
    @CacheLookup
    WebElement  DiwaliBackButtonLocator;


    //_______________________________________________________________

    WebDriver driver;

    public DiwaliPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //click on Diwali Image

    public void clickOnDiwaliImage(){
        DiwaliImageLocator.click();
    }

    // get Heading Diwali

    public String getHeadingDiwali(){
        return HeadingDiwaliLocator.getText();
    }

    //BG Diwali Image
    public WebElement getDiwaliBGImage(){
        return DiwaliBGImageLocator;
    }

    // get List card names

    public String getListCardName(int index){
        return ListDiwaliCardName.get(index).getText();
    }

    public String getListCardPrice(int index){
        return ListDiwaliCardPrice.get(index).getText();
    }

    public void clickOnDiwaliBackButton(){
        DiwaliBackButtonLocator.click();

    }
}
