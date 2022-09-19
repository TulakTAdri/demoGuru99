import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectCountry extends BasePage {
    public SelectCountry(WebDriver driver) {
        super(driver);
    }

    Select country = new Select(driver.findElement(By.name("country")));

}
