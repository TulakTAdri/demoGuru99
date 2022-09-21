import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActionEvents extends BaseTest {
    @Test
    public void ActionEvents() throws InterruptedException {

        BasePage actionEvents = new BasePage(driver);
        actionEvents.navigate("https://demo.guru99.com/test/newtours/");

        WebElement link_Home = driver.findElement(By.linkText("Home"));

       /* Action mouseOverHome = builder
                .moveToElement(link_Home)
                .build();

        //WebElement td_Home = driver.findElement(By.xpath("a[contains(text(), \"Home\")]/../../../td[1]"));
        WebElement tdHome = driver.findElement(By
                        .xpath("//html/body/div"
                                + "/table/tbody/tr/td"
                                + "/table/tbody/tr/td"
                                + "/table/tbody/tr/td"
                                + "/table/tbody/tr"));
        String bgColourMouseOut = tdHome.getCssValue("background-color");
        System.out.println(bgColourMouseOut);

        mouseOverHome.perform();
        WebElement tdHomeMod = driver.findElement(By
                .xpath("//html/body/div"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr"));
        String bgColourMouseHover = tdHomeMod.getCssValue("background-color");
        System.out.println(bgColourMouseHover);

       Assertions.assertNotEquals(bgColourMouseOut, bgColourMouseHover);*/


        //WebElement InputUserName = new WebDriverWait(driver, (10))
        //      .until(ExpectedConditions.presenceOfElementLocated(By.name("userName")));
        WebElement InputUserName = driver.findElement(By.name("userName"));
        Actions builder = new Actions(driver);
        Action seriesOfAction = builder
                .moveToElement(InputUserName)
                .click()
               .keyDown(InputUserName, Keys.SHIFT)
                .sendKeys(InputUserName, "hello")
                .keyUp(InputUserName, Keys.SHIFT)
                .doubleClick(InputUserName)
                .contextClick()
                .build();
        seriesOfAction.perform();
        Thread.sleep(300);
    }
}
