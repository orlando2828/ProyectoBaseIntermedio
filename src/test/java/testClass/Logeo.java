package testClass;

import org.openqa.selenium.WebDriver;
import page.CargaInformacion;
import page.Login;

public class Logeo {

    private Login login;
    private CargaInformacion cargaInformacion;

   // WebDriver webDriver; se eliminan los WebDriver tb en public Logeo


    public Logeo(){

    }
//se eliminan los webDriver de Login y CargaInformación
        public void CasoLogin(String usuario, String clave){
        login = new Login();
        cargaInformacion = new CargaInformacion();
        login.ingresarUsuario(usuario);
        login.ingresarClave(clave);
        login.clickBtnIngresar();
        cargaInformacion.recuperarTitulo();
        cargaInformacion.rellenarCampoTexto("Prueba Testeo");
        cargaInformacion.rellenarCampoMail("prueba@gmail.com");
        cargaInformacion.rellenarCampoAreaTexto("ljsdlsdj");
        cargaInformacion.rellenarCampoFecha("02/02/2023");
        cargaInformacion.rellenarCampoLista("valor 2");
        cargaInformacion.seleccionMultiple2("1,2,3");
        cargaInformacion.comboRadio(2);
        cargaInformacion.clickBtnEnviar();




        }





}
