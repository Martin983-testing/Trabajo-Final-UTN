import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpdatePersonalInformation {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = WebDriverSupliter.getChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        WebDriverSupliter.quitDriver();
    }

    @Test
    public void test() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

        Login.autentication("m.rost.91@gmail.com","123456");

        String resultado_esperado = Actualización.actualizacion( "Martin", "Rostagno", "123456", "123456","123456");
        assertEquals("Your personal information has been successfully updated.", resultado_esperado);
    }
}