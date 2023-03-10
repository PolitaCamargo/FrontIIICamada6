package compras.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Portatiles {

    WebDriver driver ;

    public Portatiles(WebDriver driver) {
        this.driver = driver;
    }

    public void  Comprar(){

        WebElement sonyVaioI5 = driver.findElement(By.partialLinkText("Sony vaio i5"));
        WebElement  agregarCarrito = driver.findElement(By.className("btn btn-success btn-lg"));
        sonyVaioI5.click();
        agregarCarrito.click();

    }

}
