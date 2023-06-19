package Test;

import TeslaPage.TeslaAllCars;
import TeslaPage.TeslaInformation;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTesla extends TestInit{
    @BeforeTest
    public void apple(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.tesla.com/");
    }

    @Test
    public void mainHeader(){
        TeslaHomePage teslaHomePage = new TeslaHomePage(driver);
        teslaHomePage.navigateTesla();

        teslaHomePage.mainHeader();
    }
    @Test
    public void teslaAllCar(){
        TeslaAllCars teslaAllCars = new TeslaAllCars(driver);
        teslaAllCars.navigateTesla();

        teslaAllCars.teslaAllCars();
    }
    @Test
    public void teslaInformation(){
        TeslaInformation teslaInformation = new TeslaInformation(driver);
        teslaInformation.navigateTesla();

        teslaInformation.informationTesla();
        
        Assert.assertTrue((teslaInformation.informationTesla()));
        
        //  Assert.assertTrue(teslaInformation.informationTesla());

    }
}
