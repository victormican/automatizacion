package seleniumgluecode;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class hooks {
    private static ChromeDriver driver;
    private static int numberofcase=0;


    @Before
    public void setUP(){
        numberofcase++;
        System.out.println("Se esta ejecutando el escenario numero: "+ numberofcase );
        System.setProperty("webdriver.chrome.driver","./src/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://petter.eastus2.cloudapp.azure.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        System.out.println("El escenario numero: "+ numberofcase + " se ejecuto correctamente.");

    }
    public static ChromeDriver getDriver(){
        return driver;
    }

}
