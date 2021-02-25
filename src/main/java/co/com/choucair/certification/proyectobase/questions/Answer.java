package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.userinterface.SingUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Value;

public class Answer implements Question<Boolean> {

    public Answer() {
    }

    public static Answer toThe(){
        return new Answer();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result = false;
        String mensajeAlerta ="There are 8 errors";
        String alerta = Text.of(SingUpPage.ALERTA).viewedBy(actor).asString();

        String[] numero_alerta = alerta.split("\\n");
        System. out. println(numero_alerta[0]);
        if (mensajeAlerta.equals(numero_alerta[0])){
            result = true;
        }
        return result;
    }

}
