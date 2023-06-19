package Test;

import AmazonPage.AmazonHomePage;
import AmazonPage.AmazonHeadsets;
import AmazonPage.AmazonSearchResultsPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertTrue;

public class TestAmazon extends TestInit {
    @BeforeTest
    public void amazon(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
    }
    @Test
    public void getHeadset() {
        AmazonHeadsets amazonHeadsets = new AmazonHeadsets(driver);
        amazonHeadsets.navigateAmazon();

        amazonHeadsets.getSearchField();
        amazonHeadsets.moveToAll();
        amazonHeadsets.clickToAll();


    }
    @Test
    public void AmazonHomePage(){
        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.navigateAmazon();

        amazonHomePage.actionMoveToElementTestAmazon();
        amazonHomePage.actionClickAmazon();
        amazonHomePage.actionDoubleClickAmazon();
        amazonHomePage.getCart().click();
        amazonHomePage.getAmazonPage().click();
        amazonHomePage.clickKeyBoard().click();
        amazonHomePage.getAmazonPage().click();

        Assert.assertTrue(amazonHomePage.actionDoubleClickAmazon().isDisplayed());
        Assert.assertTrue(amazonHomePage.getCart().isDisplayed());
        Assert.assertTrue(amazonHomePage.getAmazonPage().isDisplayed());
        Assert.assertTrue(amazonHomePage.clickKeyBoard().isDisplayed());
        Assert.assertTrue(amazonHomePage.getAmazonPage().isDisplayed());
    }

    @Test
    public void AmazonSearchResults(){
        AmazonSearchResultsPage amazonSearchResultsPage = new AmazonSearchResultsPage(driver);
        amazonSearchResultsPage.navigateAmazon();

        amazonSearchResultsPage.actionSearch();
        amazonSearchResultsPage.clickSearchField().sendKeys("Close\n");
        amazonSearchResultsPage.getAmazonPageSearch().click();
        amazonSearchResultsPage.clickSearchBooks().sendKeys("Books\n");
        amazonSearchResultsPage.getAmazonPageSearch().click();
        amazonSearchResultsPage.clickSearchPhones().sendKeys("Phones\n");
        amazonSearchResultsPage.getAmazonPageSearch().click();
        amazonSearchResultsPage.clickSearchShoes().sendKeys("Shoes\n");

        Assert.assertTrue(amazonSearchResultsPage.getAmazonPageSearch().isDisplayed());
        Assert.assertTrue(amazonSearchResultsPage.clickSearchField().isDisplayed());
        Assert.assertTrue(amazonSearchResultsPage.actionSearch().isDisplayed());
        Assert.assertTrue(amazonSearchResultsPage.clickSearchBooks().isDisplayed());
        Assert.assertTrue(amazonSearchResultsPage.clickSearchPhones().isDisplayed());
        Assert.assertTrue(amazonSearchResultsPage.clickSearchBooks().isDisplayed());
        Assert.assertTrue(amazonSearchResultsPage.clickSearchShoes().isDisplayed());
    }



    @AfterTest
    public void close(){
        driver.quit();
    }



}
