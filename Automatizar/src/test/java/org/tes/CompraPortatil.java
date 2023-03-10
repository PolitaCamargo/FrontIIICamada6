package compras.tes;

import org.openqa.selenium.WebDriver;
import compras.pages.Portatiles;

public class CompraPortatil {

    WebDriver driver ;

    public CompraPortatil(WebDriver driver) {
        this.driver = driver;
    }

    Portatiles portatil = new Portatiles(driver);

    public void agregarCompra(){

        portatil.Comprar();

    }




}
