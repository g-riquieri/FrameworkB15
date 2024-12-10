package aut.testcreation.pages.Flights;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HotelList extends SeleniumWrapper {
    public HotelList(WebDriver driver) {
        super(driver);
    }

    public void closeCookies(){
        waitXMills(1000);
        clickRejectAll();
    }

   public void elegirHotel() {
       waitXMills(3000);
       List<WebElement> listHoteles = driver.findElements(By.xpath("//div[contains(@class,'list-container')]"));
       listHoteles.getFirst().click();
   }
}

