package TestScenarios;


import ObjectPages.HomePage;
import ObjectPages.NewsPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewsPageTest {

    WebDriver driver;
    HomePage HPage;
    NewsPage NPage;

    @BeforeMethod
    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        HPage = new HomePage(driver);
        NPage = new NewsPage(driver);
        driver.get("https://qamyprojects.ccbp.tech/");

    }
    @AfterMethod
    public void TearDown(){
        driver.quit();
    }
    //Test the News Page UI
    @Test(priority = 1)
    public void TestNewsPageUI(){
        //Navigate to the URL https://qamyprojects.ccbp.tech/
        //Click the News image.
        NPage.clickOnNewsPage();
        //Verify the Category of the News page - use Assertions
        //Expected text: NEWS OF THE DAY
        //If the Category does not match the expected text, print "Category text does not match"

        Assert.assertEquals(NPage.getCategoryName(),"NEWS OF THE DAY","Category text does not match");

        //Verify the Title of the News page - use Assertions
        //Expected text: All educational institutions in Assam to reopen from November 2
        //If the Title does not match the expected text, print "Title text does not match"
        Assert.assertEquals(NPage.getTitleNewsPage(),"All educational institutions in Assam to reopen from November 2","Title text does not match");
        //Verify the Description text of the Home page - use Assertions
        //Expected text: Uttar Pradesh's Gautam Buddh Nagar recorded 107 new Covid-19 cases on Saturday, pushing the district's infection tally to 15,803, official data showed. The number of active cases came down further to 1,384 from 1,477 on Friday and 1,523 on Thursday, according to the data released by the UP Health Department for a 24-hour period.
        //If the Description text does not match the expected text, print "Description text does not match"
        Assert.assertEquals(NPage.getDescriptionNewsPage(),"Uttar Pradesh's Gautam Buddh Nagar recorded 107 new Covid-19 cases on Saturday, pushing the district's infection tally to 15,803, official data showed. The number of active cases came down further to 1,384 from 1,477 on Friday and 1,523 on Thursday, according to the data released by the UP Health Department for a 24-hour period.","Description text does not match");

        //Verify the text of the "Read more" button - use Assertions
        //If the text is not as expected, print "Button text does not match"
        Assert.assertEquals(NPage.getTextReadMoreNewsPage(),"Read more","Button text does not match");
        //Close the browser window.
    }


//Test the Back button

//Click the "Back" button.
//Verify if the navigation to the Home page is successful
//Check if the Software developer image is displayed - use Assertions,
//If the image is not displayed, print "Back button not working as expected"
//Close the browser window.

    @Test(priority = 2)
    //Test the Back button
    public void TestBackButton(){
        //Navigate to the URL https://qamyprojects.ccbp.tech/
        //Click the News image.
        NPage.clickOnNewsPage();
        //Click the "Back" button.
        NPage.clickOnBackButtonNewsPage();
        //Verify if the navigation to the Home page is successful
        //Check if the Software developer image is displayed - use Assertions,
        Assert.assertTrue(HPage.findSoftwareDeveloperImage().isDisplayed(),"Back button not working as expected");
        //If the image is not displayed, print "Back button not working as expected"
        //Close the browser window.

    }




}

