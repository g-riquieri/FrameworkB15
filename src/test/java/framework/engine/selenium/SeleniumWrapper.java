package framework.engine.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SeleniumWrapper {

    protected WebDriver driver;
    protected WebDriverWait wait;

    //Constructor Base
    public SeleniumWrapper(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
    }

    //Wrappers Selenium
    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findElements (By locator){
        return driver.findElements(locator);
    }

    public String getText (By locator){
        return driver.findElement(locator).getText();
    }

    public void write(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }
    public void sendKeys(Keys key, By locator){
        driver.findElement(locator).sendKeys(key);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public Boolean isDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
    public Boolean isEnabled(By locator) {
        try {
            return driver.findElement(locator).isEnabled();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public Boolean isSelected(By locator) {
        try {
            return driver.findElement(locator).isSelected();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public void navigateTo(String url){
        driver.navigate().to(url);
    }

    public String getUrlTitle(){
        return driver.getTitle();
    }

    //Personalized Functions

    //Functions

    public static WebDriver setupDriver(String browser){
        WebDriver driver;
        switch (browser.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Navegador no soportado: " + browser);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;
    }

    public void loadPage(String url){
        this.driver.get(url);
    }

    public WebElement explicitWait(By locator, int seg){
        wait = new WebDriverWait(this.driver,seg);
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void waitXMills(int mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickRejectAll() {
        try {
            // Localizar el botón "Rechazar" usando su clase
            By rejectButtonSelector = By.cssSelector(".iubenda-cs-reject-btn");

            // Esperar a que el botón sea visible y clickeable
            WebElement rejectButton = wait.until(ExpectedConditions.elementToBeClickable(rejectButtonSelector));

            // Hacer clic en el botón
            rejectButton.click();

            System.out.println("Se hizo clic en el botón 'Rechazar todo' correctamente.");
        } catch (Exception e) {
            System.err.println("Error al hacer clic en el botón 'Rechazar todo': " + e.getMessage());
        }
    }

    public WebElement lookForElement (By locator){
        return this.driver.findElement(locator);
    }

    public void click (WebElement element){
        element.click();
    }//Hace click en un elemento

    public void watXMills(int mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void  sendText(By locator, String texto){
        this.driver.findElement(locator).sendKeys(texto);
    }
    public void setAriaActiveDescendant(By elementLocator, String newValue) {
        try {
            WebElement element = driver.findElement(elementLocator);

            // Usar JavaScript para modificar el atributo 'aria-activedescendant'
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript(
                    "arguments[0].setAttribute('aria-activedescendant', arguments[1]);",
                    element,
                    newValue
            );

            System.out.println("Atributo 'aria-activedescendant' modificado correctamente.");
        } catch (Exception e) {
            System.err.println("Error al modificar 'aria-activedescendant': " + e.getMessage());
        }
    }

    public void closeDriver(){
        if (driver != null){
            driver.quit();
        }
    }

    // Función para cerrar completamente el navegador
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
            System.out.println("El navegador se ha cerrado completamente.");
        } else {
            System.out.println("No hay un navegador activo para cerrar.");
        }
    }


    public void clearCacheUsingKeyboardShortcut() {
        try {
            // Enviar combinación de teclas para abrir la página de borrar caché
            driver.get("chrome://settings/clearBrowserData");
            Thread.sleep(2000); // Esperar que cargue la página

            // Simular ENTER para confirmar limpieza de caché
            driver.findElement(By.tagName("body")).sendKeys(Keys.ENTER);
            Thread.sleep(2000); // Esperar que se complete el proceso

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public WebElement waitForElement(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void switchToNewTabAndCloseOld() {
        try {
            // Obtiene el identificador de la pestaña original
            String originalTab = driver.getWindowHandle();

            // Obtiene todos los identificadores de las pestañas abiertas
            Set<String> allTabs = driver.getWindowHandles();

            // Cambia el controlador a la nueva pestaña
            for (String tab : allTabs) {
                if (!tab.equals(originalTab)) {
                    driver.switchTo().window(tab);
                    System.out.println("Cambiado a la nueva pestaña: " + driver.getTitle());
                    break;
                }
            }

            // Cierra la pestaña original
            driver.switchTo().window(originalTab).close();

            // Cambia el controlador de vuelta a la nueva pestaña (asegura que sigue activa)
            allTabs = driver.getWindowHandles();
            if (!allTabs.isEmpty()) {
                driver.switchTo().window(allTabs.iterator().next());
            }

            System.out.println("Título de la pestaña activa después de cerrar la anterior: " + driver.getTitle());
        } catch (Exception e) {
            System.err.println("Error al cambiar a la nueva pestaña y cerrar la anterior: " + e.getMessage());
        }
    }

       public void scrollToElementAndClick(By by, int timeoutInSeconds) {
        try {
            // Espera explícita hasta que el elemento esté presente y clickeable
            WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));

            // Desplazar hasta el elemento
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", element);

            // Clic en el elemento
            element.click();

            System.out.println("Click realizado en el elemento: " + by.toString());
        } catch (Exception e) {
            System.err.println("Error al hacer clic en el elemento: " + by.toString() + " - " + e.getMessage());
        }
    }

    public void scrollDown(int pixels) {
        try {
            // Usa JavascriptExecutor para ejecutar el desplazamiento
            JavascriptExecutor js = (JavascriptExecutor) driver;

            // Realiza el scroll hacia abajo
            js.executeScript("window.scrollBy(0," + pixels + ");");

            System.out.println("Se realizó el scroll hacia abajo: " + pixels + " píxeles.");
        } catch (Exception e) {
            System.err.println("Error al realizar el scroll: " + e.getMessage());
        }
    }
}
