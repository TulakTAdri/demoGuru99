import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewTours extends BasePage {
    public NewTours(WebDriver driver) {
        super(driver);
    }

    //private final By inputName = By.name("userName");
    private final By inputPwd = By.name("password");
    private final By submitBtn = By.name("submit");

    WebElement inputName= driver.findElement(By.name("userName"));

    public void Registration(String name, String pwd) {
        //driver.findElement(inputName).sendKeys(name);
        inputName.sendKeys(name);
        driver.findElement(inputPwd).sendKeys(pwd);
        //driver.findElement(submitBtn).click();
        driver.findElement(submitBtn).submit();
    }

}
