package aut.testcreation.pages.Flights;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LandingEnglish extends SeleniumWrapper {
    public LandingEnglish(WebDriver driver) {
        super(driver);
    }

    public void completEnlglishForm() {
        sendText(By.xpath("//input[@aria-label='Departure']"),"Buenos Aires (BUE)");
        waitXMills(1000);
        click(By.xpath("//input[@aria-label='Departure']"));

        sendText(By.xpath("//input[@aria-label='Destination']"),"Madrid (MAD)");
        waitXMills(1000);
        click(By.xpath("//input[@aria-label='Destination']"));

        waitXMills(1000);
        click(By.xpath("//button[@aria-label='When?']"));
        waitXMills(2000);
        click(By.xpath("//button[contains(text(),'20')]"));
        waitXMills(2000);
        click(By.xpath("//button[contains(text(),'28')]"));

        click(By.xpath("//button[@aria-label='Find']"));
    }
}
