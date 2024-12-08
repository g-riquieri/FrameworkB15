package aut.testcreation.pages.Trains;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.Driver;

public class LandingTrains extends SeleniumWrapper {
    public LandingTrains(WebDriver driver) {
        super(driver);
    }

    Actions actions = new Actions(driver);

    public void closeCookies() {
        waitXMills(1000);
        clickRejectAll();
    }

    public void compFormTren() {
        waitXMills(3000);
        closeCookies();

        click(explicitWait(By.xpath("//button[@class=\"d-16g44dp\"]"), 20));
        System.out.println("Se hizo click");
        sendText(By.xpath("//input[@id=\":R5kd9dalamt2mm:\"] "), "Madrid");

        sendText(By.xpath("//input[@id=\":R6kd9dalamt2mm:\"] "), "Barcelona");
        waitXMills(1000);

        click(By.xpath("//input[@id=\":R6kd9dalamt2mm:\"]"));

        click(By.xpath("//button[@aria-label=\"Buscar\"]"));

    }
    //------------------------------------------caso2--------------------------------------
    public void reservaSugePage() {
        waitXMills(3000);
        closeCookies();

        click(explicitWait(By.xpath("//button[@class=\"d-16g44dp\"]"), 20));
        System.out.println("Se hizo click");

        click(By.xpath("(//input[data-testid=':R5kd9dalamt2mm:'])"));
        sendText(By.xpath("(//input[@role='combobox'])[1]"), "Madrid");

        //sendText(By.xpath("//input[@id=\":R5kd9dalamt2mm:\"]"), "Madrid");
        waitXMills(1000);
        sendText(By.xpath("//input[@id=\":R6kd9dalamt2mm:\"]"), "Barcelona");
        waitXMills(1000);

    }
    //-----------------------------------------caso3......................
    public void resViajeSS()throws AWTException{
        waitXMills(3000);
        closeCookies();

        //Seleccionar Origen
        sendText(By.xpath("//input[@id=\":R5kd9dalamt2mm:\"] "), "Madrid");
        waitXMills(2000);
        //Seleccionar Destino
        sendText(By.xpath("//input[@id=\":R6kd9dalamt2mm:\"] "), "Barcelona");
        waitXMills(1000);

        //Cambiar cantidad de pasajero
       click(By.xpath("//span[.='Passengers and cabin class']\n"));
       click(By.xpath("//button[@aria-label=\"Reducir el número de adultos\"]"));
       click(By.xpath("(//span[text()='1 pasajero · Cualquier clase'])"));
       waitXMills(1000);

        //Boton Buscar
        click(By.xpath("//button[@aria-label=\"Buscar\"]"));

        //EL MEJOR
        click(By.xpath("(//span[text()='Precio por persona'])[1]"));

        waitXMills(3000);
        //Hace clic en Seleccionar Detalles del viaje ....
        click(By.xpath("(//button[text()='Seleccionar'])[1]"));

        waitXMills(3000);

        WebElement msjFlexi= driver.findElement(By.xpath("//h4[contains(text(),'Viaja con más flexibilidad')]"));
        waitXMills(1000);

        //Por si sale la pantalla de la Flexibilidad del viaje
        if(msjFlexi.isDisplayed())
        {
            click(By.xpath("//button[text()='Elegir Classic']"));
        }
        else
        {
            System.out.println("No se encuentra la pantalla de Flexibilidad");
        }
        waitXMills(3000);

        click(By.xpath("//input[@name='name']"));
        sendText(By.xpath("//input[@name='name']"),"Bruno");
        waitXMills(3000);

        sendText(By.xpath("//input[@name='surname']"),"Diaz");
        waitXMills(3000);

        sendText(By.xpath("//input[@name='email']"), "Brunodiaznoesbatman@gmail.com");
        waitXMills(3000);

        sendText(By.xpath("//input[@name='phone']"), "12223654");
        // no carga la caracteristica del pais del telefono..... REVISAR

        //Seleccionar si es Sr o Sra
        click(By.xpath("(//*[@data-testid='radio-input'])[1]"));

        //Seleccion del dia
        click(By.xpath("//div[@class='widget-wrapper widget-wrapper--traveller_info ']//section[1]//label[.='Día']"));
        sendText(By.xpath("//div[@class='widget-wrapper widget-wrapper--traveller_info ']//section[1]//label[.='Día']"), "26");
        waitXMills(3000);

        //Seleccion del mes
        click(By.xpath("(//span[contains(.,'Mes')])[1]"));
        waitXMills(1000);
        click(By.xpath("(//span[contains(.,'marzo')])[1]"));
        waitXMills(3000);

        //Selecciona el Año

        actions.sendKeys(Keys.TAB).perform();
        waitXMills(1000);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_1);
        robot.keyRelease(KeyEvent.VK_1);
        robot.keyPress(KeyEvent.VK_9);
        robot.keyRelease(KeyEvent.VK_9);
        robot.keyPress(KeyEvent.VK_9);
        robot.keyRelease(KeyEvent.VK_9);
        robot.keyPress(KeyEvent.VK_4);
        robot.keyRelease(KeyEvent.VK_4);

        //Seleccionar DNI
  /*      click(By.xpath("//button[@data-testid=\"groups.1.travellers.1.documentType\"]"));
        click(By.xpath("//span[.='DNI']"));

        click(By.xpath("(//span[contains(.,'Tipo de documento')])[1]"));
        waitXMills(1000);
        click(By.xpath("(//span[contains(.,'Documento de identidad')])[1]"));
        waitXMills(1000);
*/

