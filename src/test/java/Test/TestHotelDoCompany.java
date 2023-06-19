package Test;

import HotelDoCompany.HotelDoCompanyPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestHotelDoCompany extends TestInit{
    @BeforeTest
    public void hotel(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hotel-do.company.unaux.com/?i=1");
    }
    @Test
    public void hotelTest(){
        HotelDoCompanyPage hotelDoCompanyPage = new HotelDoCompanyPage(driver);
        hotelDoCompanyPage.navigateHotel();

        hotelDoCompanyPage.mainHeader();
        Assert.assertTrue(hotelDoCompanyPage.mainHeader());
    }
}
