package ChromeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {
    public static void main(String[] args)
    {


        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "\"E:\\Selenium\\chromedriver.exe\"");

    }
}
