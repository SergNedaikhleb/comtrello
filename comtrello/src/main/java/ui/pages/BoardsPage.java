package ui.pages;

import org.openqa.selenium.By;
import ui.core.Elem;

public class BoardsPage {
    private static final String PATH = "moytrello/boards";

    public void open(){

    }

    public void isOpened(){

    }

    public static void openBoard(String urlName){
        new Elem(By.cssSelector(".board-title[href*='urlName+']"), urlName);
    }
}
