package TestScenarios;

import ObjectPages.HomePage;
import ObjectPages.TechnologyPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TechnologyPageTest {
    WebDriver driver;
    HomePage HPage;
    TechnologyPage TechPage;

    @BeforeMethod
    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        HPage = new HomePage(driver);
        TechPage = new TechnologyPage(driver);
        driver.get("https://qamyprojects.ccbp.tech/");

    }

    @AfterMethod
    public void TearDown(){
        driver.quit();
    }

// Test the Technology Page UI


    @Test(priority = 1)
    public void TestTechnologyPage(){
        //Navigate to the URL https://qamyprojects.ccbp.tech/
        //Click the Technology image.
        TechPage.clickOnTechnologyPage();
        //Verify the Title of the Technology page - use Assertions
        //Expected text: Advanced Technologies
        //If the Title does not match the expected text, print "Title text does not match"
        Assert.assertEquals(TechPage.getTitleTechnology(),"Advanced Technologies","Title text does not match");

        //Verify the Description text of the Home page - use Assertions
        //Expected text: Machinery and equipment developed from the application of scientific knowledge.
        //If the Description text does not match the expected text, print "Description text does not match"
        Assert.assertEquals(TechPage.getDescriptionTechnology(),"Machinery and equipment developed from the application of scientific knowledge.","Description text does not match");
       //Verify the text of the "Learn more" button - use Assertions
        //If the text is not as expected, print "Button text does not match"

        Assert.assertEquals(TechPage.getTextLearnMore(),"Learn more","Button text does not match");
        //Close the browser window.

    }

    @Test(priority = 2)
    //Test the Back button
    public void TestBackButton(){
        //Navigate to the URL https://qamyprojects.ccbp.tech/
        //Click the Technology image.

        TechPage.clickOnTechnologyPage();
        //Click the "Back" button.
        TechPage.clickOnBackButton();
        //Verify if the navigation to the Home page is successful
        //Check if the Software developer image is displayed - use Assertions,
        Assert.assertTrue(HPage.findSoftwareDeveloperImage().isDisplayed(),"Back button not working as expected");
        //If the image is not displayed, print "Back button not working as expected"
        //Close the browser window.

    }


}
