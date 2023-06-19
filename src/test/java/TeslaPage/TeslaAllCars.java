package TeslaPage;

import AmazonPage.BasePage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TeslaAllCars extends BasePage {
    public TeslaAllCars(WebDriver driver) {
        super(driver);
    }
    public void navigateTesla() {
        driver.get("https://www.tesla.com/");
    }
    @Test
    public void teslaAllCars(){
        waitElementToBeVisible("//a[@title='Model S']").click();

        waitElementToBeVisible("//a[@aria-label='Tesla Logo']").click();
        waitElementToBeVisible("//a[@title='Model 3']").click();
        waitElementToBeVisible("//a[@aria-label='Tesla Logo']").click();
        waitElementToBeVisible("//a[@title='Model X']").click();
        waitElementToBeVisible("//a[@aria-label='Tesla Logo']").click();
        waitElementToBeVisible("//a[@title='Model Y']").click();
        waitElementToBeVisible("//a[@aria-label='Tesla Logo']").click();
        waitElementToBeVisible("//a[@title='Solar Roof']").click();
        waitElementToBeVisible("//a[@aria-label='Tesla Logo']").click();
    }
}
