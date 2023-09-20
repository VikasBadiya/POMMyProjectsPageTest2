package ObjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewsPage {
    @FindBy(how = How.XPATH,using = "//*[@id='sectionMyProjectsHome']/div/div[2]/img[2]")
    @CacheLookup
    WebElement NewsPageImageLocator;

    // Category of the News page

    @FindBy(how = How.XPATH,using = "//*[@id='sectionNews']/div/div/p[1]")
    @CacheLookup
    WebElement CategoryNewsPageLocator;

    //Title of the News page
    @FindBy(how = How.XPATH,using = "//*[@id='sectionNews']/div/div/h1")
    @CacheLookup
    WebElement TitleNewsPageLocator;

    //Description Of NewsPage
    @FindBy(how = How.XPATH,using = "//*[@id='sectionNews']/div/div/p[2]")
    @CacheLookup
    WebElement DescriptionNewsPageLocator;

    //Read More
    @FindBy(how = How.XPATH,using = "//*[@id='sectionNews']/div/div/button[1]")
    @CacheLookup
    WebElement   ReadMoreButtonLocator;

    //Back Button
    @FindBy(how = How.XPATH,using = "//*[@id='sectionNews']/div/div/button[2]")
    @CacheLookup
    WebElement  BackButtonLocator;

    //____________________________________________________________
    WebDriver driver;

    public NewsPage(WebDriver driver){
        this.driver  = driver;
        PageFactory.initElements(driver,this);

    }

    // get Category name

    public String getCategoryName(){
        return CategoryNewsPageLocator.getText();
    }

    //Click on TechnologyPage

    public void clickOnNewsPage(){
        NewsPageImageLocator.click();
    }

    //get title NewsPage

    public String getTitleNewsPage(){
        return TitleNewsPageLocator.getText();
    }

    // get Description NewsPage

    public String getDescriptionNewsPage(){
        return DescriptionNewsPageLocator.getText();
    }

    //Read More Text
    public String getTextReadMoreNewsPage(){
        return ReadMoreButtonLocator.getText();
    }

    //back Button
    public void clickOnBackButtonNewsPage(){
        BackButtonLocator.click();
    }


}
