package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SingUpPage {

 public static final Target INPUT_EMAIL = Target.the("Donde escribimos el correo ").located(By.id("email_create"));
 public static final Target BUTTON_CREATE_ACCOUNT = Target.the("Da en crear cuenta ").located(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button/span"));
 //Registro datos personales
 public static final Target INPUT_FIRST_NAME = Target.the("Donde escribimos el nombre").located(By.id("customer_firstname"));
 public static final Target INPUT_LAST_NAME = Target.the("Donde escribimos el apellido").located(By.id("customer_lastname"));
 public static final Target INPUT_PASSWORD = Target.the("Donde escribimos la contraseña").located(By.id("passwd"));
 // public static final Target INPUT_EMAIL = Target.the("Donde escribimos el correo ").located(By.id("email"));
 public static final Target INPUT_MONTH = Target.the("Donde se escoge el mes de cumpleaños").located(By.id("months"));
 public static final Target INPUT_DAY = Target.the("Donde se escoge el dia de cumpleaños").located(By.id("days"));
 public static final Target INPUT_YEAR = Target.the("Donde se escoge el año de cumpleaños").located(By.id("years"));
 public static final Target ADDRESS = Target.the("Donde escribimos la direccion ").located(By.id("address1"));
 //Registro de dirreccion
 public static final Target INPUT_CITY = Target.the("Donde escribimos la ciudad").located(By.id("city"));
 public static final Target STATE = Target.the("Donde se escoge el estado ").located(By.id("id_state"));
 public static final Target INPUT_ZIP = Target.the("Donde escribimos la ciudad").located(By.id("postcode"));

 //Registro de Dispositivo
 public static final Target PHONE_MOBILE = Target.the("Donde escribimos el numero de telefono").located(By.id("phone_mobile"));
 public static final Target BUTTON_REGISTER = Target.the("Da click en el boton registrar").located(By.id("submitAccount"));
 public static final Target TITLE_MR = Target.the("Chekea el radio button Mr").located(By.id("id_gender1"));
 public static final Target TITLE_MRs = Target.the("Chekea el radio button Mrs").located(By.id("id_gender2"));
 public static final Target INPUT_COMPANIA = Target.the("Donde se escribe e nombre d ela compañia").located(By.id("company"));
 public static final Target INPUT_ADDRESS2 = Target.the("Donde se escribe una segunda direccion").located(By.id("address2"));
 public static final Target INPUT_ADDIT_INFO = Target.the("Donde se escribe informacion adicional").located(By.id("other"));
 public static final Target INPUT_HOME_PHONE = Target.the("Donde se pone el telefono del hogar").located(By.id("phone"));

 public static final Target ALERTA = Target.the("Donde aparece la alerta de campos requeridos").located(By.xpath("//*[@id=\"center_column\"]/div"));

}
