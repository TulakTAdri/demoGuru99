
import org.openqa.selenium.WebDriver;


public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

     public void navigate(String url) {

        driver.get(url);
    }
}
