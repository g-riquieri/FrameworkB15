package aut.testcreation.testcases;

import aut.testcreation.pages.Landing;
import framework.engine.selenium.SeleniumWrapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class CrusiesTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private ArrayList<String> data;

    //pages
    private Landing landing;

    @BeforeEach
    public void setup() {
        String browser="chrome";
        driver = SeleniumWrapper.setupDriver(browser);
        landing = new Landing(driver);
        landing.loadPage("https://www.rumbo.es/");
    }

    @Test
    public void TC001_BusquedaSinUsuario(){
        landing.closeCookies();
        landing.goToCruises();

    }

    @AfterEach
    public void postConditions(){
        //landing.closeBrowser();
    }
}
