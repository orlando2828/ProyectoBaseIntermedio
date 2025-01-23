package testSuite;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testClass.Logeo;

public class Ejecuciones {

    ChromeDriver webDriver;


    String url = "https://qanovagroup.com/piloto";

    @BeforeTest
    //levante browser básico
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "driverNavegador/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get(url);
    }

    @AfterTest
    public void closeDriver() {

    }

    @Test
    public void LogeoPagina() {
        Logeo logeo = new Logeo(webDriver);
        logeo.CasoLogin("nvivas","qanova");


    }


}

