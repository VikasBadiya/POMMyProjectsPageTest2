package TestScenarios;

import ObjectPages.DiwaliPage;
import ObjectPages.HomePage;
import ObjectPages.TechnologyPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DiwaliPageTest {

    WebDriver driver;
    HomePage HPage;
    TechnologyPage TechPage;
    DiwaliPage DPage;

    @BeforeMethod
    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        HPage = new HomePage(driver);
        TechPage = new TechnologyPage(driver);
        DPage = new DiwaliPage(driver);
        driver.get("https://qamyprojects.ccbp.tech/");

    }

    @AfterMethod
    public void TearDown(){
        driver.quit();
    }
    //Test the Diwali Page UI
    @Test(priority = 1)
    public void TestDiwaliPageUI(){
        //Navigate to the URL https://qamyprojects.ccbp.tech/
        //Click the Diwali image.

        DPage.clickOnDiwaliImage();

        //Verify the Heading of the Diwali page - use Assertions
        //Expected text: Celebrate Diwali with your friends
        //If the Heading text does not match the expected text, print "Heading text does not match"

        Assert.assertEquals(DPage.getHeadingDiwali(),"Celebrate Diwali with your friends","Heading text does not match");

        //Verify if all four Diwali item images are displayed - use Assertions,
        //If the images are not displayed, print "Diwali item images are not displayed"
        Assert.assertTrue(DPage.getDiwaliBGImage().isDisplayed(),"Diwali item images are not displayed");

        //Verify all four Diwali item names and their order- use Assertions,
        //Order: "Diwali Air Balloon", "Diwali - Lamp", "Sparklers", "Fire Cracker"
        Assert.assertEquals(DPage.getListCardName(0),"Diwali Air Balloon","Diwali item names and order does not match");

        Assert.assertEquals(DPage.getListCardName(1),"Diwali - Lamp","Diwali item names and order does not match");


        Assert.assertEquals(DPage.getListCardName(2),"Sparklers","Diwali item names and order does not match");


        Assert.assertEquals(DPage.getListCardName(3),"Fire Cracker","Diwali item names and order does not match");

        //If the item names and order do not match, print "Diwali item names and order does not match"
        //Verify all four Diwali item prices and their order- use Assertions,
        //Order: "Rs 369", "Rs 50", "Rs 150", "Rs 560"
        Assert.assertEquals(DPage.getListCardPrice(0),"Rs 369","Diwali item prices and order does not match");

        //If the item prices and order do not match, print "Diwali item prices and order does not match"
        Assert.assertEquals(DPage.getListCardPrice(1),"Rs 50","Diwali item prices and order does not match");

        Assert.assertEquals(DPage.getListCardPrice(2),"Rs 150","Diwali item prices and order does not match");

        Assert.assertEquals(DPage.getListCardPrice(3),"Rs 560","Diwali item prices and order does not match");


        //Close the browser window.
    }

    //Test the Back button
    @Test(priority = 2)
    public void TestBackButton(){
        //Navigate to the URL https://qamyprojects.ccbp.tech/
        //Click the Diwali image.
        DPage.clickOnDiwaliImage();
        //Click the "Back" button.
        DPage.clickOnDiwaliBackButton();
        //Verify if the navigation to the Home page is successful
        //Check if the Software developer image is displayed - use Assertions,
        //If the image is not displayed, print "Back button not working as expected"
        Assert.assertTrue(HPage.findSoftwareDeveloperImage().isDisplayed(),"Back button not working as expected");
        //Close the browser window.

    }












}
