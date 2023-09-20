package ObjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TechnologyPage {

    //Technology Page
    @FindBy(how = How.XPATH,using = "//*[@id='sectionMyProjectsHome']/div/div[1]/img[1]")
    @CacheLookup
    WebElement TechnologyPageLocator;

    //Title of the Technology page
    @FindBy(how = How.XPATH,using = "//*[@id='sectionAdvancedTechnologies']/div/div/h1")
    @CacheLookup
    WebElement TitleTechnologyPageLocator;

    //Description
    @FindBy(how = How.XPATH,using = "//*[@id='sectionAdvancedTechnologies']/div/div/p")
    @CacheLookup
    WebElement DescriptionTechnologyPageLocator;

    //Learn Button
    @FindBy(how = How.XPATH,using = "//*[@id='sectionAdvancedTechnologies']/div/div/button[1]")
    @CacheLookup
    WebElement  LearnMoreButtonLocator;

    //Back Button
    @FindBy(how = How.XPATH,using = "//*[@id='sectionAdvancedTechnologies']/div/div/button[2]")
    @CacheLookup
    WebElement  BackButtonLocator;



    //____________________________________________________________
    WebDriver driver;

    public TechnologyPage(WebDriver driver){
        this.driver  = driver;
        PageFactory.initElements(driver,this);

    }

    //Click on TechnologyPage

    public void clickOnTechnologyPage(){
        TechnologyPageLocator.click();
    }

    //get title technology

    public String getTitleTechnology(){
        return TitleTechnologyPageLocator.getText();
    }

    // get Description

    public String getDescriptionTechnology(){
        return DescriptionTechnologyPageLocator.getText();
    }

    //learn more
    public String getTextLearnMore(){
        return LearnMoreButtonLocator.getText();
    }

    //back Button
    public void clickOnBackButton(){
        BackButtonLocator.click();
    }

}
