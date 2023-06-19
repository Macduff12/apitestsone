package HotelDoCompany;

import AmazonPage.BasePage;
import org.openqa.selenium.WebDriver;

public class HotelDoCompanyPage extends BasePage {
    public HotelDoCompanyPage(WebDriver driver) {
        super(driver);
    }
    public void navigateHotel() {
        driver.get("http://hotel-do.company.unaux.com/?i=1");
    }
    public boolean mainHeader(){
        waitElementToBeVisible("//a[text()='Послуги']").click();
        waitElementToBeVisible("//a[text()='Профіль']").click();
        waitElementToBeVisible("//a[text()='About']").click();
        waitElementToBeVisible("//a[text()='Команда']").click();
        waitElementToBeVisible("//a[text()='Контакти']").click();
        return false;
    }
}
