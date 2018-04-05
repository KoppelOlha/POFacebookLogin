import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FeedPage {

    public void findFeedElement(WebDriver browser) {
        browser.findElement(By.cssSelector("[data-testid~=left_nav_section_Интересное]"));
    }
}
