import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class RadioAndCheckButtons extends BasePage {
    public RadioAndCheckButtons(WebDriver driver) {
        super(driver);
    }


    public void radios()  {

        List<WebElement> Btns = driver.findElements(By.xpath("//input[@name='webform']"));
        for (int i = 0; i < Btns.size(); i++) {
            Btns.get(i).click();
        }

    }


}
