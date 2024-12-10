package aut.testcreation.pages.Hotels;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hotels extends SeleniumWrapper {

    public Hotels(WebDriver driver) {
        super(driver);
    }

    public void searchHostels(){
        waitXMills(2000);
        click(waitForElement(By.xpath("(//input[@placeholder='¿Adónde quieres ir?'])[1]"),10));
        sendText(By.xpath("(//input[@placeholder='¿Adónde quieres ir?'])[1]"),"Madrid");
        click(waitForElement(By.xpath("(//span[contains(text(),'¿Cuándo?')])[1]"),10));
        click(waitForElement(By.xpath("(//button[contains(text(),'16')])[2]"),10));
        click(waitForElement(By.xpath("(//button[contains(text(),'20')])[2]"),10));
        waitXMills(1000);
        click(waitForElement(By.xpath("(//button[@class='d-1qoyuz'])[1]"),10));
    }

    public void spaHotel(){
        waitXMills(1000);
        scrollToElementAndClick(By.xpath("//h4[contains(text(),'Hoteles con spa')]"),10);
        waitXMills(1000);
        switchToNewTabAndCloseOld();
        click(waitForElement(By.xpath("//label[.='Buscar alojamiento en']"),10));
        waitXMills(1000);
        sendText(By.xpath("//input[@class='d-fufle4 ed5mks92']"),"Madrid");
        click(waitForElement(By.xpath("(//button[@class='d-1qoyuz'])[1]"),10));
    }

    public void cantPers(){
        waitXMills(2000);
        click(waitForElement(By.xpath("(//input[@placeholder='¿Adónde quieres ir?'])[1]"),10));
        sendText(By.xpath("(//input[@placeholder='¿Adónde quieres ir?'])[1]"),"Madrid");
        waitXMills(1000);
        click(waitForElement(By.xpath("(//span[contains(text(),'¿Cuándo?')])[1]"),10));
        click(waitForElement(By.xpath("(//button[contains(text(),'16')])[2]"),10));
        click(waitForElement(By.xpath("(//button[contains(text(),'20')])[2]"),10));
        click(waitForElement(By.xpath("//div[@class='d-1ea2lc2']/button[1]"),10));
        click(waitForElement(By.xpath("(//button[@class='d-1qoyuz'])[1]"),10));
        waitXMills(1000);
        click(waitForElement(By.xpath("(//div[contains(., 'Precio por noche')])[7]"),10));
    }

    public void allInclusive(){
        waitXMills(1000);
        scrollToElementAndClick(By.xpath("//h4[contains(text(),'Todo incluido')]"),10);
        waitXMills(1000);
        switchToNewTabAndCloseOld();
        click(waitForElement(By.xpath("(//span[contains(., 'desde')])[1]"),10));
        waitXMills(1000);
        switchToNewTabAndCloseOld();
        scrollToElementAndClick(By.xpath("(//span[contains(., 'Cancelación gratuita')])[1]"),10);
        scrollToElementAndClick(By.xpath("(//span[contains(., 'Continuar')])[1]"),10);
        waitXMills(2000);
        sendText(By.xpath("//input[@name='name']"),"Jhon");
        sendText(By.xpath("//input[@name='surname']"),"Constantine");
        sendText(By.xpath("//input[@name='email']"),"outWorld@gmail.com");
        sendText(By.xpath("//input[@name='phone']"),"3804444444");


    }
}
