import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

public class TestAlertPopup extends BaseTest {
    @Test
    public void Alert() throws InterruptedException {
        BasePage alertpopup = new BasePage(driver);
        alertpopup.navigate("https://demo.guru99.com/test/delete_customer.php");

        WebElement inputCustomerID = driver.findElement(By.name("cusid"));
        inputCustomerID.sendKeys("hello");
        WebElement SubmitBtn = driver.findElement(By.name("submit"));
        SubmitBtn.submit();
        //driver.switchTo().alert().accept();

        /*//kiíratom az alert szövegét és úgy ok-zom le
        Alert alert = driver.switchTo().alert();
        String alertMsg = alert.getText();
        System.out.println(alertMsg);
        alert.accept();*/

        //dinamikus alert kezelése - hol felugrik, hol nem
        //1. megoldás
/*        try {
            WebDriverWait wait = new WebDriverWait(driver, 60);
            if (wait.until(ExpectedConditions.alertIsPresent())== null) {
                System.out.println("Alert not displayed.");
            } else {
                driver.switchTo().alert().accept();
            }
        }*/

        //2. megoldás
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (NoAlertPresentException ne) {
            System.out.println("Alert not displayed.");
            ne.printStackTrace();       //kiíratjuk a részleteket is a konzolra
        }

    }

    @Test // Multiple windows = több ablak használata párhuzamosan
    public void PopupWindow() {
        BasePage popupWindow = new BasePage(driver);
        popupWindow.navigate("http://demo.guru99.com/popup.php");

        WebElement ClickBtn = driver.findElement(By.xpath("//a[contains(text(), \"Click\")]"));
        ClickBtn.click();

        String mainWindow = driver.getWindowHandle();       //parent window-hoz
        Set<String> windows = driver.getWindowHandles();    //egy set-ben kezeljük a többi ablakot
        Iterator<String> i = windows.iterator();           //
        while (i.hasNext()) {
            String ChildWindow = i.next();
            if (!mainWindow.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                System.out.println("The child window is:" + ChildWindow);
                driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
                driver.findElement(By.name("btnLogin")).submit();
                driver.close();
                driver.switchTo().window(mainWindow);
            } else {
                System.out.println("There are no children.");
            }
        }

        /*String childWindow = null;
        while (i.hasNext()) {
            childWindow = i.next();
        }

        driver.switchTo().window(childWindow);  //switch to the popup window
        driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
        driver.findElement(By.name("btnLogin")).submit();
        //driver.close();

        driver.switchTo().window(mainWindow);   //back to the parent window*/
    }
}
