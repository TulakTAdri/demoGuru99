import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestNewTours extends BaseTest {

    @Test
    public void Newtours() {
        BasePage basePage = new BasePage(driver);
        basePage.navigate("https://demo.guru99.com/test/newtours/");

        String expectedUrl = "https://demo.guru99.com/test/newtours/";
        String actualUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expectedUrl, actualUrl);

        String expectedTitle = "Welcome: Mercury Tours";
        String currentTitle = driver.getTitle();
        Assertions.assertEquals(expectedTitle, currentTitle);

        NewTours newTours = new NewTours(driver);
        newTours.Registration("TAdri", "vmi");
    }

    /*@Test
    public void HomeLink() {

    }*/


}
