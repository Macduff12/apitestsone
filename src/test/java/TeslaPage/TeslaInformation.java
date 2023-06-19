package TeslaPage;

import AmazonPage.BasePage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TeslaInformation extends BasePage {
    public TeslaInformation(WebDriver driver) {
        super(driver);
    }
    public void navigateTesla() {
        driver.get("https://www.tesla.com/");
    }
    @Test
    public boolean informationTesla(){
        waitElementToBeVisible("//a[@title='Solar Panels']").click();
        waitElementToBeVisible("//a[@title='Powerwall']").click();
        waitElementToBeVisible("//a[@title='Shop']").click();
        waitElementToBeVisible("//a[@class='tds-site-logo-link']").click();
        waitElementToBeVisible("//a[@title='Account']").click();
        waitElementToBeVisible("//a[@aria-label='Tesla Logo']").click();
        waitElementToBeVisible("//button[@title='Menu']").click();
        waitElementToBeVisible("//a[@title='Existing Inventory']").click();
        return false;
    }
}
