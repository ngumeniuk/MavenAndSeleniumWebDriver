import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class PositiveTest {
    @Test
            public void GoToGoogle() {
            System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.google.pl/");

        WebElement searchField = driver.findElement(By.id("lst-ib"));
       searchField.sendKeys("Cogniance");

       WebElement searchButton = driver.findElement(By.cssSelector("input.lsb"));
       searchButton.click();
         }
}
