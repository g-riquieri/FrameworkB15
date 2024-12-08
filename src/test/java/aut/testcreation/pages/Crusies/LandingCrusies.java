package aut.testcreation.pages.Crusies;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LandingCrusies extends SeleniumWrapper {

    public LandingCrusies(WebDriver driver){
        super(driver);
    }

    //By Section
    By offerButton = By.xpath("(//span[contains(text(),'Ofertas')])[1]");
    By lastMinute = By.xpath("(//span[contains(text(),'Última hora')])[1]");
    By exotic = By.xpath("(//span[contains(text(),'Cruceros Exóticos')])[1]");
    By discover = By.xpath("(//span[contains(text(),'Descubre')])[1]");
    By less1 = By.xpath("//div[@class='crs-pd-guests__fields inline_layout']/div[1]//button[.='-']");
    By resume = By.xpath("(//span[contains(text(),'Solicitar presupuesto')])[1]");


    //funciones

    public void offer() {
        waitXMills(1000);
        switchToNewTabAndCloseOld();
        click(offerButton);
        click(lastMinute);
        waitXMills(1000);
        click(discover);
        waitXMills(1000);
        switchToNewTabAndCloseOld();
        scrollToElementAndClick(less1,10);
        waitXMills(1000);
        scrollToElementAndClick(resume,10);

    }

    public void offer2() {
        waitXMills(1000);
        switchToNewTabAndCloseOld();
        click(offerButton);
        click(exotic);
        waitXMills(1000);
        click(discover);
        waitXMills(1000);
        switchToNewTabAndCloseOld();
        scrollToElementAndClick(less1,10);
        waitXMills(1000);
        scrollToElementAndClick(resume,10);

    }

}
