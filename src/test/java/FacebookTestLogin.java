import org.testng.annotations.Test;

public class FacebookTestLogin {

    @Test

    public void LoginFacebook(){
        BrowserManager browserManager = new BrowserManager();
        browserManager.openBrowser();
        new MainPage().loginFacebook(browserManager.getBrowser());
        new FeedPage().findFeedElement(browserManager.getBrowser());
        browserManager.closedBrowser();
        }


}
