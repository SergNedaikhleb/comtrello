package ui.core;

import junk.TryLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BrowserFactory {
    private Logger logger = LoggerFactory.getLogger(TryLogger.class);
    private static WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        logger.info("BROWSER STARTED");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
        logger.info("BROWSER CLOSER");
    }

    public static WebDriver driver(){
        return driver;
    }

    public static void get(String url){
        driver().get(url);
    }

//    public static WebDriverWait getWebDriverWait(long timeout) {
//         return driver(); //new WebDriverWait(driver(), )
//          }
}