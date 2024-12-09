package aut.testcreation.pages.Crusies;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CrusiersList extends SeleniumWrapper {

    public CrusiersList(WebDriver driver) {
        super(driver);
    }

    //By Paths
    By less1 = By.xpath("//div[@class='crs-pd-guests__fields inline_layout']/div[1]//button[.='-']");
    By resume = By.xpath("(//span[contains(text(),'Solicitar presupuesto')])[1]");

    //functions

    public void lowestPrice(){
        click(By.xpath("//span[contains(text(),'Recomendados')]"));
        click(By.xpath("//span[contains(text(),'Precio (más bajo primero)')]"));
        waitXMills(1000);
        click(By.xpath("(//span[contains(text(),'Tasas incluidas')])[1]"));
        waitXMills(1000);
        switchToNewTabAndCloseOld();
        waitXMills(1000);
        scrollToElementAndClick(By.xpath("(//span[contains(text(),'Solicitar presupuesto')])[1]"),10);
        waitXMills(2000);
        click(By.xpath("//span[contains(text(),'Reserva')]"));

    }

    public void selecCamarote(){
        waitXMills(1000);
        click(By.xpath("(//span[contains(text(),'Tasas incluidas')])[1]"));
        waitXMills(1000);
        switchToNewTabAndCloseOld();
        scrollDown(500);
        click(waitForElement(By.xpath("(//span[contains(text(),'Selecciona camarote')])[1]"),10));
        click(waitForElement(By.xpath("(//span[contains(text(),'Solicitar presupuesto')])[1]"),10));
        click(waitForElement(By.xpath("//span[contains(text(),'Reserva')]"),10));

    }

}
