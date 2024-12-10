package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Landing extends SeleniumWrapper {
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public Landing(WebDriver driver) {
        super(driver);
    }

    //functions

    public void closeCookies(){
        waitXMills(1000);
        clickRejectAll();
    }

    public void completeTheForm() {
        sendText(By.xpath("//input[@aria-label='Origen']"),"Buenos Aires (BUE)");
        waitXMills(1000);
        click(By.xpath("//input[@aria-label='Origen']"));

        sendText(By.xpath("//input[@aria-label='Destino']"),"Madrid (MAD)");
        waitXMills(1000);
        click(By.xpath("//input[@aria-label='Destino']"));

        waitXMills(1000);
        click(By.xpath("//button[@aria-label='¿Cuándo?']"));
        waitXMills(2000);
        click(By.xpath("//button[contains(text(),'20')]"));
        waitXMills(2000);
        click(By.xpath("//button[contains(text(),'28')]"));
        click(By.xpath("//button[@aria-label='Buscar']"));
    }

    public void cambiarPaisWorld() {
        click(explicitWait(By.xpath("//button[@aria-label='Selecciona tu país']"),10));
        click(explicitWait(By.xpath("//a[.='Worldwide (English)']"),10));
    }

    public void btnBuscar() {
        click(By.xpath("//button[@aria-label='Buscar']"));
    }

    public void banEnPareja() {
        List<WebElement> banner = driver.findElements(By.xpath("//div[@class" +
                "='styles__Wrapper-sc-ky1mzf-0 ijuDKS']/div[@class='HubRowstyled__ContentWrapper-sc-19fqa3f-0 kHzNkC " +
                "d-qfcny9 e19fnmvl0']/div[.='Sol y playaEn familiaEn pareja']"));
        if (!banner.isEmpty()) {
            // Espera a que el último elemento sea visible antes de hacer clic
            WebElement lastBanner = banner.get(banner.size() - 1);
            wait.until(ExpectedConditions.visibilityOf(lastBanner));

            // Haz clic en el último banner
            lastBanner.click();
        }
    }

    public void goToFlysH(){
        click(By.xpath("//p[text()='Ver más']"));
        click(By.xpath("//button[@aria-label='Vuelo + Hotel']"));
    }

    public void goToTrains(){
        click(By.xpath("//p[text()='Ver más']"));
        click(By.xpath("//div[text()='Trenes']"));
    }
    public void goToTrainsH(){
        click(By.xpath("//p[text()='Ver más']"));
        click(By.xpath("//div[text()='Tren + Hotel ']"));
    }

    public void goToCruises(){
        click(By.xpath("//p[text()='Ver más']"));
        click(By.xpath("//div[text()='Cruceros']"));
    }

}