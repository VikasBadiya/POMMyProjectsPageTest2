package TestScenarios;

import ObjectPages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest {

    WebDriver driver;
    HomePage HPage;

    @BeforeMethod
    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        HPage = new HomePage(driver);
        driver.get("https://qamyprojects.ccbp.tech/");

    }

    @AfterMethod
    public void TearDown(){
        driver.quit();
    }
    //Test the Home Page UI
    @Test(priority = 1)
    public void TestHomePageUI(){
        //Navigate to the URL https://qamyprojects.ccbp.tech/
        //Verify if the Software developer image is displayed - use Assertions,
        //If the Software developer image is not displayed, print "Software developer image is not displayed"
        Assert.assertTrue(HPage.findSoftwareDeveloperImage().isDisplayed(),"Software developer image is not displayed");

        //Verify the Heading text of the Home page - use Assertions
        //Expected text: My Projects
        //If the Heading text does not match the expected text, print "Heading text does not match"

        Assert.assertEquals(HPage.getHomeHeading(),"My Projects","Heading text does not match");

        //Verify the Description text of the Home page - use Assertions
        //Expected text: These are a few of my Static Website projects that I have developed using HTML, CSS and Bootstrap
        //If the Description text does not match the expected text, print "Description text does not match"
        Assert.assertEquals(HPage.getHomeDescription(),"These are a few of my Static Website projects that I have developed using HTML, CSS and Bootstrap","Description text does not match");
        //Close the browser window.

    }



}