        //Número de documento
        waitXMills(3000);
        click(By.xpath("(//span[text()='Número de documento'])[1]"));

        //Robot que completa el Dni xD
        Robot robot1 = new Robot();
        robot1.keyPress(KeyEvent.VK_2);
        robot1.keyRelease(KeyEvent.VK_2);
        robot1.keyPress(KeyEvent.VK_3);
        robot1.keyRelease(KeyEvent.VK_3);
        robot1.keyPress(KeyEvent.VK_4);
        robot1.keyRelease(KeyEvent.VK_4);
        robot1.keyPress(KeyEvent.VK_6);
        robot1.keyRelease(KeyEvent.VK_6);

        click(By.xpath("//button[@class='btn btn-cta lead-generation-submit__btn-revamped-cta ']"));
    }
    //-----------------------------------------caso4......................

    public void viajeMasRapido() throws AWTException{

        waitXMills(3000);
        closeCookies();

        sendText(By.xpath("//input[@id=\":R5kd9dalamt2mm:\"] "), "Madrid");
        waitXMills(1000);
        sendText(By.xpath("//input[@id=\":R6kd9dalamt2mm:\"] "), "Barcelona");
        waitXMills(1000);

        //Cambiar cantidad de pasajero
        click(By.xpath("//span[.='Passengers and cabin class']\n"));
        click(By.xpath("//button[@aria-label=\"Reducir el número de adultos\"]"));
        click(By.xpath("(//span[text()='1 pasajero · Cualquier clase'])"));
        waitXMills(1000);

        //Boton Buscar
        click(By.xpath("//button[@aria-label=\"Buscar\"]"));
        waitXMills(1000);

        //Boton Más Rápido;
        click(By.xpath("(//span[text()='Precio por persona'])[1]"));

        click(By.xpath("//div[@class='TransportWithHighlighted__TransportCardContainer-sc-1f8fg1d-0 hBHVmE']"));
        waitXMills(1000);

        //Seleccionar oferta de viaje Mas rapdio
        click(By.xpath("(//button[text()='Seleccionar'])"));
//---------------------------------------------------------------------------------------------------------Hasa aqui la prueba 4 lo demas es mod. el excel

       WebElement msjFlexi= driver.findElement(By.xpath("//h4[contains(text(),'Viaja con más flexibilidad')]"));
        waitXMills(1000);

        //Por si sale la pantalla de la Flexibilidad del viaje
        if(msjFlexi.isDisplayed())
        {
            click(By.xpath("//button[text()='Elegir Classic']"));
        }
        else
        {
            System.out.println("No se encuentra la pantalla de Flexibilidad");
        }

           //Completar datos de cuenta
        click(By.xpath("//span[@class='FormFieldstyles__ValueWrapper-sc-1pt5zgp-4 bNeTrq']"));
        waitXMills(1000);

        click(By.xpath("//input[@name='name']"));
        sendText(By.xpath("//input[@name='name']"),"Jason");
        waitXMills(1000);

        sendText(By.xpath("//input[@name='surname']"),"Todd");
        waitXMills(1000);

        sendText(By.xpath("//input[@name='email']"), "Brunodiaznoesbatman@gmail.com");
        waitXMills(1000);

        sendText(By.xpath("//input[@name='phone']"), "1233334");
        // no carga la caracteristica del pais del telefono..... REVISAR
        waitXMills(1000);
        //Seleccionar si es Sr o Sra
        click(By.xpath("(//*[@data-testid=\"radio-input\"])[1]"));

        //Seleccion del dia
        click(By.xpath("//div[@class='widget-wrapper widget-wrapper--traveller_info ']//section[1]//label[.='Día']"));
        sendText(By.xpath("//div[@class='widget-wrapper widget-wrapper--traveller_info ']//section[1]//label[.='Día']"), "26");
        waitXMills(3000);

        //Seleccion del mes
        click(By.xpath("(//span[contains(.,'Mes')])[1]"));
        waitXMills(1000);
        click(By.xpath("(//span[contains(.,'marzo')])[1]"));
        waitXMills(3000);

        actions.sendKeys(Keys.TAB).perform();
        waitXMills(1000);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_1);
        robot.keyRelease(KeyEvent.VK_1);
        robot.keyPress(KeyEvent.VK_9);
        robot.keyRelease(KeyEvent.VK_9);
        robot.keyPress(KeyEvent.VK_9);
        robot.keyRelease(KeyEvent.VK_9);
        robot.keyPress(KeyEvent.VK_4);
        robot.keyRelease(KeyEvent.VK_4);

        //Seleeciona si es SR. o SRA.
        scrollDown(3000);

        scrollToElementAndClick(By.xpath("//span[contains(text(),'Sr.')]"), 10);

        //Seleccionar e Ingresar DNI
        waitXMills(3000);
        click(By.xpath("(//span[text()='Número de documento'])[1]"));

        //Robot que completa el Dni xD
        Robot robot2 = new Robot();
        robot2.keyPress(KeyEvent.VK_2);
        robot2.keyRelease(KeyEvent.VK_2);
        robot2.keyPress(KeyEvent.VK_3);
        robot2.keyRelease(KeyEvent.VK_3);
        robot2.keyPress(KeyEvent.VK_4);
        robot2.keyRelease(KeyEvent.VK_4);
        robot2.keyPress(KeyEvent.VK_6);
        robot2.keyRelease(KeyEvent.VK_6);

        click(By.xpath("//button[@class='btn btn-cta lead-generation-submit__btn-revamped-cta ']"));

    }
}
