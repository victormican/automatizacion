package seleniumgluecode;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test {
    private ChromeDriver driver = hooks.getDriver();

    @Given("El usuario se encuentra en la pagina login")
    public void el_usuario_se_encuentra_en_la_pagina_login() {
        String tittlehome = "Bienvenido a nuestra tienda de mascotas!";
    }
    @When("rellena la informacion")
    public void rellena_la_informacion() {

        driver.findElement(By.id("username")).sendKeys("adminbog");
        driver.findElement(By.id("password")).sendKeys("123");
        driver.findElement(By.id("submitButton")).click();

    }

    @Then("Se debe enviar la informacion")
    public void se_debe_enviar_la_informacion() {
    }

    @Given("El usuario se encuentra en la pagina de cliente")
    public void el_usuario_se_encuentra_en_la_pagina_de_cliente() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.cssSelector(".container > div:nth-child(2) > div:nth-child(1) > button:nth-child(1)")).click();
    }
    @And("rellena la informacion cliente")
    public void rellena_la_informacion_cliente() {        // Write code here that turns the phrase above into concrete actions

        driver.findElement(By.cssSelector(".row:nth-child(2) .btn")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".row:nth-child(2) .btn"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.cssSelector(".p-menuitem:nth-child(1) .p-menuitem-text")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".p-menuitem:nth-child(1) .p-menuitem-text"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.cssSelector("#id")).click();
        driver.findElement(By.cssSelector("#id")).sendKeys("1014");
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("victor");
        driver.findElement(By.id("address")).sendKeys("calle123");
        driver.findElement(By.id("phone")).sendKeys("876352");
        driver.findElement(By.id("email")).sendKeys("prueba@prueba.com");
        driver.findElement(By.cssSelector(".p-button:nth-child(2)")).click();

        //driver.findElement(By.cssSelector(".row:nth-child(2) .btn")).click();
        //driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        //driver.findElement(By.cssSelector(".container > div:nth-child(2) > div:nth-child(1) > button:nth-child(1)")).click();
        //driver.findElement(By.cssSelector(".p-menuitem:nth-child(1) .p-menuitem-text")).click();
        //driver.findElement(By.cssSelector(".p-menuitem:nth-child(1) .p-menuitem-text")).click();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElement(By.cssSelector("#id")).click();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElement(By.cssSelector("#id")).sendKeys("1013");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElement(By.id("username")).sendKeys("prueba2");
        //driver.findElement(By.id("address")).sendKeys("Calle falsa 1234");
        //driver.findElement(By.id("phone")).sendKeys("1234");
        //driver.findElement(By.id("email")).sendKeys("prueba1@prueba.com");

    }
    @Then("Se debe enviar la informacion cliente")
    public void se_debe_enviar_la_informacion_cliente() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Given("El usuario se encuentra en la pagina de Venta")
    public void el_usuario_se_encuentra_en_la_pagina_de_venta() {
        // Write code here that turns the phrase above into concrete actions

    }
    @And("rellena la informacion de venta")
    public void rellena_la_informacion_de_venta() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
        driver.findElement(By.id("inputCedula")).click();
        driver.findElement(By.id("inputCedula")).sendKeys("1013");
        driver.findElement(By.cssSelector(".btn-secondary")).click();
        driver.findElement(By.cssSelector(".form-group:nth-child(2) .p-dropdown")).click();
        driver.findElement(By.cssSelector(".p-dropdown-item:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".form-group:nth-child(2) > .col-3:nth-child(2) > .form-control")).click();
        driver.findElement(By.cssSelector(".form-group:nth-child(2) > .col-3:nth-child(2) > .form-control")).sendKeys("1");
        driver.findElement(By.cssSelector(".form-group:nth-child(3) > .col-3 > .p-dropdown")).click();
        driver.findElement(By.cssSelector(".p-dropdown-item:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".form-group:nth-child(3) > .col-3:nth-child(2) > .form-control")).click();
        driver.findElement(By.cssSelector(".form-group:nth-child(3) > .col-3:nth-child(2) > .form-control")).sendKeys("1");
        driver.findElement(By.cssSelector(".p-dropdown-trigger:nth-child(4)")).click();
        driver.findElement(By.cssSelector(".p-dropdown-item:nth-child(4)")).click();
        driver.findElement(By.cssSelector(".form-group:nth-child(4) > .col-3:nth-child(2) > .form-control")).click();
        driver.findElement(By.cssSelector(".form-group:nth-child(4) > .col-3:nth-child(2) > .form-control")).sendKeys("1");
        driver.findElement(By.cssSelector(".btn-primary")).click();

    }
    @Then("Se debe enviar la informacion de venta")
    public void se_debe_enviar_la_informacion_de_venta() {
    }

}