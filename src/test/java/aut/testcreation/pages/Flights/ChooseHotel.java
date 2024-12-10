package aut.testcreation.pages.Flights;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ChooseHotel extends SeleniumWrapper {

    public ChooseHotel(WebDriver driver) {
        super(driver);
    }

    public void elegirHotelReser() {
        List<WebElement> opciones = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div" +
                "[contains(@id, 'rooms')]")));
        if (!opciones.isEmpty()) {
            // Selecciona la primera opción de la lista
            WebElement firstOption = opciones.get(0);

            // Encuentra el botón dentro de la primera opción (ajusta el XPath si es necesario)
            WebElement buttonInFirstOption =
                    firstOption.findElement(By.xpath(".//span[contains(text(), 'Continuar')]"));
            wait.until(ExpectedConditions.elementToBeClickable(buttonInFirstOption));
            buttonInFirstOption.click();
        }
    }

    public void btnReservar() {

    }
}
