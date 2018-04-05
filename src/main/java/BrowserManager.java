import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class BrowserManager {
    private WebDriver browser;

    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public void closedBrowser(){
        browser.quit();
    }

    public WebDriver getBrowser() {
        return browser;
    }
}