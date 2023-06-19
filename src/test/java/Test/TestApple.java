package Test;

import ApplePage.AppleHomePage;
import ApplePage.AppleIphoneInfo;
import ApplePage.AppleSearchResults;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestApple extends TestInit{

    @BeforeTest
    public void apple(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.apple.com/ua/");
    }

    @Test
    public void checkApple(){
        AppleHomePage appleHomePage = new AppleHomePage(driver);
        appleHomePage.navigateApple();

        appleHomePage.mainHeader();

        Assert.assertTrue(appleHomePage.mainHeader());
    }



    @Test
    public void getSearchField(){
        AppleSearchResults appleSearchResults = new AppleSearchResults(driver);
        appleSearchResults.navigateApple();

        appleSearchResults.getSearchField();
        Assert.assertTrue(appleSearchResults.getSearchField());
    }

    @Test
    public void getIphone(){
        AppleIphoneInfo appleIphoneInfo = new AppleIphoneInfo(driver);
        appleIphoneInfo.navigateApple();

        appleIphoneInfo.getAppleIphoneInfo();

        Assert.assertEquals(getClass(), appleIphoneInfo);
    }
}
