package mercuritours;

import mercuritours.drivers.pages.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Prueba {

    private WebDriver driver;
    Login Usuario  =new Login(driver);

   public void Stup () {

       System.setProperty("webdriver.chrome.driver", "C:\\Users\\polis\\Documents\\2021\\com.demo\\src\\Drivers\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.navigate().to("http://demo.guru99.com/test/newtours/index.php");
       driver.manage().window().maximize();

   }

    public void Login_1(){

       Usuario.completarUsuario("paola@gmail.com");
       Usuario.completarPassword("paola");
       Usuario.getvalidarMensaje();
    }


}
