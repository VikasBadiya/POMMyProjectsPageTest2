package ObjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    //Home Image

    @FindBy(how = How.XPATH,using = "//*[@id='sectionMyProjectsHome']/div/img")
    @CacheLookup
    WebElement SoftwareDeveloperImageLocator;


    // Heading

    @FindBy(how = How.XPATH,using = "//*[@id='sectionMyProjectsHome']/div/h1")
    @CacheLookup
    WebElement HomeHeadingLocator;

    //Description text
    @FindBy(how = How.XPATH,using = "//*[@id='sectionMyProjectsHome']/div/p")
    @CacheLookup
    WebElement HomeDescriptionLocator;

    //____________________________________________________________________________

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    //find Software developer image

    public WebElement findSoftwareDeveloperImage(){
        return SoftwareDeveloperImageLocator;
    }

    //get Home heading

    public String getHomeHeading(){
        return HomeHeadingLocator.getText();
    }

    // get Home Description

    public String getHomeDescription(){
        return HomeDescriptionLocator.getText();
    }



}
