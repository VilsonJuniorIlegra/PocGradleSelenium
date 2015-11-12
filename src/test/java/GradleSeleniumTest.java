import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by vilson on 11/11/15.
 */
public class GradleSeleniumTest {
    private WebDriver driver;

    @Test
    public void testeGradleSelenium(){
        driver = new ChromeDriver();
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
        System.out.println("GRADLE SUCCESS");
        driver.quit();
    }
}
