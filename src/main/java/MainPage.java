import org.openqa.selenium.By;


public class MainPage extends BrowserManager {
    private static final String LOGIN = "";
    private static final String PASSWORD = "";

    public FeedPage loginFacebook() {
        BrowserManager.browser.findElement(By.cssSelector("[type~=email]")).sendKeys(LOGIN);
        BrowserManager.browser.findElement(By.cssSelector("#pass")).sendKeys(PASSWORD);
        BrowserManager.browser.findElement(By.xpath(".//label[@id='loginbutton']")).click();
        return new FeedPage();
    }

}



