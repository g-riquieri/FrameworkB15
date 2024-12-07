package aut.testcreation.testcases;


import aut.testcreation.pages.Flights.FlyList;
import aut.testcreation.pages.Landing;
import framework.engine.selenium.SeleniumWrapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class FlyTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private ArrayList<String> data;

    //pages
    private Landing landing;
    private FlyList flyList;

    @BeforeEach
    public void setup() {
        String browser="chrome";
        driver = SeleniumWrapper.setupDriver(browser);
        landing = new Landing(driver);
        landing.loadPage("https://www.rumbo.es/");
        flyList = new FlyList(driver);
    }

    @Test
    public void TC001(){
        landing.closeCookies();
        landing.completeTheForm();
    }

    @Test
    public void TC002(){
        landing.closeCookies();
        landing.completeTheForm();

        flyList.btnMasBaratos();
        flyList.elegirVuelo();
        //flyList.elegirPaquete();
        //flyList.completarDatContac("Fran","Martinez","prueba@prueba.com");
    }


    //@AfterEach
    public void postConditions(){
        landing.closeBrowser();
    }


}