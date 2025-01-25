package testSuite;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testClass.Logeo;
import utils.Constants.Navegador;
import utils.DriverContext;
import utils.Reporte.PdfQaNovaReports;

public class Ejecuciones {

    ChromeDriver webDriver;


    String url = "https://qanovagroup.com/piloto";

    @BeforeTest
    //levante browser básico por DriverContext de la carpeta importada utils
    public void setUp() {
       // System.setProperty("webdriver.chrome.driver", "driverNavegador/chromedriver.exe");
        DriverContext.setUp(Navegador.Chrome,url);
        PdfQaNovaReports.createPDF();
        //webDriver = new ChromeDriver();
        //webDriver.get(url);
    }

    @AfterTest
    public void closeDriver() {
    DriverContext.closeDriver(); //se agrega reemplazando el básico
    PdfQaNovaReports.closePDF();
    }

    @Test
    public void LogeoPagina() {
        Logeo logeo = new Logeo();
        logeo.CasoLogin("nvivas","qanova");


    }


}

