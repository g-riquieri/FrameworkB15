package aut.testcreation.pages.Flights;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.LinkedList;

public class FlyList extends SeleniumWrapper {

    public FlyList(WebDriver driver) {
        super(driver);
    }

    By nombre = By.xpath("//div[@data-testid='name']");
    By apellido = By.xpath("//div[@data-testid='surname']");
    By correo = By.xpath("//div[@data-testid='email']");

    public void btnMasBaratos() {
        waitXMills(3000);
        WebElement masBarato = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-value='price.asc']")));
        masBarato.click();
    }

    public void elegirVuelo() {
        waitXMills(3000);
        List<WebElement> vueloElecto = driver.findElements(By.xpath("//div[@class=\"trip-collection-view__trips-container-top\"]//div[contains(@data-testid,'transportcard')]"));
        vueloElecto.getFirst().click();

        WebElement btnSelec = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()[contains(.,'Seleccionar')]]")));
        btnSelec.click();
    }

    public void elegirPaquete() {
        waitXMills(3000);
        WebElement opcRecomendada = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()[contains(.,'Seleccionar')]]")));
        opcRecomendada.click();
    }

    public void completarDatContac(String name, String surname, String email) {
        waitXMills(3000);
        sendText(nombre, name);
        sendText(apellido, surname);
        sendText(correo, email);
    }
}
