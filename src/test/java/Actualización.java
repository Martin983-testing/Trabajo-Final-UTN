import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.WebDriverSupliter.getChromeDriver;

public class Actualización {

    public static String actualizacion(String firstname, String lastname, String old_passwd, String passwd, String confirmation )
    {
        WebDriver driver = getChromeDriver();

        driver.get("http://automationpractice.com/index.php?controller=identity");

        driver.findElement(By.id("firstname")).sendKeys(firstname);
        driver.findElement(By.id("lastname")).sendKeys(lastname);
        driver.findElement(By.id("old_passwd")).sendKeys(old_passwd);
        driver.findElement(By.id("passwd")).sendKeys(passwd);
        driver.findElement(By.id("confirmation")).sendKeys(confirmation);
        driver.findElement(By.id("newsletter")).click();

        driver.findElement(By.cssSelector(".button-medium:nth-child(1) > span")).click();
        driver.findElement(By.cssSelector(".columns-container")).click();

        return driver.findElement(By.cssSelector(".alert")).getText();
    }}
