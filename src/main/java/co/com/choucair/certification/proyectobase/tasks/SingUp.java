package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.SingUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

public class SingUp implements Task{

    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;
    private String strPassword;
    private String strCity;
    private String strZip;
    private String strAddress;
    private String strState;
    private String strPhoneMobile;
    private String strTitle;
    private String strAddress2;
    private String strAditInfor;
    private String strHomePhone;
    private String strCompania;
    private Boolean vacio = false;
    private Integer metodo = 0;


    public SingUp(String strFirstName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strPassword, String strCity, String strZip, String strAddress,String strState,String strPhoneMobile,Integer metodo )
    {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strPassword = strPassword;
        this.strCity= strCity;
        this.strZip = strZip;
        this.strAddress= strAddress;
        this.strState= strState;
        this.strPhoneMobile= strPhoneMobile;
        this.metodo= metodo;
    }
    public SingUp(String strFirstName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strPassword, String strCity, String strZip, String strAddress,String strState,String strPhoneMobile, String strTitle,String strAddress2,String strAditInfor,String strHomePhone,String strCompania,Integer metodo )
    {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strPassword = strPassword;
        this.strCity= strCity;
        this.strZip = strZip;
        this.strAddress= strAddress;
        this.strState= strState;
        this.strPhoneMobile= strPhoneMobile;
        this.strTitle = strTitle;
        this.strAddress2 = strAddress2;
        this.strAditInfor= strAditInfor;
        this.strHomePhone=strHomePhone;
        this.strCompania= strCompania;
        this.metodo= metodo;
    }
    public SingUp(String strEmail)
    {
        this.strEmail = strEmail;

    }

    public static SingUp the(String strFirstName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strPassword, String strCity, String strZip, String strAddress,String strState,String strPhoneMobile,Integer metodo ){
        return Tasks.instrumented(SingUp.class,strFirstName,strLastName,strEmail,strMonth,strDay,strYear,strPassword,strCity,strZip,strAddress,strState,strPhoneMobile,metodo);
    }
    public static SingUp the(String strFirstName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strPassword, String strCity, String strZip, String strAddress,String strState,String strPhoneMobile,
                              String strTitle,String strAddress2, String strAditInfor,String strHomePhone,String strCompania,Integer metodo){
        return Tasks.instrumented(SingUp.class,strFirstName,strLastName,strEmail,strMonth,strDay,strYear,strPassword,strCity,strZip,strAddress,strState,strPhoneMobile,strTitle,strAddress2,strAditInfor,strHomePhone,strCompania,metodo);
    }

    public static Performable the() {
        return Tasks.instrumented(SingUp.class);
    }

    public static Performable the(String strEmail) {
        return Tasks.instrumented(SingUp.class,strEmail);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        if(this.metodo==1) {
            registroCorto(actor);
        } else if(this.metodo==2)
            {
            registroLargo(actor);
        }
        else{
            registroSinDatos(actor);
        }
    }

    private <T extends Actor> void registroSinDatos(T actor) {
        actor.attemptsTo(
                Enter.theValue(strEmail).into(SingUpPage.INPUT_EMAIL),
                Click.on(SingUpPage.BUTTON_CREATE_ACCOUNT),
                Click.on(SingUpPage.BUTTON_REGISTER)
        );
    }


    private <T extends Actor> void registroCorto(T actor) {
        actor.attemptsTo(
                Enter.theValue(strEmail).into(SingUpPage.INPUT_EMAIL),
                Click.on(SingUpPage.BUTTON_CREATE_ACCOUNT),
                Enter.theValue(strFirstName).into(SingUpPage.INPUT_FIRST_NAME) ,
                Enter.theValue(strLastName).into(SingUpPage.INPUT_LAST_NAME),
                Enter.theValue(strPassword).into(SingUpPage.INPUT_PASSWORD),
                SelectFromOptions.byValue(strDay).from(SingUpPage.INPUT_DAY),
                SelectFromOptions.byValue(strMonth).from(SingUpPage.INPUT_MONTH),
                SelectFromOptions.byValue(strYear).from(SingUpPage.INPUT_YEAR),
                Enter.theValue(strAddress).into(SingUpPage.ADDRESS),
                Enter.theValue(strCity).into(SingUpPage.INPUT_CITY),
                SelectFromOptions.byValue(strState).from(SingUpPage.STATE),
                Enter.theValue(strZip).into(SingUpPage.INPUT_ZIP),
                Enter.theValue(strPhoneMobile).into(SingUpPage.PHONE_MOBILE),
                Click.on(SingUpPage.BUTTON_REGISTER)
        );
    }


    private <T extends Actor> void registroLargo(T actor) {

        actor.attemptsTo(
                Enter.theValue(strEmail).into(SingUpPage.INPUT_EMAIL),
                Click.on(SingUpPage.BUTTON_CREATE_ACCOUNT),
                Enter.theValue(strFirstName).into(SingUpPage.INPUT_FIRST_NAME) ,
                Enter.theValue(strLastName).into(SingUpPage.INPUT_LAST_NAME),
                Enter.theValue(strPassword).into(SingUpPage.INPUT_PASSWORD),
                Enter.theValue(strCompania).into(SingUpPage.INPUT_COMPANIA),
                SelectFromOptions.byValue(strDay).from(SingUpPage.INPUT_DAY),
                SelectFromOptions.byValue(strMonth).from(SingUpPage.INPUT_MONTH),
                SelectFromOptions.byValue(strYear).from(SingUpPage.INPUT_YEAR),
                Enter.theValue(strAddress).into(SingUpPage.ADDRESS),
                Enter.theValue(strAddress2).into(SingUpPage.INPUT_ADDRESS2),
                Enter.theValue(strCity).into(SingUpPage.INPUT_CITY),
                SelectFromOptions.byValue(strState).from(SingUpPage.STATE),
                Enter.theValue(strZip).into(SingUpPage.INPUT_ZIP),
                Enter.theValue(strAditInfor).into(SingUpPage.INPUT_ADDIT_INFO),
                Enter.theValue(strHomePhone).into(SingUpPage.INPUT_HOME_PHONE),
                Enter.theValue(strPhoneMobile).into(SingUpPage.PHONE_MOBILE)
        );
        genero(actor);
        actor.attemptsTo(Click.on(SingUpPage.BUTTON_REGISTER));
    }

    private <T extends Actor> void genero(T actor) {
        if(strTitle.equals("Mr")){
            actor.attemptsTo( Click.on(SingUpPage.TITLE_MR));
        }else{
            actor.attemptsTo( Click.on(SingUpPage.TITLE_MRs));
        }
    }



}
