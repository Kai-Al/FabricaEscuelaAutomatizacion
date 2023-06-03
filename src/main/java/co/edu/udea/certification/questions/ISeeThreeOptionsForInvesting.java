package co.edu.udea.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.edu.udea.certification.userinterfaces.UsuarioPage.TEXT_VALIDATION;
import static co.edu.udea.certification.userinterfaces.UsuarioPage.TEXT_VALIDATION_I_AM_IN_CONSUMER_LOANS_PAGE;

public class ISeeThreeOptionsForInvesting implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String stringTemporal = actor.asksFor(Text.of(TEXT_VALIDATION).asString());
        return stringTemporal.contains("Te ofrecemos estas opciones para C");
    }
    public static ISeeThreeOptionsForInvesting verify(){
        return new ISeeThreeOptionsForInvesting();
    }
}
