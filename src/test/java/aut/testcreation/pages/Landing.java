package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Landing extends SeleniumWrapper {
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
        click(By.xpath("//div[@class='d-zbtid6']"));

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
