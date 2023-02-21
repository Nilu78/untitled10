
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.management.RuntimeErrorException;
import java.util.List;

public class Test1{
    @Test

    public void Test1() throws Exception {


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.dice.com/");

        Thread.sleep(5000);

        driver.findElement(By.id("typeHeadInput")).sendKeys("SDET", Keys.ENTER);


        Thread.sleep(5000);

        List<WebElement> elements = driver.findElements(By.xpath("//a[@class='title-link bold']"));
        Thread.sleep(5000);

        if (elements.size() == 0) {
            throw new RuntimeErrorException(null, "List is empty");
            // I want to throw an exception if the list is empty
        } else {
            System.out.println("List is not empty");

            for (WebElement element : elements) {
                System.out.println(element.getText());


            }

        }

    }
}
