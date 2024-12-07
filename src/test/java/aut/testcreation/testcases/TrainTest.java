package aut.testcreation.testcases;

import aut.testcreation.pages.Landing;
import aut.testcreation.pages.Trains.LandingTrains;
import framework.engine.selenium.SeleniumWrapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class TrainTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private ArrayList<String> data;

    private Landing landing;
    private LandingTrains landingTrains;

    @BeforeEach
    public void setup() {
        String browser="chrome";
        driver = SeleniumWrapper.setupDriver(browser);
        landing = new Landing(driver);
        landing.loadPage("https://www.rumbo.es/");
        landingTrains = new LandingTrains(driver);
    }

    @Test
    public void TC001(){
        landing.closeCookies();
        landing.goToTrains();

        landingTrains.compFormTren();


    }

    @AfterEach
    public void postConditions(){
        //landing.closeBrowser();
    }


    @Test
    public void TC002(){
        landing.closeCookies();
        landing.goToTrainsH();

        landingTrains. reservaSugePage();


    }

    @Test
    public void TC003(){
        landing.closeCookies();
        landing.goToTrains();

        landingTrains.resViajeSS();

    }

    @Test
    public void TC004(){
        landing.closeCookies();
        landing.goToTrains();

        landingTrains.viajeMasRapido();



    }
}
