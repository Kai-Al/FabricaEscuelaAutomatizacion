package co.edu.udea.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.edu.udea.certification.userinterfaces.UsuarioPage.*;


public class IsSuccessfulOperation implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String stringTemporal = actor.asksFor(Text.of(TV_CREATEUNIT_SENT).asString());
        System.out.println(stringTemporal+"*******************************");
        return stringTemporal.contains("Operaci") && stringTemporal.contains("n exitosa");
    }

    public static IsSuccessfulOperation verify(){
        return new IsSuccessfulOperation();
    }
}
