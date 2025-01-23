package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    @FindBy(xpath = "//*[@name=\"imUname\"]")
    WebElement inputUsuario;

    @FindBy(xpath = "//*[@id=\"imPwd\"]")
    WebElement inputClave;

    @FindBy(xpath = "//*[@id=\"imLogin\"]/form/div[3]/input")
    WebElement btnIngresar;

   // @FindBy(xpath = "//*[@id=\"imLogin\"]/form/div[1]/label")
   // WebElement labelUsuario;

   WebDriver webDriver;
   WebDriverWait webDriverWait;

   public Login(WebDriver webDriver){
       PageFactory.initElements(webDriver, this);
       this.webDriverWait = new WebDriverWait(webDriver, 30);

   }

   public void ingresarUsuario(String usuario){
       webDriverWait.until(ExpectedConditions.visibilityOf(inputUsuario));
       inputUsuario.sendKeys(usuario);

   }
   public void ingresarClave(String clave){
       inputClave.sendKeys(clave);

   }

   public void clickBtnIngresar(){
       btnIngresar.click();
   }



}


