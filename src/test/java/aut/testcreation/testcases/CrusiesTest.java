package aut.testcreation.testcases;

import aut.testcreation.pages.Crusies.LandingCrusies;
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
    private LandingCrusies crusiers;

    @BeforeEach
    public void setup() {
        String browser="chrome";
        driver = SeleniumWrapper.setupDriver(browser);
        landing = new Landing(driver);
        crusiers = new LandingCrusies(driver);
        landing.clearCacheUsingKeyboardShortcut();
        landing.loadPage("https://www.rumbo.es/");
    }

    @Test
    public void TC001_BusquedaOferta(){
        landing.closeCookies();
        landing.goToCruises();
        crusiers.offer();
    } //done

    @Test
    public void TC002_ReservaCrucerosExoticos(){
        landing.closeCookies();
        landing.goToCruises();
        crusiers.offer2();

    }//done

    //@Test
    public void TC003_BusquedaCostoBase(){
        landing.closeCookies();
        landing.goToCruises();

    }

    //@Test
    public void TC004_AnalisiDeCostoBase(){
        landing.closeCookies();
        landing.goToCruises();

    }

    //@Test
    public void TC005_ReservaMasDeMesLimite(){
        landing.closeCookies();
        landing.goToCruises();

    }

    //@Test
    public void TC006_Reserva7Personas(){
        landing.closeCookies();
        landing.goToCruises();

    }

    @AfterEach
    public void postConditions(){
        //landing.closeBrowser();
    }
}
