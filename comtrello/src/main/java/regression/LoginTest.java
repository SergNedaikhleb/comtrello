package regression;

import org.testng.annotations.Test;
import ui.core.BrowserFactory;
import ui.pages.BoardsPage;
import ui.pages.LoginPage;

public class LoginTest extends BrowserFactory {
    LoginPage loginPage = new LoginPage();

    @Test
    public void login() throws InterruptedException {
        loginPage.open();
        loginPage.login("email@email.com", "12345");
        BoardsPage.openBoard("jackSparrow");
        Thread.sleep(1000);
    }
}
