package org.mercury;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

    public class RegistroUsuario {

        private  WebDriver driver;
        //Información de contacto
        private WebElement imputPrimerNombre = driver.findElement(By.name("firstName"));
        private WebElement inputPrimerApellido = driver.findElement(By.name("lastName"));
        private WebElement inputTelefono = driver.findElement(By.name("phone"));
        private WebElement inputCorreo = driver.findElement(By.name("userName"));
        //Mailing Information
        private WebElement inputDireccion = driver.findElement(By.name("address1"));
        private WebElement ciudadResidencia= driver.findElement(By.name("city"));
        private WebElement estadoPais = driver.findElement(By.name("state"));
        private WebElement codigoPostal= driver.findElement(By.name("postalCode"));
        private WebElement paisVivienda = driver.findElement(By.name("country"));
        //Información de usuario
        private  WebElement inputUsuario = driver.findElement(By.id("email"));
        private  WebElement inputClave = driver.findElement(By.name("password"));;
        private  WebElement inputconfirmarClave = driver.findElement(By.name("confirmPassword"));;
        private  WebElement  btnEnviar= driver.findElement(By.name("submit"));;


        public RegistroUsuario(WebElement imputPrimerNombre,
                               WebElement inputPrimerApellido,
                               WebElement inputTelefono,
                               WebElement inputCorreo,
                               WebElement inputDireccion,
                               WebElement ciudadResidencia,
                               WebElement estadoPais,
                               WebElement codigoPostal,
                               WebElement paisVivienda,
                               WebElement inputUsuario,
                               WebElement inputClave,
                               WebElement inputconfirmarClave,
                               WebElement btnEnviar) {
            this.imputPrimerNombre = imputPrimerNombre;
            this.inputPrimerApellido = inputPrimerApellido;
            this.inputTelefono = inputTelefono;
            this.inputCorreo = inputCorreo;
            this.inputDireccion = inputDireccion;
            this.ciudadResidencia = ciudadResidencia;
            this.estadoPais = estadoPais;
            this.codigoPostal = codigoPostal;
            this.paisVivienda = paisVivienda;
            this.inputUsuario = inputUsuario;
            this.inputClave = inputClave;
            this.inputconfirmarClave = inputconfirmarClave;
            this.btnEnviar = btnEnviar;
        }

        public RegistroUsuario() {
        }

        public WebDriver getDriver() {
            return driver;
        }

        public WebElement getImputPrimerNombre() {
            return imputPrimerNombre;
        }

        public WebElement getInputPrimerApellido() {
            return inputPrimerApellido;
        }

        public WebElement getInputTelefono() {
            return inputTelefono;
        }

        public WebElement getInputCorreo() {
            return inputCorreo;
        }

        public WebElement getInputDireccion() {
            return inputDireccion;
        }

        public WebElement getCiudadResidencia() {
            return ciudadResidencia;
        }

        public WebElement getEstadoPais() {
            return estadoPais;
        }

        public WebElement getCodigoPostal() {
            return codigoPostal;
        }

        public WebElement getPaisVivienda() {
            return paisVivienda;
        }

        public WebElement getInputUsuario() {
            return inputUsuario;
        }

        public WebElement getInputClave() {
            return inputClave;
        }

        public WebElement getInputconfirmarClave() {
            return inputconfirmarClave;
        }

        public WebElement getBtnEnviar() {
            return btnEnviar;
        }

        public void setDriver(WebDriver driver) {
            this.driver = driver;
        }

        public void setImputPrimerNombre(WebElement imputPrimerNombre) {
            this.imputPrimerNombre = imputPrimerNombre;
        }

        public void setInputPrimerApellido(WebElement inputPrimerApellido) {
            this.inputPrimerApellido = inputPrimerApellido;
        }

        public void setInputTelefono(WebElement inputTelefono) {
            this.inputTelefono = inputTelefono;
        }

        public void setInputCorreo(WebElement inputCorreo) {
            this.inputCorreo = inputCorreo;
        }

        public void setInputDireccion(WebElement inputDireccion) {
            this.inputDireccion = inputDireccion;
        }

        public void setCiudadResidencia(WebElement ciudadResidencia) {
            this.ciudadResidencia = ciudadResidencia;
        }

        public void setEstadoPais(WebElement estadoPais) {
            this.estadoPais = estadoPais;
        }

        public void setCodigoPostal(WebElement codigoPostal) {
            this.codigoPostal = codigoPostal;
        }

        public void setPaisVivienda(WebElement paisVivienda) {
            this.paisVivienda = paisVivienda;
        }

        public void setInputUsuario(WebElement inputUsuario) {
            this.inputUsuario = inputUsuario;
        }

        public void setInputClave(WebElement inputClave) {
            this.inputClave = inputClave;
        }

        public void setInputconfirmarClave(WebElement inputconfirmarClave) {
            this.inputconfirmarClave = inputconfirmarClave;
        }

        public void setBtnEnviar(WebElement btnEnviar) {
            this.btnEnviar = btnEnviar;
        }
    }

