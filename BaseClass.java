import junit.framework.TestCase;
import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass extends TestCase {

    private String baseUrl="http://skillsup.ua/";
    private By linkTeam = By.linkText("Наша команда");
    protected static WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.get(baseUrl + "/about/our-team.aspx");
        driver.get(baseUrl);
        WebElement webElement =driver.findElement(linkTeam);
        webElement.click();
    }

    @AfterClass
    public void tearDown() throws Exception{
        this.driver.quit();
    }

}
