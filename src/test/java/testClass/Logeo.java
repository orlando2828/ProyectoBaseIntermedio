package testClass;

import org.openqa.selenium.WebDriver;
import page.Login;

public class Logeo {

    private Login login;


        public void CasoLogin(WebDriver webDriver){
        login = new Login(webDriver);
        login.ingresarUsuario("nvivas");
        login.ingresarClave("qanova");
        login.clickBtnIngresar();


        }





}
