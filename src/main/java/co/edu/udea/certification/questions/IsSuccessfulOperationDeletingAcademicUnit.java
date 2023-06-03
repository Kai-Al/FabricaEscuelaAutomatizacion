package co.edu.udea.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.edu.udea.certification.userinterfaces.UsuarioPage.TV_CREATEUNIT_SENT;
import static co.edu.udea.certification.userinterfaces.UsuarioPage.TV_UNITS_A_U;


public class IsSuccessfulOperationDeletingAcademicUnit implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String stringTemporal = actor.asksFor(Text.of(TV_UNITS_A_U).asString());
        System.out.println(stringTemporal+"*******************************");
        return stringTemporal.contains("Unidades Acad") && stringTemporal.contains("micas");
    }

    public static IsSuccessfulOperationDeletingAcademicUnit verify(){
        return new IsSuccessfulOperationDeletingAcademicUnit();
    }
}
