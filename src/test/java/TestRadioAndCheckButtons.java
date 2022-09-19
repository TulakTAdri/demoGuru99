import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestRadioAndCheckButtons extends BaseTest {
    @Test
    public void RadioAndCheckButtons() {
        BasePage radiobtns = new BasePage(driver);
        radiobtns.navigate("https://demo.guru99.com/test/radio.html");

        /*WebElement radioBtn1 = driver.findElement(By.id("vfb-7-1"));
        radioBtn1.click();
        assert radioBtn1.isSelected();
        System.out.println(radioBtn1.isSelected());*/

        RadioAndCheckButtons radioAndCheckButtons = new RadioAndCheckButtons(driver);
        radioAndCheckButtons.radios();
        assert driver.findElement(By.id("vfb-7-3")).isSelected();
        assert !driver.findElement(By.id("vfb-7-2")).isSelected();
        assert !driver.findElement(By.id("vfb-7-1")).isSelected();
        assert driver.findElement(By.id("vfb-6-0")).isSelected();
        assert driver.findElement(By.id("vfb-6-2")).isSelected();
        assert driver.findElement(By.id("vfb-6-1")).isSelected();

    }

}
