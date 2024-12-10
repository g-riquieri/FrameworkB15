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
        click(By.xpath("//span[contains(text(),'Añadir seguro')]"));

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

    public void cambioCantPersonas(){
        waitXMills(1000);
        click(By.xpath("//span[contains(text(),'Recomendados')]"));
        click(By.xpath("//span[contains(text(),'Precio (más bajo primero)')]"));
        waitXMills(1000);
        click(By.xpath("(//span[contains(text(),'Tasas incluidas')])[3]"));
        waitXMills(1000);
        switchToNewTabAndCloseOld();
        scrollDown(500);
        scrollToElementAndClick(By.xpath("//div[@class='crs-pd-guests__fields inline_layout']/div[1]//button[.='+']"),10);
        scrollToElementAndClick(By.xpath("//div[@class='crs-pd-guests__fields inline_layout']/div[1]//button[.='+']"),10);
        //scrollToElementAndClick(By.xpath("//div[@class='crs-pd-guests__fields inline_layout']/div[2]//button[.='+']"),10);
        //scrollToElementAndClick(By.xpath("//div[@class='crs-pd-guests__fields inline_layout']/div[2]//button[.='+']"),10);
        click(waitForElement(By.xpath("(//span[contains(text(),'Selecciona camarote')])[1]"),10));
        click(waitForElement(By.xpath("(//span[contains(text(),'Solicitar presupuesto')])[1]"),10));
        waitXMills(4000);
        scrollDown(5000);
        scrollToElementAndClick(By.xpath("//span[contains(text(),'Añadir seguro')]"),10);
        waitXMills(1000);
        scrollToElementAndClick(By.xpath("//button[@class='crs-btn crs-btn--cta crs-btn--large crs-btn--contain crs-btn--block ng-star-inserted']"),10);

    }

}
