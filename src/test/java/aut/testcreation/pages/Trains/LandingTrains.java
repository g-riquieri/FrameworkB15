package aut.testcreation.pages.Trains;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingTrains extends SeleniumWrapper {
    public LandingTrains(WebDriver driver) {
        super(driver);
    }

    public void closeCookies() {
        waitXMills(1000);
        clickRejectAll();
    }

    public void compFormTren() {
        waitXMills(3000);
        //closeCookies();
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

        sendText(By.xpath("//input[@id=\":R5kd9dalamt2mm:\"]"), "Madrid");
        waitXMills(1000);
        sendText(By.xpath("//input[@id=\":R6kd9dalamt2mm:\"]"), "Barcelona");
        waitXMills(1000);

    }

    //-----------------------------------------caso3......................
    public void resViajeSS(){
        waitXMills(3000);
        closeCookies();

        sendText(By.xpath("//input[@id=\":R5kd9dalamt2mm:\"] "), "Madrid");
        waitXMills(1000);
        sendText(By.xpath("//input[@id=\":R6kd9dalamt2mm:\"] "), "Barcelona");
        waitXMills(1000);

        click(By.xpath("//button[@aria-label=\"Buscar\"]"));

        //EL MEJOR
        //click(By.xpath("//button[@class=\"FullTransportPrices__SelectedPriceContainer-sc-1qck0l5-1 gMEljz\"]"));
        click(By.xpath("(//span[text()='Precio por persona'])[1]"));

        waitXMills(3000);
        //Hace clic en Seleccionar Detalles del viaje ....
        click(By.xpath("(//button[text()='Seleccionar'])[1]"));

        //click(By.xpath("//span[@data-testid='transportcard-final-price']"));
        //click(By.xpath("//button[@class=\"Button__LmnDsButton-sc-1bbve8d-0 bsmtZs\"]"));
        waitXMills(3000);


        sendText(By.xpath("//input[@name='name']"),"Bruno");
        waitXMills(3000);
        sendText(By.xpath("//input[@name='surname']"),"Diaz");
        waitXMills(3000);

        sendText(By.xpath("//input[@name='email']"), "Brunodiaznoesbatman@gmail.com");
        waitXMills(3000);

        sendText(By.xpath("//input[@name='phone']"), "12223654");
        // no carga la caracteristica del pais del telefono..... REVISAR

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

        //Selecciona el Año
        click(By.xpath("//span[contains(.,'Año')]"));
        waitXMills(1000);
        //sendText(By.xpath("//span[contains(.,'Año')]"),"1995");
        sendText(By.xpath("(//span[text()='Año'])[1]"),"1995");

        //Seleccionar DNI
        click(By.xpath("//button[@data-testid=\"groups.1.travellers.1.documentType\"]"));
        click(By.xpath("//span[.='DNI']\n"));

    }


    public void viajeMasRapido(){


        waitXMills(3000);
        closeCookies();

        sendText(By.xpath("//input[@id=\":R5kd9dalamt2mm:\"] "), "Madrid");
        waitXMills(1000);
        sendText(By.xpath("//input[@id=\":R6kd9dalamt2mm:\"] "), "Barcelona");
        waitXMills(1000);
        click(By.xpath("//button[@aria-label=\"Buscar\"]"));

        click(By.xpath("//button[@class='Tabs__ListElement-sc-1ccox8g-5 gEieye'])"));
        click(By.xpath("//h5[.='Más rápido'])"));



    }
}
