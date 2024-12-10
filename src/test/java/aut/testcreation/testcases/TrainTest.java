package aut.testcreation.testcases;

import aut.testcreation.pages.Landing;
import aut.testcreation.pages.Trains.LandingTrains;
import framework.engine.selenium.SeleniumWrapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
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
//----------------------------------------CASO 01-----BAJO NIVEL---------------------------
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
    //-------------------------------------CASO 02-----BAJO NIVEL---------------------------
    public void TC002(){
        landing.closeCookies();
        landing.goToTrains();

        landingTrains. busquedaNoExistente();

        landingTrains.textMessage("Volver a buscar");

    }
    //-------------------------------------CASO 03----ALTO NIVEL----------------------------
    @Test
    public void TC003()throws AWTException {
        landing.closeCookies();
        landing.goToTrains();

        landingTrains.resViajeSS();

    }
    //-------------------------------------CASO 04----ALTO NIVEL----------------------------
    @Test
    public void TC004()throws AWTException{
        landing.closeCookies();
        landing.goToTrains();

        landingTrains.viajeMasRapido();

    }
    //-------------------------------------Caso 005-----MEDIO NIVEL------------------
    @Test
    public void TC005(){

        landing.closeCookies();
        landing.goToTrains();

        landingTrains.numFueraArea();
    }
    //-------------------------------------Caso 005-----MEDIO NIVEL------------------

    @Test

    public void TC006(){

        landing.closeCookies();
        landing.goToTrains();

        landingTrains.viajeX();

    }



}
