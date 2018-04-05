import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage {
    private static final String LOGIN = "";
    private static final String PASSWORD = "";

    public void loginFacebook(WebDriver browser) {
        browser.get("https://www.facebook.com");
        browser.findElement(By.cssSelector("[type~=email]")).sendKeys(LOGIN);
        browser.findElement(By.cssSelector("#pass")).sendKeys(PASSWORD);
        browser.findElement(By.xpath(".//label[@id=\"loginbutton\"]")).click();
    }

}



