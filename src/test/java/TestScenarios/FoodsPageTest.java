package TestScenarios;

import ObjectPages.FoodsPage;
import ObjectPages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FoodsPageTest {

    WebDriver driver;
    HomePage HPage;
    FoodsPage FPage;

    @BeforeMethod
    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        HPage = new HomePage(driver);
         FPage = new FoodsPage(driver);
        driver.get("https://qamyprojects.ccbp.tech/");

    }
    @AfterMethod
    public void TearDown(){
        driver.quit();
    }

    //Test the Foods Page UI
    @Test(priority = 1)
    public void TestFoodsPage(){
        //Navigate to the URL https://qamyprojects.ccbp.tech/
        //Click the Foods image.
        FPage.clickOnFoodsPage();
        //Verify the Title of the Foods page - use Assertions
        //Expected text: Happy Meals
        //If the Title does not match the expected text, print "Title text does not match"

        Assert.assertEquals(FPage.getTitleFoodsPage(),"Happy Meals","Title text does not match");

        //Verify the Description text of the Home page - use Assertions
        //Expected text: Discover the best foods over the 1,000 restaurants
        //If the Description text does not match the expected text, print "Description text does not match"
        Assert.assertEquals(FPage.getDescriptionFoodsPage(),"Discover the best foods over the 1,000 restaurants","Description text does not match");


        //Verify the text of the "Book Now" button - use Assertions
        //If the text is not as expected, print "Button text does not match"
        //Close the browser window.

        Assert.assertEquals(FPage.getTextBookNow(),"Book Now","Button text does not match");
    }

    @Test(priority = 2)
    //Test the Back button
    public void TestBackButton(){
        //Navigate to the URL https://qamyprojects.ccbp.tech/
        //Click the Technology image.

        FPage.clickOnFoodsPage();
        //Click the "Back" button.
        FPage.clickOnBackButton();
        //Verify if the navigation to the Home page is successful
        //Check if the Software developer image is displayed - use Assertions,
        Assert.assertTrue(HPage.findSoftwareDeveloperImage().isDisplayed(),"Back button not working as expected");
        //If the image is not displayed, print "Back button not working as expected"
        //Close the browser window.

    }



}
