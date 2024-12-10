package aut.testcreation.testcases;

import aut.testcreation.pages.Crusies.CrusiersList;
import aut.testcreation.pages.Crusies.LandingCrusies;
import aut.testcreation.pages.Hotels.Hotels;
import aut.testcreation.pages.Landing;
import framework.engine.selenium.SeleniumWrapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class HotelTest {

    private WebDriver driver;
    private WebDriverWait wait;
    private ArrayList<String> data;

    //pages
    private Landing landing;
    private Hotels hotel;

    @BeforeEach
    public void setup() {
        String browser="chrome";
        driver = SeleniumWrapper.setupDriver(browser);
        landing = new Landing(driver);
        hotel = new Hotels (driver);
        //landing.clearCacheUsingKeyboardShortcut();
        landing.loadPage("https://www.rumbo.es/");
    }
    @Test
    public void TC001_BusquedaCasa(){
        landing.closeCookies();
        landing.goToHotels();
        hotel.searchHostels();
    }
    @Test
    public void TC002_BusquedaOferta(){
        landing.closeCookies();
        landing.goToHotels();
        hotel.spaHotel();
    }
    @Test
    public void TC003_BusquedaOferta(){
        landing.closeCookies();
        landing.goToHotels();
        hotel.cantPers();
    }
    @Test
    public void TC004_BusquedaOferta(){
        landing.closeCookies();
        landing.goToHotels();
        hotel.allInclusive();

    }
    @Test
    public void TC005_CompleteRegistration(){
        landing.closeCookies();
        landing.goToHotels();
        hotel.completeRegistration();
    }
    @Test
    public void TC001_BusquedaOferta(){
        landing.closeCookies();
        landing.house();
        hotel.casaTest();

    }

    @AfterEach
    public void postConditions(){
        landing.closeBrowser();
    }


}
