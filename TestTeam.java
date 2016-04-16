import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;


public class TestTeam extends BaseClass {

    private By nastya = By.xpath("(//img[@alt='photo'])[4]");
    private By artem = By.cssSelector("img[src*='Karpov");

    @Test (expected = NoSuchElementException.class)

    public void testAnastasia() throws Exception {
        try {
        driver.findElement(nastya).click();
        } catch (NoSuchElementException e) {
            System.err.println("No such coach :( " );
        assertEquals("http://skillsup.ua/about/our-team/anastasia-pedorenko.aspx", driver.getCurrentUrl());
        System.out.println(driver.getCurrentUrl());

        }
    }

    @Test (expected = NoSuchElementException.class)

    public void testArtem() throws NoSuchElementException {
        try {
            driver.findElement(artem);
        } catch (NoSuchElementException e) {
            System.err.println("No such coach :( " );//

        }
    }
}
