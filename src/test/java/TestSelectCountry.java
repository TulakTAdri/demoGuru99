import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TestSelectCountry extends BaseTest{
    @Test
    public void SelectCountry() throws InterruptedException {
        BasePage selectCountry=new BasePage(driver);
        selectCountry.navigate("https://demo.guru99.com/test/newtours/register.php");

        Select country = new Select(driver.findElement(By.name("country")));
        country.selectByVisibleText("ANGOLA");

       if(!country.isMultiple()){
           System.out.println("Only 1 option can be selected.");
       }

       assert !country.isMultiple();
    }
}
