package ui.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import ui.core.Constants;
import ui.core.Elem;

import static ui.core.BrowserFactory.driver;
import static ui.core.BrowserFactory.get;

public class LoginPage {
    private static final String PATH = "/login";

    public Elem emailFld = new Elem(By.cssSelector("#user"), "Login Field");
    public Elem passFld = new Elem(By.cssSelector("#password"), "Password Field");
    public Elem loginBtn = new Elem(By.cssSelector("#login"), "Login Button");

    public void open(){
        get(Constants.URL+PATH);
  //      Assert.assertTrue(isOpened(), "Page 'Login' ["+PATH+"] not Opened");
    }

  //  public boolean isOpened(){
      //  return loginBtn.isPresent() && driver().getCurrentUrl().equals(Constant.);
 //   }

    public void login(String email, String password){
        emailFld.type(email);
        passFld.type(password);
        loginBtn.click();
    }
}
