import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;


public class TestTeam extends BaseClass {

    private By nastya = By.xpath("(//img[@alt='photo'])[4]");
    private By artem = By.cssSelector("img[src*='Karpov");
    private By name = By.xpath("//div[@class='greenHeader']");

    @Test (expected = NoSuchElementException.class)

    public void testPedorenkoAnastasia() throws NoSuchElementException {
       try {
        driver.findElement(nastya).click();
       }
       catch (NoSuchElementException e) {
            System.err.println("No such coach :( " );
        }
        assertEquals("Анастасия Педоренко", driver.findElement(name).getText());
        System.out.println(driver.findElement(name).getText()+"-present !!!");
    }


    @Test (expected = NoSuchElementException.class)

    public void testKarpovArtemNeg() throws NoSuchElementException {
        try {
            driver.findElement(artem);
        } catch (NoSuchElementException e) {
            System.err.println("No such coach - Артём Карпов need to add!!!!  :((");
        }
        assertEquals("Артём Карпов", driver.findElement(name).getText());
        System.out.println(driver.findElement(name).getText());
    }

    @Test (expected = NoSuchElementException.class)

    public void testKarpovArtemPos() throws NoSuchElementException {
        try {
            driver.findElement(artem);
        } catch (NoSuchElementException e) {
            System.err.println("No such coach - it's good " );//
        }
        assertEquals("Наша команда", driver.findElement(name).getText());
        //System.out.println(driver.findElement(name).getText());
    }
}
