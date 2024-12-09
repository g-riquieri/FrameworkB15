package aut.testcreation.pages.Crusies;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CrusiersList extends SeleniumWrapper {

    public CrusiersList(WebDriver driver) {
        super(driver);
    }

    //functions

    public void lowestPrice(){
        click(By.xpath("//span[contains(text(),'Recomendados')]"));
        click(By.xpath("//span[contains(text(),'Precio (más bajo primero)')]"));
    }

}
